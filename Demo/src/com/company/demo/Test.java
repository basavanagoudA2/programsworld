package com.company.demo;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<User,String> map=new HashMap<>();
        User user1=new User();
        user1.setUserId(1);
        user1.setUserName("bs");
        User user2=new User();
        user2.setUserId(1);
        user2.setUserName("bs");
        map.put(user1,"test");
        map.put(user2,"test");
        System.out.println(map);
        System.out.println(map.get(user1));
        //System.out.println(map.get(user2));
    }
}
