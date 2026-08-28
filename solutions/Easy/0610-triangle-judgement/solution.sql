-- ──────────────────────────────────────────────────
-- Problem  : 610. Triangle Judgement
-- Difficulty: Easy
-- Tags     : Database
-- Link     : https://leetcode.com/problems/triangle-judgement/
-- Runtime  : 315 ms (beats 56%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 SnehaAnand21. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

select
    x, y, z,
    if(x+y+z > 2*greatest(x, y, z), 'Yes', 'No') as triangle
from triangle