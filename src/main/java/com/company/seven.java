package com.company;


import org.apache.commons.lang.time.StopWatch;

class seven
{
    public static void main(String args[])
    {
//find out prime nos and divide 317584931803 with least prime no and increament it
//the last ans would be largest prime factor

        org.apache.commons.lang.time.StopWatch stopwatch  = new StopWatch();
        stopwatch.start();





        EXIT:
        for(long i=2;i<10000;i++)
        {
            END:
            for(long j=(i-1);j>=2;j--)
            {
                if(i%j==0)
                {
                    break END;
                }
                else if(i%j!=0)
                {
                    if(j==2)
                    {
                        if(317584931803l%i==0)
                        {
                            System.out.println(i +" is prime");
                        }
                    }
                }
            }

        }
        System.out.println("end");
        stopwatch.stop(); // optional

        System.out.println("that took: " + stopwatch.getTime() +" ms" ); // formatted string like "12.3 ms"
    }
}

