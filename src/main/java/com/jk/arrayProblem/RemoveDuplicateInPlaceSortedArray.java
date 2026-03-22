package com.jk.arrayProblem;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.SortedMap;

public class RemoveDuplicateInPlaceSortedArray {
    public static void main(String[] args) {
        int[] arr ={1,1,2,2,2,3,3,3,3};
        int i = 0;
        for(int j=1;j<arr.length;j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }

        }
        System.out.println("Array with uniques at front:: "+ Arrays.toString(arr));
        System.out.println("Count of unique number in sorted array: "+ (i+1));
    }
}
