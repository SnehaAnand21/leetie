-- ──────────────────────────────────────────────────
-- Problem  : 596. Classes With at Least 5 Students
-- Difficulty: Easy
-- Tags     : Database
-- Link     : https://leetcode.com/problems/classes-with-at-least-5-students/
-- Runtime  : 346 ms (beats 62%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 SnehaAnand21. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;