package aaray_program;

import java.util.Scanner;

public class Aaray1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter size of array:");
        int size=sc.nextInt();

        String[] names=new String[size];//array declaration

        names[4]="Rohit";//intialize
        names[5]="capatin";
        names[9]="indian";

        System.out.println("the array elements are as follows:");

        for (int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);//0,1,2,3,4
        }
        System.out.println("size of above array is :"+names.length);


        System.out.println("value at index number 4 is :"+names[4]);
        System.out.println("value at index number 2 is :"+names[2]);
        System.out.println("value at index number 9 is :"+names[9]);

        System.out.println("below array elemets using for each loop ");
        for(String name:names)
        {
            System.out.println(name);
        }

    }
}
