// ──────────────────────────────────────────────────
// Problem  : 636. Exclusive Time of Functions
// Difficulty: Medium
// Tags     : Array, Stack
// Link     : https://leetcode.com/problems/exclusive-time-of-functions/
// Runtime  : 16 ms (beats 9%)
// Memory   : 47160000 (beats 53%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        Deque<Event> stack = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>(Collections.nCopies(n, 0));
        
        for (String content : logs) {
            // Extract the log details from the content(string)
            Event event = new Event(content);
            if (event.getIsStart()) {
                // Push the event details to the stack
                stack.push(event);
            } else {
                // Pop the log details from the stack
                Event top = stack.pop();
                // Add the execution time of the current function to the actual result
                result.set(top.getId(), result.get(top.getId()) + (event.getTime() - top.getTime() + 1));
                // If the stack is not empty, subtract the current child //
// function execution time
                // from the parent function
                if (!stack.isEmpty()) {
                    result.set(stack.peek().getId(),
                            result.get(stack.peek().getId()) - (event.getTime() - top.getTime() + 1));
                }
            }
        }
        
        // Convert List<Integer> to int[]
        int[] resultArray = new int[n];
        for (int i = 0; i < n; i++) {
            resultArray[i] = result.get(i);
        }
        
        return resultArray;
    }
}

public class Event {
    private int id;
    private boolean isStart;
    private int time;

    public Event(String content) {
        String[] strs = content.split(":");
        this.id = Integer.parseInt(strs[0]);
        this.isStart = strs[1].equals("start");
        this.time = Integer.parseInt(strs[2]);
    }

    public int getId() {
        return this.id;
    }

    public boolean getIsStart() {
        return this.isStart;
    }

    public int getTime() {
        return this.time;
    }
}