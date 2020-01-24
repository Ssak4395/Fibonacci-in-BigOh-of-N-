package com.company;

import java.util.Arrays;

public class Main {
    /**
     *                                        Sadman Sakib 2020 January 25th @ University Of Sydney B of Engineering + Adv Mathematics
     * To employer/Teacher
     * Fibonacci Algorithm, being computed in O(N^2) time
     * ultimately it is  a more efficient solution compared to computing it recursively
     * @param args
     */
    public static void main(String[] args) {

        int length = 500000;
        long[] series = new long[length];
        series[0] = 0;
        series[1] = 1;
        for (int i = 2; i < length; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }
        System.out.print(Arrays.toString(series));
    }

}
