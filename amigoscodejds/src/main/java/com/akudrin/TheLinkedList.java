package com.akudrin;

import java.util.LinkedList;
import java.util.ListIterator;

public class TheLinkedList {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alex",22));
        linkedList.add(new Person("John",23));
        linkedList.addLast(new Person("Bob",23));
        linkedList.addFirst(new Person("Suzy",45));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while(personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while(personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }

    }

    static record Person(String name, int age){}
}
