package com.tw.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberTest {
    private Number number = new Number("1234");

    @Test
    public void shouldReturn4A0BWhenInputSameNumber() throws Exception {
        String compareResult = number.compare("1234");
        assertEquals("4A0B", compareResult);
    }

    @Test
    public void shouldReturn0A0BWhenInputDifferentNumber() throws Exception {
        String compareResult = number.compare("5678");
        assertEquals("0A0B", compareResult);
    }

    @Test
    public void shouldReturn0A4BWhenInputSameNumberDifferentPosition() throws Exception {
            String compareResult = number.compare("4321");
            assertEquals("0A4B", compareResult);
    }

    @Test
    public void shouldReturn2A1BWhenInputOrdinaryNumbers() throws Exception {
            String compareResult = number.compare("1245");
            assertEquals("2A1B", compareResult);
    }

}