-- ──────────────────────────────────────────────────
-- Problem  : 602. Friend Requests II: Who Has the Most Friends
-- Difficulty: Medium
-- Tags     : Database
-- Link     : https://leetcode.com/problems/friend-requests-ii-who-has-the-most-friends/
-- Runtime  : 370 ms (beats 31%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 SnehaAnand21. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

select requester_id as id , count(requester_id) as num
from (select requester_id from RequestAccepted 
union all
select accepter_id from RequestAccepted) as temp
group by id
order by num desc limit 1 ;