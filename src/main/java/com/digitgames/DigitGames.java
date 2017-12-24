package com.digitgames;

import java.util.ArrayList;
import java.util.List;

/**
 * Digit Games using TDD
 *
 * 1. Find k such that
 * a + b + c = n * k
 *
 * 2. Find how many n exists such that
 * 0 < p < 5
 * 0 < n < 1000
 */
public class DigitGames {


    public int findK(int n, int p) {
        if (n <= 0) return -1;

        List<Integer> digitList = getDigitList(n);
        int sumOfExponents = getSumOfExponents(digitList, p);

        return getFactor(sumOfExponents, n);
    }


    public List<Integer> getDigitList(int n) {
        List<Integer> digits = new ArrayList<>();
        while (n > 0) {
            digits.add(n % 10);
            n = n / 10;
        }
        return digits;
    }

    public int getSumOfExponents(List<Integer> digits, int p) {
        int sum = 0;
        for (int k = 0; k < digits.size(); k++) {
            sum += Math.pow(digits.get(k), p-1 + (digits.size() - k));
        }
        return sum;
    }

    public int getFactor(int sum, int n) {

        if (sum % n == 0) {
            return sum / n;
        }
        return -1;
    }


    public int findHowMany() {
        int count = 0;
        for(int n=100; n<1000; n++){
            for(int p=1; p<5; p++){
                int k = findK(n, p);
                if(k != -1){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
