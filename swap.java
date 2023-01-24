package com.yashas;
import java.util.Arrays;
public class swap {
    public static void main(String[] args) {
        int[] arr={23,45,467,98,34};
        Swapper(arr,2,4);
        System.out.println(Arrays.toString(arr));
    }

    private static void Swapper(int[] arr, int ind1, int ind2) {
        int temp =arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
    }
    }



