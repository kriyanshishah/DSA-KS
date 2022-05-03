// https://leetcode.com/problems/delete-node-in-a-linked-list/
package com.kriyanshi.Linkedlist;

public class deleteNode {
     public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }

    public static void main(String[] args) {

    }

    public void deleteNode(ListNode node) {
        while(node.next.next != null){
            node.val = node.next.val;
            node = node.next;
        }
        node.val = node.next.val;
        node.next = null;
    }

}
