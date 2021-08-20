package com.example.spring_try.models.impl;

import com.example.spring_try.exceptions.PerformanceException;
import com.example.spring_try.models.Performer;
import com.example.spring_try.models.extra.Instrument;

import java.util.Map;
import java.util.Properties;

public class OneManBand implements Performer {
    private Map<String, Instrument> instruments;
    private Properties properties;
    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void perform() throws PerformanceException {
        for (String key: instruments.keySet()) {
            System.out.print(key +" : ");
            instruments.get(key).play();
        }
    }
}
