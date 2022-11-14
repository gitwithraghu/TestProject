package aaray_program;

import java.util.Scanner;

public class aaray3 {
    public static void main(String[] args) {
        System.out.println("please enter any number");
        int num = new Scanner(System.in).nextInt();

        if (num % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");


    }
}
