package com.leanderziehm.math_web_app.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Operator{
    TIMES("*"),
    DIVISION("/"),
    PLUS("+"),
    MINUS("-");

    private String description;

    Operator(String description) {
        this.description = description;
    }
    
    @JsonValue
    public String getDescription() {
        return description;
    }

}


