package DynamicProgramming;


import java.util.*;

public class FibonacciSeries {
    //Recursion
    public int doFibonacci(int n,Map<Integer,Integer> memoization)
    {
        if(n<=2)
        {
            return 1;
        }
        if(memoization.containsKey(n))
        {
            return memoization.get(n); 
        }
        memoization.put(n,doFibonacci(n-1,memoization)+doFibonacci(n-2,memoization));

        return memoization.get(n);
    }

    //Dynamic Programming
    public static void main (String args[])
    {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        Map<Integer,Integer> hashMap = new HashMap<>();
        System.out.println("answer is : "+fibonacciSeries.doFibonacci(100   ,hashMap));
    }

}
