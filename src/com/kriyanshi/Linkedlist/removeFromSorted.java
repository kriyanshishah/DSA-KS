// 83
// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
package com.kriyanshi.Linkedlist;

public class removeFromSorted {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode node = head;

        while(node.next != null && node != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
            }else{
                node = node.next;
            }
        }
        return head;
    }
}
