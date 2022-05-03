// https://leetcode.com/problems/remove-linked-list-elements/
package com.kriyanshi.Linkedlist;

public class removeLinkedListEle {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        while(head != null && head.val == val) head = head.next;
        ListNode tmp = head, prev = null;
        while(tmp != null){
            if(tmp.val == val){
                prev.next = tmp.next;
            }else{
                prev = tmp;
            }
            tmp = tmp.next;
        }
        return head;
    }
}
