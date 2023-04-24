package com.company.demo;

public class CountCharInString {
    public static void main(String[] args) {
        String str="basava";
        char[] chars = str.toCharArray();
        int count=0;
        char[] temp =new char[chars.length];
        int k=0;
        for (int i=0;i<chars.length;i++){
            for(int j=i+1;j<chars.length;j++){
                if (chars[i]==chars[j]){
                    count++;
                    temp[k++]=chars[i];
                }
            }
        }
        System.out.println("Repeated character"+temp[0]+"Repeat count"+count);
    }
}
