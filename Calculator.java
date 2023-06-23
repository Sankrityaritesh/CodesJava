package com.ritesh;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println("Select Operation");
        int ch = in.nextInt();
        int cal;

        if( ch == 1) {
            cal = n1 + n2;
            System.out.println("Addition "+cal);
        }
        else if ( ch == 2) {
            cal = n1 - n2;
            System.out.println("Subtraction "+cal);
        } else if ( ch == 3) {
            cal = n1 * n2;
            System.out.println("Multiplication "+cal);
        }else if (ch == 4){
            cal = n1 / n2;
            System.out.println("Division "+cal);
        } else {
            cal = n1 % n2;
            System.out.println("Remainder "+cal);
        }
    }
}
