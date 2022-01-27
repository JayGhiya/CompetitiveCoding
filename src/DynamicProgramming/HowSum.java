package DynamicProgramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * similar to cansum but return an array that has combination that adds to target sum.
 * 
 * if there are no combinations return null. if there are multiple return any one of them.
 */
public class HowSum {
    

    public int[] findSubsetArrayForTarget(int targetSum,int[] arr)
    {
        if(targetSum == 0) return new int[]{};
        if(targetSum <0 ) return null;

        for(int number: arr)
        {
            int remainder = targetSum - number;
            int[] resultArr = findSubsetArrayForTarget(remainder, arr);
            if(resultArr!=null)
            {
               int[] newArr =  Arrays.copyOf(resultArr,resultArr.length+1);
               newArr[resultArr.length]=number;
               return newArr;
            }

        }

        return null;
    }

    public Integer[] findSubsetArrayForTargetUsingDp(Integer targetSum,Integer[] arr,Map<Integer,Integer[]> memoization)
    {
        if(memoization.containsKey(targetSum))
        {
            return memoization.get(targetSum);
        }
        if(targetSum == 0) return new Integer[]{};
        if(targetSum < 0) return null;
        
        for(int i: arr)
        {
            Integer remainder = targetSum - i;
            Integer[] result = findSubsetArrayForTargetUsingDp(remainder, arr, memoization);
            if(result!=null)
            {
                Integer[] newArr = Arrays.copyOf(result,result.length+1);
                newArr[result.length] = i;
                memoization.put(targetSum,newArr);    
                return newArr;
            }
            
            
        }
        memoization.put(targetSum,null);    
        return null;
    }

    public static void main(String args[])
    {
       HowSum howSum = new HowSum();
       Integer[] arr = howSum.findSubsetArrayForTargetUsingDp(300,new Integer[] {7,14},new HashMap<Integer,Integer[]>());
       System.out.println(arr.length);
       for(int number: arr)
       {
         System.out.print(number+" ");
       }     
    }

}
