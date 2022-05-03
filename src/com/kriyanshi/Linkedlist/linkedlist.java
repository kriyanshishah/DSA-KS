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
        size++;
    }

    public void display(){
        Node tmp = head;
        while(tmp != null){
            System.out.print(tmp.value + "--> ");
            tmp = tmp.next;
        }
        System.out.println("END");
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }else if(index == size){
            insertLast(val);
            return;
        }

        Node tmp = head;
        for(int i = 1; i <index; i++){
            tmp = tmp.next;
        }
        Node node = new Node(val, tmp.next);
        tmp.next = node;
        size++;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
//        System.out.println(size);
        Node secondLast = get(size - 2);
//        System.out.println(secondLast.value);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return value;
    }

    public Node get(int index){
        Node node = head;
        for(int i=0; i<index;i++){
            node = node.next;
        }
//        System.out.println("sout" + node.value);
        return node;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }else if(index == size - 1){
            return deleteLast();
        }
        Node prev = get(index - 1);
        System.out.println(prev.value);

        return prev.value;
    }

    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if(head == tail){
            tail = null;
        }
        size--;
        return value;
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
