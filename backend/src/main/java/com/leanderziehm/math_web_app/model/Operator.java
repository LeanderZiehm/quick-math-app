package com.leanderziehm.math_web_app.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Operator{
    TIMES("*"),
    DIVISION("/"),
    PLUS("+"),
    MINUS("-");

    private String symbol;

    Operator(String description) {
        this.symbol = description;
    }
    
    @JsonValue
    public String getSymbol() {
        return symbol;
    }
    
    @JsonCreator
    public static Operator fromValue(String value) {
        for (Operator op : values()) {
            if (op.symbol.equals(value)) {
                return op;
            }
        }
        throw new IllegalArgumentException("Unknown operator: " + value);
    }

}


