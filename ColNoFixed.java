package com.yashas;

public class ColNoFixed {
    public static void main(String[] args){
        int [][] arr ={
                {2,3,4,89},
                {3, 5,8},
                {8,9,1},

        };

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
