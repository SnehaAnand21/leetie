// ──────────────────────────────────────────────────
// Problem  : 1. Two Sum
// Difficulty: Easy
// Tags     : Array, Hash Table
// Link     : https://leetcode.com/problems/two-sum/
// Runtime  : 116 ms (beats 5%)
// Memory   : 18336000 (beats 5%)
// Language : c
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

#include <stdlib.h>

#define TABLE_SIZE 10009  // A prime number for better hashing

// Entry for hash map
typedef struct {
    int key;
    int value;
    int used;
} HashEntry;

// Hash function (basic modulus)
int hash(int key) {
    return abs(key) % TABLE_SIZE;
}

// Insert into hash table
void insert(HashEntry* table, int key, int value) {
    int index = hash(key);
    while (table[index].used) {
        index = (index + 1) % TABLE_SIZE;
    }
    table[index].key = key;
    table[index].value = value;
    table[index].used = 1;
}

// Search for a key
int find(HashEntry* table, int key, int* value) {
    int index = hash(key);
    int start = index;
    while (table[index].used) {
        if (table[index].key == key) {
            *value = table[index].value;
            return 1;
        }
        index = (index + 1) % TABLE_SIZE;
        if (index == start) break;
    }
    return 0;
}

int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    // Create a hash table
    HashEntry* table = (HashEntry*)calloc(TABLE_SIZE, sizeof(HashEntry));
    int* result = (int*)malloc(2 * sizeof(int));
    
    // Iterate through the array and use hash table to check for complement
    for (int i = 0; i < numsSize; i++) {
        int complement = target - nums[i];
        int index;
        
        // If the complement is found in the hash table, return the result
        if (find(table, complement, &index)) {
            result[0] = index;
            result[1] = i;
            *returnSize = 2;
            free(table);  // Clean up allocated memory
            return result;
        }
        
        // Otherwise, insert the current number with its index into the table
        insert(table, nums[i], i);
    }

    // No solution found (per problem statement, this won't happen)
    *returnSize = 0;
    free(result);  // Clean up
    free(table);   // Clean up
    return NULL;
}
