package com.yashas;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr={1,23,45,67,87,945};
        int s= max(arr);
        System.out.println(s);
        int a=rangemax(arr,0,3);
        System.out.println(a);
    }
     static int max(int[] arr){

        if(arr.length==0){
            return -1;
        }

        int maxval=arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>maxval)
            {
                maxval=arr[i];
            }
        }
        return maxval;
     }

     /// range  1-->4
    // work on edge case here ,like array being null
     static int rangemax(int[] arr,int i1,int i2){

        if(i2>i1){
            return -1;
        }

        if(arr==null){
            return -1;

        }


         int maxval=arr[i1];
         for(int i =i1;i<=i2;i++){
             if(arr[i]>maxval)
             {
                 maxval=arr[i];
             }
         }
         return maxval;
     }
}
