package com.jk.arrayProblem;

public class SecondLargest {
    /**
     * Brute-> Sorted array can take n logn + n
     * Better -> 2 pass ->o(2n)
     * Best -> single pass o(n)
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1,5,7,3,4,7};
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE; //if negative numbers allowed then -1 wont work
        for(int num:arr){
            if(num > largest ){
                slargest = largest;
                largest = num;
            }else if( num < largest && num > slargest){
                slargest = num;
            }
        }
        if (slargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second Largest: " + slargest);
        }

    }
}
