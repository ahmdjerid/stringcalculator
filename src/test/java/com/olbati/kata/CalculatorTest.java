package com.olbati.kata;


import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void should_return_zero_empty_input() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.run("");
        //then
        Assert.assertEquals(0, result);

    }

}
