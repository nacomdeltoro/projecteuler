package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println( sumOfEvenFibo(90));
    }

    public static int sumOfEvenFibo(int num) {
        int sum=0;
        int a =1;
        int b=2;
        int c=0;

       while (c<num) {
           c=a+b;
           if (c>num) break;
           if (c % 2 ==0 ) {
               System.out.println("c " +c );
               sum +=c;
           }
           a=b;
           b=c;
        }
        return sum+2;
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
