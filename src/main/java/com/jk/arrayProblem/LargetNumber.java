package com.jk.arrayProblem;

public class LargetNumber {
    //Time complexity here without sorting -> o(n)
    //sorted array will take a(n log n)
    public static void main(String[] args) {
        int[] arr ={3,2,1,5,2};
        int largestNum = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i] >largestNum ){
                largestNum = arr[i];
            }
        }
        System.out.println("Largest Num: "+largestNum);
    }
}
