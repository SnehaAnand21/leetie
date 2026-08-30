// ──────────────────────────────────────────────────
// Problem  : 690. Employee Importance
// Difficulty: Medium
// Tags     : Array, Hash Table, Tree, Depth-First Search, Breadth-First Search
// Link     : https://leetcode.com/problems/employee-importance/
// Runtime  : 3 ms (beats 47%)
// Memory   : 48144000 (beats 25%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer, Employee> hashMap = new HashMap<>();
        for (Employee employee : employees) hashMap.put(employee.id, employee);
        Queue<Employee> q = new LinkedList<>();
        q.add(hashMap.get(id));
        int sum = 0;
        while (!q.isEmpty()) {
            Employee emp = q.poll();
            sum += emp.importance;
            for (int i : emp.subordinates) q.add(hashMap.get(i));
        }
        return sum;
    }
}