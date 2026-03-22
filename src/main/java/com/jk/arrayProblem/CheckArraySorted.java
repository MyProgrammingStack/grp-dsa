package com.jk.arrayProblem;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr ={1,2,1,3,4};
        boolean isSorted = true;
        for(int i = 1;i  <arr.length ;i++){
            if( !(arr[i] >= arr[i-1])){
                isSorted = false;
            }
        }
        System.out.println("Is sorted: "+isSorted);
    }
}
