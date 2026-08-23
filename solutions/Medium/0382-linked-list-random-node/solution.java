// ──────────────────────────────────────────────────
// Problem  : 382. Linked List Random Node
// Difficulty: Medium
// Tags     : Linked List, Math, Reservoir Sampling, Randomized
// Link     : https://leetcode.com/problems/linked-list-random-node/
// Runtime  : 12 ms (beats 59%)
// Memory   : 48344000 (beats 52%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.Random;

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
    private ListNode head;
    private Random random;

    public Solution(ListNode head) {
        this.head = head;
        this.random = new Random();
    }
    
    public int getRandom() {
        int scope = 1;
        int chosenValue = 0;
        ListNode curr = this.head;
        
        while (curr != null) {
            // With probability 1/scope, replace the chosen value
            if (random.nextInt(scope) == 0) {
                chosenValue = curr.val;
            }
            scope++;
            curr = curr.next;
        }
        
        return chosenValue;
    }
}