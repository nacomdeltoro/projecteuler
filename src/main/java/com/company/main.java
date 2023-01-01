package com.company;


import org.apache.commons.lang.time.StopWatch;



class Main {

    public static void main(String[] args) {
        // write your code here

        org.apache.commons.lang.time.StopWatch stopwatch  = new StopWatch();
        stopwatch.start();


        System.out.println(getLargestPalindrone(999L));
        stopwatch.stop(); // optional

        System.out.println("that took: " + stopwatch.getTime() +" ms" ); // formatted string like "12.3 ms"

    }

    public static long getLargestPalindrone(long num  ) {
        long largestPalindrone =0;
        for (long i=num;i>99;i--) {
            for (long j=num;j>99;j--) {
                if (isPalindrone(i*j)) {
                    if (i*j > largestPalindrone) largestPalindrone = i*j;
                }
            }
        }

        return largestPalindrone;

    }



    public static boolean isPalindrone(long num) {
        return isPalindrome(Long.toString(num));
    }

    public static boolean isPalindrome(String str)
    {
        // Initializing an empty string to store the reverse
        // of the original str
        String rev = "";

        // Initializing a new boolean variable for the
        // answer
        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Checking if both the strings are equal
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }






}
