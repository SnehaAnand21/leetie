-- ──────────────────────────────────────────────────
-- Problem  : 619. Biggest Single Number
-- Difficulty: Easy
-- Tags     : Database
-- Link     : https://leetcode.com/problems/biggest-single-number/
-- Runtime  : 108 ms (beats 0%)
-- Memory   : 0B (beats 0%)
-- Language : mysql
-- Copyright: (c) 2026 SnehaAnand21. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

# Write your MySQL query statement below
select MAX(num) as num
from MyNumbers
where num in(select num 
            from MyNumbers 
            group by num 
            having count(*)=1);