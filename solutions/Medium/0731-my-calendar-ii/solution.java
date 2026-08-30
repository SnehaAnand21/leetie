// ──────────────────────────────────────────────────
// Problem  : 731. My Calendar II
// Difficulty: Medium
// Tags     : Array, Binary Search, Design, Segment Tree, Prefix Sum, Ordered Set
// Link     : https://leetcode.com/problems/my-calendar-ii/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42592000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class MyCalendarTwo {

    List<int[]> events;
    List<int[]> overlaps;

    public MyCalendarTwo() {
        events = new ArrayList<>();
        overlaps = new ArrayList<>();
    }

    public boolean book(int startTime, int endTime) {

        // Check if this booking creates a triple booking
        for (int[] interval : overlaps) {
            int start = Math.max(startTime, interval[0]);
            int end = Math.min(endTime, interval[1]);

            if (start < end) {
                return false;
            }
        }

        // Find new double-booked regions
        for (int[] interval : events) {
            int start = Math.max(startTime, interval[0]);
            int end = Math.min(endTime, interval[1]);

            if (start < end) {
                overlaps.add(new int[]{start, end});
            }
        }

        // Add the new event
        events.add(new int[]{startTime, endTime});

        return true;
    }
}