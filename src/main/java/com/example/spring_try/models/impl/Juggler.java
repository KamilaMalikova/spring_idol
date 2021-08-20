package com.example.spring_try.models.impl;

import com.example.spring_try.exceptions.PerformanceException;
import com.example.spring_try.models.Performer;

public class Juggler implements Performer {
    private int beanBags = 3;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("JUGGLING "+beanBags + " BEANBAGS");
    }
}
