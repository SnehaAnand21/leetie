// ──────────────────────────────────────────────────
// Problem  : 609. Find Duplicate File in System
// Difficulty: Medium
// Tags     : Array, Hash Table, String
// Link     : https://leetcode.com/problems/find-duplicate-file-in-system/
// Runtime  : 0 ms (beats 0%)
// Memory   : 43060000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> contMap = new HashMap<>();
        StringBuilder pathfile = new StringBuilder();
        for (String pStr : paths) {
            int i = 0;
            pathfile.setLength(0);
            while (pStr.charAt(i) != ' ') i++;
            pathfile.append(pStr.substring(0,i)).append('/');
            int pLen = ++i;
            for (int j = i, k = 0; i < pStr.length(); i++)
                if (pStr.charAt(i) == '(') {
                    pathfile.append(pStr.substring(j,i));
                    k = i + 1;
                } else if (pStr.charAt(i) == ')') {
                    String cont = pStr.substring(k, i);
                    if (!contMap.containsKey(cont))
                        contMap.put(cont, new ArrayList<>());
                    contMap.get(cont).add(pathfile.toString());
                    j = i + 2;
                    pathfile.setLength(pLen);
                }
        }
        List<List<String>> ans = new ArrayList<>();
        for (List<String> v : contMap.values())
            if (v.size() > 1) ans.add(v);
        return ans;
    }
}