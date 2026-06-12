package com.bridge.training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {

        assertEquals(15,
                calculator.add(10,5));
                calculator.add(0,5));
    }

    @Test
    void testSub() {

        assertEquals(5,
                calculator.sub(10,5));
    }
}