// ──────────────────────────────────────────────────
// Problem  : 2058. Find the Minimum and Maximum Number of Nodes Between Critical Points
// Difficulty: Medium
// Tags     : Linked List
// Link     : https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/
// Runtime  : 6 ms (beats 27%)
// Memory   : 106020000 (beats 70%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int min = 100000, i = 1;
        int first = 0, last = 0;

        ListNode prev = head, curr = head.next, nxt = head.next.next;

        while (nxt != null) {
            if (isCrit(prev, curr, nxt)) {
                if (first == 0) first = i;
                else min = Math.min(min, i - last);
                last = i;
            }

            prev = curr; curr = nxt;
            nxt = nxt.next; i++;
        }

        if (first == last) return new int[]{-1, -1};

        return new int[]{min, last - first};
    }
    
    boolean isCrit(ListNode a, ListNode b, ListNode c) {
        return (a.val < b.val && b.val > c.val) ||
               (a.val > b.val && b.val < c.val);
    }
}