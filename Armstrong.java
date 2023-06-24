package com.ritesh;

import java.util.Scanner;

//check armstrong number
public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter a Number ");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int c=n,sum=0;

        while (n > 0)
        {
            int rem = n % 10;
            sum = (rem*rem*rem)+sum;
            n = n / 10;
        }
        if (c == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}
