package com.company.demo;

import java.util.Scanner;

public class ReverseStringMethod {
    public static void main(String[] args) {
        // Method 1
        String str1="Goud";
        StringBuffer str2=new StringBuffer();
        System.out.println(str2.append(str1).reverse());
        // Method 2 without inbuilt function
        char nameArr[]=str1.toCharArray();
        for (int i=nameArr.length-1;i>=0;i--){
            System.out.print(nameArr[i]);
        }
        // method3 using split method

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter you're String ");
        str1=scanner.nextLine();
        String[] token = str1.split("");
        for (int j=token.length-1;j>=0;j--){
            System.out.print(token[j]);
        }
    }
}
