package com.company.demo;

import java.util.Scanner;

/**
 * Below program for to check the given number is palindrome or not
 */
public class PalindromeOrNot {
    /**
     * This method used for to check the if given input original or reverse same than we can called
     * palindrome number
     * @param args
     */
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
