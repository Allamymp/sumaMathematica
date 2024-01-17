package org.portfolio.studycontrol.enums;

import lombok.Getter;
@Getter
public enum DifficultType {

    EASY("Easy"),
    NORMAL("Normal"),
    HARD("Hard"),
    VERY_HARD("Very hard");

    private final String text;
    DifficultType(String s) {
        this.text=s;
    }
}
