-- ──────────────────────────────────────────────────
-- Problem  : 607. Sales Person
-- Difficulty: Easy
-- Tags     : Database
-- Link     : https://leetcode.com/problems/sales-person/
-- Runtime  : 145 ms (beats 0%)
-- Memory   : 0B (beats 0%)
-- Language : mysql
-- Copyright: (c) 2026 SnehaAnand21. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

SELECT s.name
  FROM Orders o
      JOIN Company c
          ON o.com_id = c.com_id
         AND c.name = 'RED'
      RIGHT JOIN SalesPerson s
          ON s.sales_id = o.sales_id
 WHERE o.sales_id IS NULL;