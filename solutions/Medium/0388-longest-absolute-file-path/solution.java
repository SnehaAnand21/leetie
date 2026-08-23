// ──────────────────────────────────────────────────
// Problem  : 388. Longest Absolute File Path
// Difficulty: Medium
// Tags     : String, Stack, Depth-First Search
// Link     : https://leetcode.com/problems/longest-absolute-file-path/
// Runtime  : 1 ms (beats 69%)
// Memory   : 42900000 (beats 47%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int lengthLongestPath(String input) {
        var stack = new ArrayDeque<Integer>();
        int max = 0;
        String[] lines = input.split("\n");
        for(var line: lines) {
            int tabs = countTabs(line);
            while(tabs < stack.size()) {
                stack.pop();
            }
            int current = stack.isEmpty() ? 0: stack.peek();
            int nameLength = line.length() - tabs;
            if(isFilename(line)) {
                max = Math.max(max, current + nameLength);
            } else {
                stack.push(current + nameLength + 1);
            }
        }
        return max;
    }
    
    private int countTabs(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '\t') return i;
        }
        return 0;
    }
    
    private boolean isFilename(String s) {
        return s.lastIndexOf(".") != -1;
    }
    
}