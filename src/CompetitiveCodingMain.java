import Array.*;
import Graphs.RiverSizes;
import Recursion.Factorial;
import Recursion.PermutationsOfAString;
import Sorting.HeapSort;
import Sorting.MergeSort;
import Sorting.QuickSort;
import searching.BinarySearch;
import searching.FindTheMajorityElement;

import java.util.List;

/*
https://www.youtube.com/watch?v=TnZHaH9i6-0
 */
public class CompetitiveCodingMain {

    public static void main(String args[]) {
        /*RemoveKthNodeFromEnd removeKthNodeFromEnd = new RemoveKthNodeFromEnd();
        //preparing a linkedlist
        LinkedList LinkedList = new LinkedList(0);
        LinkedList.addNewNode(new LinkedList(1)).addNewNode(new LinkedList(1))
                .addNewNode(new LinkedList(3)).addNewNode(new LinkedList(4)).addNewNode(new LinkedList(5))
        .addNewNode(new LinkedList(6))
        .addNewNode(new LinkedList(7))
        .addNewNode(new LinkedList(8))
        .addNewNode(new LinkedList(9))
        ;

        removeKthNodeFromEnd.removeNodeFromEnd(LinkedList,10);*/

        /*QuickSort quickSort = new QuickSort();
        int[] sortedArray = quickSort.doQuickSort(new int[]{9,8,7,8,3,4,2,1});

        for(int element: sortedArray)
        {
            System.out.print(element+" ");
        }*/

//        PascalTriangle pascalTriangle = new PascalTriangle();
//        List<List<Integer>> result = pascalTriangle.generate(2);
//
//        for(List<Integer> currentRow : result)
//        {
//            for(int element: currentRow)
//            {
//                System.out.print(element+" ");
//            }
//            System.out.println("");
//        }
//
        HeapSort heapSort = new HeapSort();
        /*int[] result = heapSort.createMaxHeap(new int[]{1,2,4,6,7,8});
        for(int element: result)
        {
            System.out.print(element+" ");
        }*/

//       int[] result =  heapSort.doHeapSort(new int[]{4,
//               1,
//               5,
//               0,
//               -9,
//               -3,
//               -3,
//               9,
//               3,
//               -4,
//               -9,
//               8,
//               1,
//               -3,
//               -7,
//               -4,
//               -9,
//               -1,
//               -7,
//               -2,
//               -7,
//               4});
//       for(int element: result)
//       {
//           System.out.print(element+" ");
//       }

/*
        Factorial factorial = new Factorial();
        System.out.println(factorial.findFactorialOfANum(5));
*/
//        PermutationsOfAString permutationsOfAString = new PermutationsOfAString();
//        permutationsOfAString.printPermutationsOfaString("ABC");

        /*NextPermutation nextPermutation = new NextPermutation();
        int[] result = nextPermutation.doNextPermutation(new int[]{1,5,8,4,7,6,5,3,1});
        for(int element: result)
        {
            System.out.print(+element+" ");
        }*/

        /*MergeSort mergeSort = new MergeSort();
        int[] finalArray = mergeSort.doMergeSort(new int[]{2,4,1,6,8,5,3,7});
        for(int element: finalArray)
        {
            System.out.print(element+" ");
        }*/

        //System.out.println("Number of counting inversions are:"+ new CountInversionsInAnArray().doCountingOfInversions(new int[]{1, 20, 6, 4, 5}));

     /*   BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

        System.out.println("Maximum profit is:"+bestTimeToBuyAndSellStock.findMaximumProfit(new int[]{7,1,4,6,3}));*/


        /*RotateTheMatrix rotateTheMatrix = new RotateTheMatrix();
        int[][] matrix = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] rotatedMatrix = rotateTheMatrix.rotate(matrix);

        for(int i = 0 ; i < rotatedMatrix.length ; i++)
        {
            for(int j =0 ; j < rotatedMatrix[0].length ; j++)
            {
                System.out.print(rotatedMatrix[i][j]+" ");
            }
            System.out.println();
        }*/
        /*int[][] matrix = new int[][]{
                {1,0,0,1,0},
                {1,0,1,0,0},
                {0,0,1,0,1},
                {1,0,1,0,1},
                {1,0,1,1,0}
        };

        RiverSizes riverSizes = new RiverSizes();
        List<Integer> riversizes = riverSizes.riverSizes(matrix);
        for(Integer element: riversizes)
        {
            System.out.print(element+" ");
        }*/

        /*BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.findElementUsingBinarySearch(new int[]{1,4,6,8,9},1));*/

        /*SearchInA2dArrayLeetCode searchInA2dArrayLeetCode = new SearchInA2dArrayLeetCode();
        int[][] matrix = new int[][]{
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,50}
        };
        System.out.println("result is:"+searchInA2dArrayLeetCode.searchMatrix(matrix,13));*/


        FindTheMajorityElement findTheMajorityElement = new FindTheMajorityElement();

        System.out.println("majority element is:"+findTheMajorityElement.majorityElement(new int[]{2,2,1,1,1,2,2}));


    }


}
