-- ──────────────────────────────────────────────────
-- Problem  : 196. Delete Duplicate Emails
-- Difficulty: Easy
-- Tags     : Database
-- Link     : https://leetcode.com/problems/delete-duplicate-emails/
-- Runtime  : 917 ms (beats 50%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 SnehaAnand21. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

DELETE p FROM Person p
JOIN Person p2 
ON p.Email = p2.Email AND p.Id > p2.Id;