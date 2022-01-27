package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a function which accepts target sum and an array of numbers
 * figure out if it is possible to get the target sum using array of numbers
 * 
 */
public class CanSum {

    public boolean doCanSumUsingRecursion(int target, int[] numbers) {

        if (target == 0) {
            return Boolean.TRUE;
        }

        if (target < 0) {
            return Boolean.FALSE;
        }

        for (int number : numbers) {
            int remainder = target - number;
            if (doCanSumUsingRecursion(remainder, numbers) == Boolean.TRUE) {
                return Boolean.TRUE;
            }
        }   

        return Boolean.FALSE;
    }

    public boolean doCanSumUsingDynamicProgramming(int target,int[] numbers,Map<Integer,Boolean> memoization) 
    {

        if(memoization.containsKey(target) == true)
        {
            return memoization.get(target);
        }
        if(target == 0 )
        {
            return Boolean.TRUE;
        }
        if(target<0)
        {
            return Boolean.FALSE;
        }

        for(int number: numbers)
        {
            int remaindr = target-number;
            if ( doCanSumUsingDynamicProgramming(remaindr, numbers, memoization) == true)
            {
                //make sure target is set to true instead of remainder
                memoization.put(target, Boolean.TRUE);
                return Boolean.TRUE;
            }
        }

        memoization.put(target,Boolean.FALSE);
        return Boolean.FALSE;


        
    }

    public static void main(String[] args) {
        CanSum canSum = new CanSum();
        System.out.println(canSum.doCanSumUsingRecursion(7,new int[]{5,3,4,7}));
        System.out.println(canSum.doCanSumUsingDynamicProgramming(300,new int[]{7,14},new HashMap<Integer,Boolean>()));
    }

}
