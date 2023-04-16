package com.company.demo;

public class SwapTwoNumberWithThirdVariable {
    public static void main(String[] args) {
        int x=45;
        int y=20;
       /* int temp;
        System.out.println("Before swap x="+x+" y="+y);
        temp=x;
        x=y;
        y=temp;
        System.out.println("after swap x="+x+" y="+y);*/

        // without third variable swap the two number
        x=x+y; //64
        y=x-y;// y=20;
        x=x-y;// 65-20=45
        System.out.println("after swap x="+x+" y="+y);
    }
}
