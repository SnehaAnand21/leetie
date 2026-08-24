// ──────────────────────────────────────────────────
// Problem  : 445. Add Two Numbers II
// Difficulty: Medium
// Tags     : Linked List, Math, Stack
// Link     : https://leetcode.com/problems/add-two-numbers-ii/
// Runtime  : 1 ms (beats 100%)
// Memory   : 46388000 (beats 83%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    //private ListNode prev = null;
    //private ListNode front = null;
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode front = null;
        ListNode temp = head;
        while(temp != null){
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        if(l1 == null || l2 == null){
            return null;
        }

        ListNode ll = new ListNode(0);
        ListNode curr = ll;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        return reverse(ll.next);
    }
}