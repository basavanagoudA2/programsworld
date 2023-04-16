package com.company.demo;

public class Main {

    public static void main(String[] args) {
        int i,j,count=1;
        for(i=2;i<200;i++){
            boolean isPrime=true;
            for (j=2;j<i;j++){
                if (i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if (count<=10){
                if (isPrime){
                    System.out.println(count +" "+ i);
                    count++;
                }
            }
        }
    }
}
