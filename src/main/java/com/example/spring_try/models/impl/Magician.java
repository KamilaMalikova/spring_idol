package com.example.spring_try.models.impl;

import com.example.spring_try.models.MindReader;

public class Magician implements MindReader {
    private String thoughts;
    @Override
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts");
        this.thoughts = thoughts;
    }

    @Override
    public String getThoughts() {
        return thoughts;
    }
}
