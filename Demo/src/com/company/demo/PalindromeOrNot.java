package com.company.demo;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        String original,reverse="";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number or String");
        original=in.nextLine();
        for (int i=original.length()-1;i>=0;i--) {
            reverse=reverse+original.charAt(i);
        }
        if (original.equals(reverse)){
            System.out.println("The number is palindrome number");
        }else {
            System.out.println("The number is not palindrome number");
        }
    }
}
