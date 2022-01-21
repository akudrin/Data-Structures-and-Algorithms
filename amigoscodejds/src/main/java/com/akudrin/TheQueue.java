package com.akudrin;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueue {
    public static void main(String[] args) {

        //FIFO
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex",22));
        supermarket.add(new Person("John",23));
        supermarket.add(new Person("Bob",25));
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
    }


    static record Person(String name, int age){}

}
