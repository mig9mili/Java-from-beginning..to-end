package com.yashas;
 import java.util.Arrays;

public class passinginfuntion {
    public static void main(String[] args) {

        int[] nums={12,34,453,3345};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
     static void change(int[] hs)
     {
         hs[0]=45;
     }
}
