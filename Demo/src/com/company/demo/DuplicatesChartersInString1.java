package com.company.demo;

public class DuplicatesChartersInString1 {
    public static void main(String[] args) {
        String str="Sakkett";
        char[] charsArr = str.toCharArray();
        for (int i=0;i<charsArr.length;i++){
            for (int j=i+1;j<charsArr.length;j++){
                if (charsArr[i]==charsArr[j]){
                    System.out.println("Duplicate char :   "+charsArr[j]);
                    break;
                }
            }
            }
        String str2="basavanagouds";
        char[] strCharArr=str2.toCharArray();
        int charCount=0;
        char temp= 0;
        for (int i=0;i<strCharArr.length;i++){
            // logic for repeated word
             temp=strCharArr[i];
            for (int j=i+1;j<strCharArr.length;j++){
                if(temp==strCharArr[j]){
                    System.out.println(temp);
                    charCount++;
                }

            }
        }
        if (charCount>0){
            System.out.println("word repeated"+temp+   "repeat count"+charCount);

        }
        }
    }

