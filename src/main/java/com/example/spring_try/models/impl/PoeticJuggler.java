package com.example.spring_try.models.impl;

import com.example.spring_try.exceptions.PerformanceException;
import com.example.spring_try.models.extra.Poem;

public class PoeticJuggler extends Juggler {
    private Poem poem;

    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }
    @Override
    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("While reciting");
        poem.recite();
    }
}
