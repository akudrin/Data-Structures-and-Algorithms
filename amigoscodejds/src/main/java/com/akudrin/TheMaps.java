package com.akudrin;

import java.util.HashMap;
import java.util.Map;

public class TheMaps {
    public static void main(String[] args) {

        Map<Person,Diamond> md = new HashMap<>();
        md.put(new Person("Alex"),new Diamond("African"));
        System.out.println(md.get(new Person("Alex")));

        System.out.println(new Person("Bob").hashCode());
        System.out.println(new Person("Bob").hashCode());

        Map<Integer,Person> map = new HashMap<>();
        map.put(1,new Person("Alex"));
        map.put(2,new Person("Bob"));
        map.put(3,new Person("John"));

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.entrySet().forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));
        map.forEach((key,person)->{
            System.out.println(key+" "+person);
        });

        System.out.println(map.getOrDefault(3, new Person("default")));
        System.out.println(map.values());


    }
    record Person(String name){}
    record Diamond(String name){}
}
