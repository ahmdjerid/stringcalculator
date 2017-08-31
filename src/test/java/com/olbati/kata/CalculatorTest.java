package com.olbati.kata;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void init() {
        calculator = new Calculator();

    }

    @Test
    public void should_return_zero_empty_input() {
        //given
        //when
        int result = calculator.run("");
        //then
        Assert.assertEquals(0, result);

    }

    @Test
    public void should_return_number_existing_number() {
        //given

        //when
        int result = calculator.run("1");
        //then
        Assert.assertEquals(1, result);

    }

    @Test
    public void should_return_sum_of_tow_numbers_with_comma_delimiter() {
        //given

        //when
        int result = calculator.run("1,2");

        //then
        Assert.assertEquals(3, result);
    }


    @Test
    public void should_return_sum_of_tow_numbers_with_other_delimiter() {
        //given
        //when
        int result = calculator.run("1\n2,3");

        //then
        Assert.assertEquals(6, result);

    }


}
