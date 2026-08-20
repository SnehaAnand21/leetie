# ──────────────────────────────────────────────────
# Problem  : 237. Delete Node in a Linked List
# Difficulty: Medium
# Tags     : Linked List
# Link     : https://leetcode.com/problems/delete-node-in-a-linked-list/
# Runtime  : 27 ms (beats 32%)
# Memory   : 12772000 (beats 80%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def deleteNode(self, node):
        """:type node: ListNode
        :rtype: void Do not return anything, modify node in-place instead.
        """
        node.val = node.next.val
        node.next = node.next.next