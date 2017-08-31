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
    public void should_return_zero_empty_input() throws Exception {
        //given
        //when
        int result = calculator.run("");
        //then
        Assert.assertEquals(0, result);

    }

    @Test
    public void should_return_number_existing_number() throws Exception {
        //given

        //when
        int result = calculator.run("1");
        //then
        Assert.assertEquals(1, result);

    }

    @Test
    public void should_return_sum_of_tow_numbers_with_comma_delimiter() throws Exception {
        //given

        //when
        int result = calculator.run("1,2");

        //then
        Assert.assertEquals(3, result);
    }


    @Test
    public void should_return_sum_of_tow_numbers_with_other_delimiter() throws Exception {
        //given
        //when
        int result = calculator.run("1\n2,3");

        //then
        Assert.assertEquals(6, result);

    }

    @Test
    public void should_throw_exception_if_input_has_negative_number() throws Exception {
        //given
        String ErrorMsg = "";
        //when
        try {
            calculator.run("1,-2");
        } catch (IllegalArgumentException e) {
            ErrorMsg = e.getMessage();
        }
        //then
        Assert.assertTrue(ErrorMsg.contains("-2"));

    }

    @Test
    public void should_throw_exception_if_input_has_multiple_negative_number() throws Exception {
        //given
        String ErrorMsg = "";
        //when
        try {
            calculator.run("-1,-2,-3");
        } catch (IllegalArgumentException e) {
            ErrorMsg = e.getMessage();
        }
        //then
        Assert.assertTrue(!ErrorMsg.isEmpty());
        Assert.assertTrue(ErrorMsg.contains("-1-2-3"));

    }
}
