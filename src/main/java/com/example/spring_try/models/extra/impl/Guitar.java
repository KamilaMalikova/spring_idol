package com.example.spring_try.models.extra.impl;

import com.example.spring_try.annotations.StringedInstrument;
import com.example.spring_try.annotations.Strummed;
import com.example.spring_try.models.extra.Instrument;
import org.springframework.stereotype.Component;

@Component("guitar")
public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("DRUN DRUN DRUN");
    }
}
