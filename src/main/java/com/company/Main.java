package com.company;


import org.apache.commons.lang.time.StopWatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Main {

    public static void main(String[] args) {
        // write your code here

        org.apache.commons.lang.time.StopWatch stopwatch  = new StopWatch();
        stopwatch.start();


        System.out.println(findNthPrime(10001));

        stopwatch.stop(); // optional

        System.out.println("that took: " + stopwatch.getTime() +" ms" ); // formatted string like "12.3 ms"

    }
    public static int findNthPrime(int n) {
        List<Integer> primeNumbers = primeSieve(n * 10); // Use an upper bound of n * 10 to ensure that the list of prime numbers is long enough
        boolean tooSmall=(primeNumbers.size() <n);
        int newn=n*10;
        while (tooSmall) {
            if (primeNumbers.size() >n) tooSmall = false;
                else  {
                    System.out.println("Enlarging Sieve");
                    newn= newn*2;
                    primeNumbers = primeSieve(newn );
            }
        }

        return primeNumbers.get(n - 1); // Return the nth element of the list, since the list is 0-indexed
    }

    public static List<Integer> primeSieve(int n) {
        // Create a boolean array "prime[0..n]" and
        // initialize all entries it as true.
        // A value in prime[i] will finally be
        // false if i is Not a prime, else true.
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);

        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it is
            // a prime
            if (prime[p]) {
                // Update all multiples of p
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        // Create a list of prime numbers
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }

        // Return the list of prime numbers
        return primeNumbers;
    }





}
