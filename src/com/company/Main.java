package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getlargestPrime(600851475143L));

    }

    public static long getlargestPrime(long num) {
        long i=1;
        long largestPrime=0;
        while (i< num) {
            i++;
            if  (num % i ==0) {
                if (isPrime(i)) largestPrime=i;
                num =divideByLargestPower (num,i);
            }
        }
        return largestPrime;
    }

    public static long divideByLargestPower(long num , long i) {
        boolean isDivisible=true;
        while(isDivisible) {
            num = num /i;
            isDivisible = (num % i ==0);
        }
        return num;
    }


    public static boolean isPrime(long num) {
        if (num < 2) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }






}
