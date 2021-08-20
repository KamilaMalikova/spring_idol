package com.example.spring_try.models.extra.impl;

import com.example.spring_try.models.extra.Instrument;

public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("DRUN DRUN DRUN");
    }
}
