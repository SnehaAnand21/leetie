-- ──────────────────────────────────────────────────
-- Problem  : 627. Swap Sex of Employees
-- Difficulty: Easy
-- Tags     : Database
-- Link     : https://leetcode.com/problems/swap-sex-of-employees/
-- Runtime  : 259 ms (beats 68%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 SnehaAnand21. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

UPDATE Salary 
SET sex = (CASE WHEN sex = 'f' THEN 'm' ELSE 'f' END) 