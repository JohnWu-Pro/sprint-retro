package org.wjh.sprint.retro.model;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Aggregation implements Serializable {

    private static final long serialVersionUID = -3861541787491736409L;

    private final List<String> wentWellItems = new CopyOnWriteArrayList<String>();
    private final List<String> toBeImprovedItems = new CopyOnWriteArrayList<String>();
    private final List<String> suggestionItems = new CopyOnWriteArrayList<String>();
    private final List<String> uncategorizableItems = new CopyOnWriteArrayList<String>();

    public List<String> getWentWellItems() {
        return wentWellItems;
    }

    public List<String> getToBeImprovedItems() {
        return toBeImprovedItems;
    }

    public List<String> getSuggestionItems() {
        return suggestionItems;
    }

    public List<String> getUncategorizableItems() {
        return uncategorizableItems;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)// @formatter:off
                .append("wentWellItems", getWentWellItems())
                .append("toBeImprovedItems", getToBeImprovedItems())
                .append("suggestionItems", getSuggestionItems())
                .append("uncategorizableItems", getUncategorizableItems())
                .toString();// @formatter:on
    }

}
