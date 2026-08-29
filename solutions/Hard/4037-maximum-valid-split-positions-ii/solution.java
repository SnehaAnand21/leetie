// ──────────────────────────────────────────────────
// Problem  : 4037. Maximum Valid Split Positions II
// Difficulty: Hard
// Tags     : N/A
// Link     : https://leetcode.com/problems/maximum-valid-split-positions-ii/
// Runtime  : 304 ms (beats 68%)
// Memory   : 191396000 (beats 45%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {

    private int[][] st;
    private int[] log;

    public int maxValidSplits(int[] nums) {
        int n = nums.length;
        buildSparseTable(nums);

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = gcd(prefix[i - 1], nums[i]);
        }

        suffix[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = gcd(nums[i], suffix[i + 1]);
        }

        int res = getScoreWithoutRemoval(prefix, suffix);

        for (int remove = 0; remove < n; remove++) {
            if (n == 2) {
                continue;
            }

            int leftGcd = (remove == 0) ? 0 : prefix[remove - 1];
            int rightGcd = (remove == n - 1) ? 0 : suffix[remove + 1];
            int totalGcd = gcd(leftGcd, rightGcd);

            int first = findFirst(remove, totalGcd, prefix, n);
            int last = findLast(remove, totalGcd, suffix, n);

            if (first != -1 && last != -1) {
                int firstIndex = first - (first > remove ? 1 : 0);
                int lastIndex = last - (last > remove ? 1 : 0);

                res = Math.max(res, lastIndex - firstIndex);
            }
        }

        return res;
    }

    private int getScoreWithoutRemoval(int[] prefix, int[] suffix) {
        int n = prefix.length;
        int totalGcd = prefix[n - 1];

        int first = -1;
        int last = -1;

        for (int i = 0; i < n; i++) {
            if (prefix[i] == totalGcd) {
                first = i;
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (suffix[i] == totalGcd) {
                last = i;
                break;
            }
        }

        if (first == -1 || last == -1) {
            return 0;
        }

        return Math.max(0, last - first);
    }

    private int findFirst(int remove, int target, int[] prefix, int n) {

        if (remove > 0) {
            int lo = 0;
            int hi = remove - 1;

            while (lo < hi) {
                int mid = lo + (hi - lo) / 2;

                if (prefix[mid] <= target) {
                    hi = mid;
                } else {
                    lo = mid + 1;
                }
            }

            if (prefix[lo] == target) {
                return lo;
            }
        }

        int start = remove + 1;

        if (start >= n) {
            return -1;
        }

        int base = (remove == 0) ? 0 : prefix[remove - 1];

        int lo = start;
        int hi = n - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            int current = gcd(
                    base,
                    rangeGcd(remove + 1, mid));

            if (current <= target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        int current = gcd(
                base,
                rangeGcd(remove + 1, lo));

        if (current == target) {
            return lo;
        }

        return -1;
    }

    private int findLast(int remove, int target, int[] suffix, int n) {

        if (remove < n - 1) {
            int lo = remove + 1;
            int hi = n - 1;

            while (lo < hi) {
                int mid = lo + (hi - lo + 1) / 2;

                if (suffix[mid] <= target) {
                    lo = mid;
                } else {
                    hi = mid - 1;
                }
            }

            if (suffix[lo] == target) {
                return lo;
            }
        }

        int end = remove - 1;

        if (end < 0) {
            return -1;
        }

        int base = (remove == n - 1) ? 0 : suffix[remove + 1];

        int lo = 0;
        int hi = end;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            int current = gcd(
                    rangeGcd(mid, remove - 1),
                    base);

            if (current <= target) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }

        int current = gcd(
                rangeGcd(lo, remove - 1),
                base);

        if (current == target) {
            return lo;
        }

        if (lo > 0) {
            int candidate = lo - 1;

            current = gcd(
                    rangeGcd(candidate, remove - 1),
                    base);

            if (current == target) {
                return candidate;
            }
        }

        return -1;
    }

    private void buildSparseTable(int[] nums) {
        int n = nums.length;

        log = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            log[i] = log[i / 2] + 1;
        }

        int levels = log[n] + 1;

        st = new int[levels][n];

        for (int i = 0; i < n; i++) {
            st[0][i] = nums[i];
        }

        for (int level = 1; level < levels; level++) {
            int len = 1 << level;
            int half = len >> 1;

            for (int i = 0; i + len <= n; i++) {
                st[level][i] = gcd(
                        st[level - 1][i],
                        st[level - 1][i + half]);
            }
        }
    }

    private int rangeGcd(int left, int right) {
        if (left > right) {
            return 0;
        }

        int len = right - left + 1;
        int level = log[len];

        return gcd(st[level][left],
                st[level][right - (1 << level) + 1]);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}