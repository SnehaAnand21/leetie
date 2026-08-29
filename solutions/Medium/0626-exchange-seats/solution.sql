-- ──────────────────────────────────────────────────
-- Problem  : 626. Exchange Seats
-- Difficulty: Medium
-- Tags     : Database
-- Link     : https://leetcode.com/problems/exchange-seats/
-- Runtime  : 77 ms (beats 0%)
-- Memory   : 0B (beats 0%)
-- Language : mysql
-- Copyright: (c) 2026 SnehaAnand21. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

# Write your MySQL query statement below
SELECT 
    id,
    CASE
        WHEN id % 2 = 0 THEN LAG(student) OVER(ORDER BY id)
        ELSE COALESCE(LEAD(student) OVER(ORDER BY id), student)
    END AS student
FROM Seat