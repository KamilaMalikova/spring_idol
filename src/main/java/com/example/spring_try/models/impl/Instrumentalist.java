package com.example.spring_try.models.impl;

import com.example.spring_try.annotations.StringedInstrument;
import com.example.spring_try.annotations.Strummed;
import com.example.spring_try.exceptions.PerformanceException;
import com.example.spring_try.models.Performer;
import com.example.spring_try.models.extra.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class Instrumentalist implements Performer {
    @Autowired
    @StringedInstrument
    @Strummed
    private Instrument instrument;
    private String song;

    public Instrumentalist() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

    public String getSong() {
        return song;
    }

    public String screamSong() {
        return song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void setSong(String song) {
        this.song = song;
    }
}
