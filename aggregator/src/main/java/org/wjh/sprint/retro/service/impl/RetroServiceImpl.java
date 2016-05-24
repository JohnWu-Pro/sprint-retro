package org.wjh.sprint.retro.service.impl;

import static org.apache.commons.lang3.StringUtils.split;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Named;

import org.wjh.sprint.retro.model.Aggregation;
import org.wjh.sprint.retro.service.RetroService;

@Named("retroService")
public class RetroServiceImpl implements RetroService {

    private static final Pattern PLUS_PATTERN = Pattern.compile("^\\+\\s*(.+)$");
    private static final Pattern MINUS_PATTERN = Pattern.compile("^\\-\\s*(.+)$");
    private static final Pattern ASTERISK_PATTERN = Pattern.compile("^\\*\\s*(.+)$");

    private Aggregation aggregation = new Aggregation();

    @Override
    public void submit(String text) {
        String[] lines = split(text, "\r\n");

        List<String> plusItems = new ArrayList<String>();
        List<String> minusItems = new ArrayList<String>();
        List<String> asteriskItems = new ArrayList<String>();
        List<String> uncatItems = new ArrayList<String>();
        for (String line : lines) {
            line = line.trim();
            if (line.isEmpty()) {
                continue;
            }

            if (matches(PLUS_PATTERN, line, plusItems)) {
                continue;
            } else if (matches(MINUS_PATTERN, line, minusItems)) {
                continue;
            } else if (matches(ASTERISK_PATTERN, line, asteriskItems)) {
                continue;
            } else {
                uncatItems.add(line);
            }
        }

        addAll(aggregation.getWentWellItems(), plusItems);
        addAll(aggregation.getToBeImprovedItems(), minusItems);
        addAll(aggregation.getSuggestionItems(), asteriskItems);
        addAll(aggregation.getUncategorizableItems(), uncatItems);
    }

    private boolean matches(Pattern pattern, String line, List<String> items) {
        Matcher matcher = pattern.matcher(line);
        if (matcher.matches()) {
            items.add(matcher.group(1));
            return true;
        } else {
            return false;
        }
    }

    private void addAll(List<String> all, List<String> addition) {
        if (!addition.isEmpty()) {
            all.addAll(addition);
        }
    }

    @Override
    public void clear() {
        aggregation.getWentWellItems().clear();
        aggregation.getToBeImprovedItems().clear();
        aggregation.getSuggestionItems().clear();
        aggregation.getUncategorizableItems().clear();
    }

    @Override
    public Aggregation getResult() {
        return aggregation;
    }
}
