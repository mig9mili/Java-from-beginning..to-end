package com.yashas;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        /*list.add(3);
        list.add(45);
        list.add(23);
        list.add(56);
        list.add(90); //6 input


        // checking
        System.out.println(list.contains(45));
        System.out.println(list.contains(99));
        System.out.println(list);
        // update
        list.set(0,99);// list.set(index no., no. we want)
        System.out.println(list);
       // remove
        list.remove(2);
        System.out.println(list);

         */

        for(int i=0;i<5;i++){
            list.add(in.nextInt());

        }

        for(int i=0;i<5;i++){
            System.out.println(list.get(i)); // pass index here,list[index] systax will not possible

        }



        //System.out.println(list);




    }
}
