package com.lab;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testReversePositiveNumber() {
        assertEquals(54321, App.reverseNumber(12345));
    }

    @Test
    public void testReverseNumberEndingInZero() {
        assertEquals(321, App.reverseNumber(12300));
    }

    @Test
    public void testReverseSingleDigit() {
        assertEquals(7, App.reverseNumber(7));
    }

    @Test
    public void testReverseNegativeNumber() {
        assertEquals(-543, App.reverseNumber(-345));
    }

    @Test
    public void testReverseZero() {
        assertEquals(0, App.reverseNumber(0));
    }
}