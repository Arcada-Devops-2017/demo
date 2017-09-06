package com.example.demo;

public class TextGetterUnitImpl implements TextGetter{

    private String value;

    public TextGetterUnitImpl(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }
}
