package com.ritesh;

import java.util.Scanner;
//Find out whether the given string is pallindrome or not
public class Palindrome{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = in.nextLine();
        String reverse="";
        int length = str.length();
        for(int i = length-1; i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println(str +"is a palindrome");
        }
        else {
            System.out.println(str +"is not a palindrome");
        }
    }
}
