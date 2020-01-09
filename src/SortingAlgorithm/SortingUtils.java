package SortingAlgorithm;

import java.util.ArrayList;

public class SortingUtils {
    /**
     * ArrayList version
     */
    public static int[] selectionSort(int[] arr){

        int minIndex;
        for (int i=0;i<arr.length-1;i++){
            minIndex=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[minIndex]){
                    minIndex=j;
                }
                if (minIndex!=i){
                    int temp=arr[i];
                    arr[i]=arr[minIndex];
                    arr[minIndex]=temp;
                }

            }
        }

        return arr;
    }

    public static int[] insertSort(int[] arr){
        int length=arr.length;
        for(int i=0;i<length-1;i++){
            for(int j=i+1;j>0;j--){
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
}
