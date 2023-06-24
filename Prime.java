package com.ritesh;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        System.out.println("Enter any Number");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
            if (count == 2)
                System.out.print("Prime Number");
            else
                System.out.print("Not Prime Number");
        }
    }
