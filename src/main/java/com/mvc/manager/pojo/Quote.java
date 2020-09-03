package com.mvc.manager.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This
 *
 * @author Nuh Emrah Seren
 * @version 1.0
 * @since 9/4/2020
 */


@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private String type;
    private Value value;

    public Quote() {
    }

    public Quote(String type, Value value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}