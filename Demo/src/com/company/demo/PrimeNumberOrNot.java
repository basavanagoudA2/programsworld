package com.company.demo;

import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        boolean isPrime=true;
        for(int i=2;i<num;i++){
            if (num%i==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime){
            System.out.println("The given number is Prime:"+num);
        }else {
            System.out.println("The given number is not Prime:"+num);
        }
    }
}
