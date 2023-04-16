package com.company.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateMapUsingWhileAndForLoop {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(2, "Saket");
        map.put(25, "Saurav");
        map.put(12, "HashMap");
        // Iterating using while loop
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> me=(Map.Entry)iterator.next();
            System.out.println("Key is "+ me.getKey()+"  "+"Value"+me.getValue());
        }
        // iterate the hashMap using for loop
        System.out.println("Iterator using for loop");
        for (Map.Entry entry:map.entrySet()
             ) {
            System.out.println("Key"+entry.getKey()+"value"+entry.getValue());
        }
    }
}
