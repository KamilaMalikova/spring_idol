package com.example.spring_try.models;

import com.example.spring_try.exceptions.PerformanceException;

public interface Performer {
    void perform() throws PerformanceException;
}
