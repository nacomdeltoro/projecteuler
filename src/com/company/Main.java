package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] divisors = {3, 5};
        int num=10;
        System.out.println("Sum of multiples " + Arrays.toString(divisors) + " under "+ num+  " is "+ sumOfDivisors(num, divisors)+ "." );
    }

    public static int sumOfDivisors(int num, int[]divisors) {
        int sum=0;
        for (int i=0;i<num;i++) {
            if (isDivisible(i,divisors)) sum+=i;
        }
        return sum;
    }

    public static boolean isDivisible(int num, int[] divisors) {
        for (int divisor : divisors) {
            if (num % divisor == 0) {
                return true;
            }
        }
        return false;
    }

}
