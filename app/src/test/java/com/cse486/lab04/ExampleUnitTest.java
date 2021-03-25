package com.cse486.lab04;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {

    private Calculator mCalculator;

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void addTwoNumbersNegative() {
        double resultAdd = mCalculator.add(-1d, 2d);
    }
}
