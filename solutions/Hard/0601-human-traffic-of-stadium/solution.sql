-- ──────────────────────────────────────────────────
-- Problem  : 601. Human Traffic of Stadium
-- Difficulty: Hard
-- Tags     : Database
-- Link     : https://leetcode.com/problems/human-traffic-of-stadium/
-- Runtime  : 1340 ms (beats 5%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 SnehaAnand21. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

with q1 as (
select *, id - row_number() over() as id_diff
from stadium
where people > 99
)
select id, visit_date, people
from q1
where id_diff in (select id_diff from q1 group by id_diff having count(*) > 2)
order by visit_date