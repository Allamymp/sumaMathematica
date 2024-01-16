package org.portfolio.studycontrol.model.entities.enums;

import lombok.Getter;
@Getter
public enum DificultType {

    EASY("Easy"),
    NORMAL("Normal"),
    HARD("Hard"),
    VERY_HARD("Very hard");

    private String text;
    DificultType(String s) {
        this.text=s;
    }
}
