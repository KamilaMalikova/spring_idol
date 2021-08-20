package com.example.spring_try.models.extra.impl;

import com.example.spring_try.models.extra.Instrument;

public class Saxophone implements Instrument {
    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT");
    }
}
