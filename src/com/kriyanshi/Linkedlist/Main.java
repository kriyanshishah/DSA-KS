package com.kriyanshi.Linkedlist;

public class Main {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertLast(1);
        list.insert(2,4);
        System.out.println(list.deleteFirst());
        list.display();
    }
}
