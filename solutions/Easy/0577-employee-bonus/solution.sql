-- ──────────────────────────────────────────────────
-- Problem  : 577. Employee Bonus
-- Difficulty: Easy
-- Tags     : Database
-- Link     : https://leetcode.com/problems/employee-bonus/
-- Runtime  : 1056 ms (beats 62%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 SnehaAnand21. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

# Write your MySQL query statement below
select name , bonus from Employee left join Bonus on employee.empId = bonus.empId
where bonus < 1000 or bonus is Null