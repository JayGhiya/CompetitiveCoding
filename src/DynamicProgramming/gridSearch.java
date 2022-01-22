package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

/**
 * Imagine you are given a grid where you  are starting from top left 
 * and the goal is to reach the bottom. The expectation is 
 * to find the number of ways you can reach bottom and remember
 * you only can move in download or right direction.
 * 
 */
public class gridSearch {
    
    //Lets do recursive first
    public int doGridSearch(int m,int n)
    {
      
        //base cases
        if(m ==0 || n==0)
        {
            return 0;
        }
        if(m==1 &&  n==1)
        {
            return 1;
        }
        return doGridSearch(m-1, n) + doGridSearch(m, n-1);
    }

    //now let us do dynamic programming using memoization

    public int doGridSearchUsingDp(int m , int n ,Map<String,Integer> memoization)
    {
        if(m ==0 || n==0)
        {
            return 0;
        }
        if(m==1 && n==1)
        {
            return 1;
        }

         String key = m+""+n;     
         
         if(memoization.containsKey(key))
         {
            return memoization.get(key);
         }

        memoization.put(key,doGridSearchUsingDp(m-1, n, memoization) + doGridSearchUsingDp(m, n-1, memoization));
         

        return memoization.get(key);
    }

    public static void main(String[] args) {
      gridSearch gridSearch = new gridSearch();
      System.out.println("using recursion:"+ gridSearch.doGridSearch(2, 3) );
      System.out.println("using dynamic programming:"+gridSearch.doGridSearchUsingDp(2,3, new HashMap<String,Integer>()));
    }
}
