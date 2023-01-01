package com.company;

import org.apache.commons.lang.time.StopWatch;

public class myClass {
    public static void main(String args[])
    {

        org.apache.commons.lang.time.StopWatch stopwatch  = new StopWatch();
        stopwatch.start();

        System.out.println( primo(317584931803L ));

        stopwatch.stop(); // optional

        System.out.println("that took: " + stopwatch.getTime() +" ms" ); // formatted string like "12.3 ms"
    }

    public static long primo(long x)
    {
        long a = 2;
        if (isPrime(x)) return x;
        while ( x > 1  )
        {
            if ( ( x % a ) == 0 )
            {
                x = x / a;
            }
            else
            {
                a++;
            }
        }

        return a;
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
