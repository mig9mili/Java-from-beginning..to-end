package com.yashas;
 import java.util.Scanner;
 //import java.util.Arrays;

public class MultiDimensional {
    public static void main(String[] args){
        /*

        1 2 3
        4 5 6
        7 8 9

       */

      //  int [][] arr=new int[3][];  // 1st bracket is for row and 2nd is for column
        // here  row should be mandatory mentioned

        //or

/*
        int [][] array ={
                {1,2,3},
                {3,4,5},
                {5,6,7},
        };*/



       // int [][] array ={
      //          {1,2,3},
      //          {3,4},
        //        {5,6,7,9},
        //};


        // input
     Scanner in=new Scanner(System.in);
     int [][] arry= new int[3][3];

     for (int row=0;row< arry.length;row++){
          for(int col=0;col<arry[row].length;col++){

              arry[row][col]=in.nextInt();

          }
     }

     // output 1

       /*for (int row=0;row< arry.length;row++){
            for(int col=0;col<arry[row].length;col++){
                System.out.print(arry[row][col]+" ");
            }
           System.out.println();
        }*/


    // output 2

      /*  for(int row =0; row<arry.length;row++){
            System.out.println(Arrays.toString(arry[row]));
        }*/


        //output 3

        //   for(int[] a:arry){
        //    System.out.println(Arrays.toString(a));
        //    }


        System.out.println(arry[2][1]);


    }
}
