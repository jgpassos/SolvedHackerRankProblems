package com.mycompany.hackerrank.plusMinus;

import java.util.List;

class Result {

    /*
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {  
        long positives = arr.stream().filter(n -> n > 0).count();
        long negatives = arr.stream().filter(n -> n < 0).count();
        long zeros = arr.stream().filter(n -> n == 0).count();
        
        double proportionPositives = ((double) positives / arr.size());
        double proportionNegatives = ((double) negatives / arr.size());
        double proportionZeros = ((double) zeros / arr.size());
        
        System.out.printf("%.6f %n", proportionPositives);
        System.out.printf("%.6f %n", proportionNegatives);
        System.out.printf("%.6f %n", proportionZeros);
    }
}
