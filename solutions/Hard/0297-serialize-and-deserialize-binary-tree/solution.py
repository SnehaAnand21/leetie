# ──────────────────────────────────────────────────
# Problem  : 297. Serialize and Deserialize Binary Tree
# Difficulty: Hard
# Tags     : String, Tree, Depth-First Search, Breadth-First Search, Design, Binary Tree
# Link     : https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
# Runtime  : 157 ms (beats 5%)
# Memory   : 24152000 (beats 5%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Codec:
    def serialize(self, root):
        def r_serialize(node, string):
            if not node:
                string += "None,"
            else:
                string += str(node.val) + ","
                string = r_serialize(node.left, string)
                string = r_serialize(node.right, string)
            return string
        return r_serialize(root, "")

    def deserialize(self, data):
        def r_deserialize(data_list):
            val = data_list.pop(0)
            if val == "None":
                return None
            node = TreeNode(int(val))
            node.left = r_deserialize(data_list)
            node.right = r_deserialize(data_list)
            return node
        
        data_list = data.split(",")
        return r_deserialize(data_list)