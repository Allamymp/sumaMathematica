package org.portfolio.studycontrol.enums;

import lombok.Getter;

@Getter
public enum Division {

    FUNDAMENTAL_AREA("Fundamental Area"),
    ADVANCED_TOPICS("Advanced Topics"),
    STATISTICS("Statistics"),
    PROBABILITY("Probability"),
    APPLIED_MATHEMATICS("Applied Mathematics"),
    ADVANCED_GEOMETRY("Advanced Geometry"),
    ADVANCED_ALGEBRA("Advanced Algebra"),
    MATHEMATICAL_LOGIC("Mathematical Logic");

    private final String text;


    Division(String s) {
        this.text=s;
    }
}
