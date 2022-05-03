// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
package com.kriyanshi.Linkedlist;

public class convertBinToInt {
     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

    }

    public int getDecimalValue(ListNode head) {
        int num = head.val;
        while(head.next != null){
            num = num * 2 + head.next.val;
            head = head.next;
        }
        return num;
    }
}
