-- ──────────────────────────────────────────────────
-- Problem  : 570. Managers with at Least 5 Direct Reports
-- Difficulty: Medium
-- Tags     : Database
-- Link     : https://leetcode.com/problems/managers-with-at-least-5-direct-reports/
-- Runtime  : 323 ms (beats 97%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 SnehaAnand21. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

SELECT name 
FROM Employee 
WHERE id IN (
    SELECT managerId 
    FROM Employee 
    GROUP BY managerId 
    HAVING COUNT(*) >= 5)
    