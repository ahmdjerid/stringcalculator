package com.olbati.kata;

/**
 * Hello world!
 */
public class Calculator {


    public static final String DELIMITER = "[,|\n]";

    int run(String numbers) {

        if (numbers.isEmpty()) {
            return 0;
        } else {
            return getSum(numbers);

        }
    }

    private int getSum(String numbers) {
        String[] tabNumber = numbers.split(DELIMITER);
        int sum = 0;
        for (String aNumber : tabNumber) {
            sum = sum + getAnInt(aNumber);
        }
        return sum;
    }


    private int getAnInt(String numbers) {
        return Integer.parseInt(numbers);
    }
}
