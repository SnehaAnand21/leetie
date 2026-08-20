-- ──────────────────────────────────────────────────
-- Problem  : 262. Trips and Users
-- Difficulty: Hard
-- Tags     : Database
-- Link     : https://leetcode.com/problems/trips-and-users/
-- Runtime  : 576 ms (beats 69%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 SnehaAnand21. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

SELECT 
    request_at AS Day,
    ROUND(
        SUM(status IN ('cancelled_by_client', 'cancelled_by_driver')) / COUNT(*), 
        2
    ) AS 'Cancellation Rate'
FROM Trips
WHERE client_id NOT IN (
        SELECT users_id 
        FROM Users 
        WHERE banned = 'Yes' AND role = 'client'
    )
    AND driver_id NOT IN (
        SELECT users_id 
        FROM Users 
        WHERE banned = 'Yes' AND role = 'driver'
    )
    AND request_at BETWEEN '2013-10-01' AND '2013-10-03'
GROUP BY request_at;