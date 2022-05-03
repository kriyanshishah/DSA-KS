package com.kriyanshi.Linkedlist;

import java.util.LinkedList;

public class linkedlist {

    private Node head;
    private Node tail;

    private int size;
    public linkedlist(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
    }

    public void display(){
        Node tmp = head;
        while(tmp != null){
            System.out.print(tmp.value + "--> ");
            tmp = tmp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
