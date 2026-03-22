package com.jk.hasing;

import java.util.HashMap;
import java.util.Map;

public class IntegerHashing {
    public static void main(String[] args) {
        int[] arr ={1,2,3,1,3,2,12};
        int[] input = {5,1,2,3,4,12};
        //pre-Cal
        Map<Integer,Integer> hash = new HashMap<>();
        for (int num : arr) {
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }

        for (int num : input) {
            System.out.println(num + ":" + hash.getOrDefault(num, 0));
        }

    }
}
