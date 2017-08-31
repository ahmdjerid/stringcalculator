package com.olbati.kata;

/**
 * Hello world!
 */
public class Calculator {


    public static final String DELIMITER = "[,|\n]";

    int run(String numbers) throws Exception {

        if (numbers.isEmpty()) {
            return 0;
        } else {
            return getSum(numbers);

        }
    }

    private int getSum(String numbers) throws Exception {

        String[] tabNumber = numbers.split(DELIMITER);
        int sum = 0;
        int i = 0;

        for (String aNumber : tabNumber) {
            int number = getAnInt(aNumber);
            verifyNegativeNumber(tabNumber, i);
            sum = sum + number;
            i++;
        }

        return sum;
    }

    private void verifyNegativeNumber(String[] tabNumber, int index) throws Exception {

        if (getAnInt(tabNumber[index]) < 0) {
            StringBuilder negativeNumbers = new StringBuilder();
            for (int i = index; i < tabNumber.length; i++) {
                negativeNumbers.append(tabNumber[i]);
            }
            throw new IllegalArgumentException("negatives not allowed " + negativeNumbers);
        }
    }

    private int getAnInt(String numbers) {
        return Integer.parseInt(numbers);
    }
}
