package com.company.demo;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class FibonaciiSeries {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num = in.nextInt();
        int a,b=0;
        int c=1;
        for(int i=0;i<num;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.println("Fibonacii series "+a);
        }
    }
}
