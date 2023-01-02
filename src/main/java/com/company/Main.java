package com.company;


import org.apache.commons.lang.time.StopWatch;



class Main {

    public static void main(String[] args) {
        // write your code here

        org.apache.commons.lang.time.StopWatch stopwatch  = new StopWatch();
        stopwatch.start();

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println(computeLCM(numbers));
        stopwatch.stop(); // optional

        System.out.println("that took: " + stopwatch.getTime() +" ms" ); // formatted string like "12.3 ms"

    }

    public static int computeLCM(int[] numbers) {
        int lcm = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            lcm = (lcm * numbers[i]) / computeGCD(lcm, numbers[i]);
        }
        return lcm;
    }


    public static int computeGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return computeGCD(b, a % b);
    }




}
