package com.example.spring_try.models.extra.impl;

import com.example.spring_try.models.extra.Instrument;
import org.springframework.stereotype.Component;

@Component
public class Harmonica implements Instrument {
    @Override
    public void play() {
        System.out.println("HARMONICA HARMONICA HARMONICA");
    }
}
