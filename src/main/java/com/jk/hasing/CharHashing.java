package com.jk.hasing;

/**
 * For Char hashing always can use arrays as at most we have 256 CH.
 * For integer hashing there might be problem since inside main 10 the power of 6 only
 * the max size could be initiated.
 */
public class CharHashing {

    public static void main(String[] args) {
        String str ="abcdabehf";
        int [] hash = new int[26];
        //pre-cal
        for(int i =0; i<str.length();i++){
            hash[str.charAt(i)-'a']++;
        }

        char[] in = {'a','g','h','b','c'};

        //fetching
        for (int i =0;i < in.length;i++){
            int count = hash[in[i]-'a'];
            System.out.println(in[i]+" : "+count);
        }
    }
}
