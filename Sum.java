package com.ritesh;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of term");
        int n = in.nextInt();
        int sum=0;

        for (int i=1; i<=n ;i++)
        {
            sum = sum + i;
        }
        System.out.println("Addition "+ sum);
    }
}
