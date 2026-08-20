# ──────────────────────────────────────────────────
# Problem  : 234. Palindrome Linked List
# Difficulty: Easy
# Tags     : Linked List, Two Pointers, Stack, Recursion
# Link     : https://leetcode.com/problems/palindrome-linked-list/
# Runtime  : 0 ms (beats 0%)
# Memory   : 12460000 (beats 0%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution(object):
    def isPalindrome(self, head):
        """:type head: ListNode
        :rtype: bool
        """
        if not head or not head.next:
            return True
            
        # Step 1: Find the middle of the linked list using slow and fast pointers
        slow = fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            
        # Step 2: Reverse the second half of the list
        prev = None
        while slow:
            temp = slow.next
            slow.next = prev
            prev = slow
            slow = temp
            
        # Step 3: Check for palindrome by comparing the first half and reversed second half
        left, right = head, prev
        while right:
            if left.val != right.val:
                return False
            left = left.next
            right = right.next
            
        return True