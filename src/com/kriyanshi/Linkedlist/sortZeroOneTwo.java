package com.kriyanshi.Linkedlist;

public class sortZeroOneTwo {
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {

    }

    public Node segregate(Node head)
    {
        // add your code here
        int[] count = {0, 0, 0};
        Node node = head;
        while(node != null){
            count[node.data]++;
            node = node.next;
        }
        int i = 0;
        node = head;
        while(node != null){
            if(count[i] == 0) {
                i++;
            }
            else{
                node.data = i;
                count[i]--;
                node = node.next;
            }
        }
        return head;
    }
}
