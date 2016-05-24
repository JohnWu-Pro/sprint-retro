package org.wjh.sprint.retro.service;

import org.wjh.sprint.retro.model.Aggregation;

public interface RetroService {

    void submit(String text);

    void clear();

    Aggregation getResult();
}
