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
public class Value {

    private Integer id;
    private String quote;

    public Value() {
    }

    public Value(Integer id, String quote) {
        this.id = id;
        this.quote = quote;
    }

    public Integer getId() {
        return id;
    }

    public String getQuote() {
        return quote;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}