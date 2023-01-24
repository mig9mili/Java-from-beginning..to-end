package com.yashas;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

      /*  int arr[]=new int[5];
        arr[0]=3;
        arr[1]=34;
        arr[2]=45;
        arr[3]=875;
        arr[4]=95;
        System.out.println(arr[3]);*/


        // input using for loop

        // for (int i=0;i<arr.length;i++)
        //  {
        //     arr[i]= in.nextInt();
        // }

        // 1 st type to get output



        //  for(int i=0;i<arr.length;i++)
        //  {
        //     System.out.print(arr[i]+" ");
        //  }

        // 2nd  type to get output
       /* for(int num :arr){for every element in the array ,print the element
            System.out.println(num + " ");}  here num represent element of the array
         */



        // 3rd type to get out put

        // System.out.println(Arrays.toString(arr));


        String[] str=new String[4];

        for(int i=0;i<str.length;i++)
        {
            str[i]=in.next();
        }


        System.out.println(Arrays.toString(str));



          // modify
        str[2]="yashas";
        System.out.print(Arrays.toString(str));
    }}


