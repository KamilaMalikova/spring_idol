package com.example.spring_try.models.impl;

import com.example.spring_try.models.Thinker;

public class Volunteer implements Thinker {
    private String thoughts;

    @Override
    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
