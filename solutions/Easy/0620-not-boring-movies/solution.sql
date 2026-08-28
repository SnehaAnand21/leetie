-- ──────────────────────────────────────────────────
-- Problem  : 620. Not Boring Movies
-- Difficulty: Easy
-- Tags     : Database
-- Link     : https://leetcode.com/problems/not-boring-movies/
-- Runtime  : 292 ms (beats 47%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 SnehaAnand21. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

/* Write your PL/SQL query statement below */
SELECT * FROM Cinema WHERE MOD( id, 2) = 1 AND 

description <> 'boring' ORDER BY rating DESC