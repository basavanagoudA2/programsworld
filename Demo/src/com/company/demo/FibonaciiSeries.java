package com.company.demo;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class FibonaciiSeries {
    public static void main(String[] args) {
        // Take the input from console for numbers of fibonacii series we want like 10 than returns until 10 num
        Scanner in=new Scanner(System.in);
        // example 0,1,1,2,3,5,8,13,21,34
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
