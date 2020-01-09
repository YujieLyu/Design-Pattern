package SortingAlgorithm;

import java.util.Arrays;

public class SortingController {
    public static void main(String[] args){
        int[] myArr={1,9,8,7,6,5};
//        int[] newArr=SortingUtils.selectionSort(myArr);
        int[] newArr=SortingUtils.insertSort(myArr);
        System.out.println(Arrays.toString(newArr));
    }
}
