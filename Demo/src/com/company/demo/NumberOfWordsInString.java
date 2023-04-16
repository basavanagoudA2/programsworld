package com.company.demo;

import java.util.HashMap;
import java.util.Map;

public class NumberOfWordsInString {

    public static void main(String[] args) {
        String str = "basavanagoud is very good character person basavanagoud is not good boy";
        //below logic for find the number of words in the String
        String[] strArr = str.split(" ");
        Map<String, Integer> stringIntegerMap = new HashMap<String, Integer>();
        for (int i=0;i<strArr.length;i++){
            if (stringIntegerMap.containsKey(strArr[i])){
                int count=stringIntegerMap.get(strArr[i]);
                stringIntegerMap.put(strArr[i],count+1);
            }else {
                stringIntegerMap.put(strArr[i],1);
            }
        }
        System.out.println(stringIntegerMap);
    }

}
