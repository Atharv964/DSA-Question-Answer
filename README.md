# DSA Practice Repository

This repository is a personal collection of **Data Structures and Algorithms (DSA)** problems that I solve during my practice journey. It will be updated regularly as I learn and implement new concepts.

---

## ✅ Current Programs

### 1. Palindrome Checker

**Description**:  
Checks whether a given string is a palindrome or not. A palindrome is a word, number, or sequence that reads the same backward as forward (e.g., "madam", "121").

### 2. Reverse of String

**Description**:
Reverses a given string. For example, "hello" becomes "olleh". This is useful for understanding string manipulation and is often used as a basic exercise in programming interviews.

### 3. Reverse Words in a Sentence

**Description**
This Java program reverses the order of words in a given sentence. It uses a Stack data structure to reverse the words without changing the characters within each word.

For example, input: "Java is fun" → output: "fun is Java"

### 4. Check if Two Strings are Rotations

**Description**
This Java program checks whether one string is a rotation of another using a more efficient approach with StringBuilder. A string s2 is considered a rotation of string s1 if it can be obtained by rotating s1 circularly.

For example:
Input → s1 = "aab", s2 = "aba"
Output → true (since "aba" is a rotation of "aab")

### 5. Maximum Subarray Sum (Kadane's Algorithm)

**Description**
This Java program implements Kadane’s Algorithm to find the maximum subarray sum in a given integer array. It efficiently handles arrays with both positive and negative numbers. The algorithm maintains a running sum (cs) and updates a global maximum sum (ms) as it iterates through the array.
If all elements are negative, the algorithm still correctly returns the least negative number (i.e., the maximum possible subarray sum).

For example:
Input → nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output → 6 (The subarray [4, -1, 2, 1] has the maximum sum)

### 6. Color Sort (Dutch National Flag Algorithm)

**Description**
This Java program implements the Dutch National Flag Algorithm to sort an array containing only three types of elements: 0s, 1s, and 2s. It rearranges the elements in a single pass using constant space, making it highly efficient for sorting colors or categorical data.

The algorithm uses three pointers:

    low → marks the boundary for 0s
    mid → current element under consideration
    high → marks the boundary for 2s

By swapping elements as needed, the algorithm ensures that:

    all 0s come before 1s
    all 2s come after 1s

**For example:**
Input → nums = [2, 0, 2, 1, 1, 0]
Output → [0, 0, 1, 1, 2, 2]

### 7. Majority Element (Moore's Voting Algorithm)

**Description:**
This Java program implements Moore’s Voting Algorithm to find the majority element in a given integer array. A majority element is defined as the element that appears more than ⌊n/2⌋ times in the array. The algorithm works in linear time and constant space by maintaining a candidate (ans) and a counter (freq).

As it iterates through the array:
    If the counter is zero, it chooses the current element as the new candidate.
    If the current element matches the candidate, the counter is incremented; otherwise, it is decremented.
    At the end of the iteration, the candidate is the majority element.

This approach is efficient and does not require additional data structures like hash maps.

**Example:**
Input → nums = [2, 2, 1, 1, 1, 2, 2]
Output → 2 (The element 2 appears more than n/2 times)

### 8. Merge Two Sorted Arrays (LeetCode 88)

**Description:**
This Java program merges two sorted integer arrays nums1 and nums2 into a single sorted array in non-decreasing order. The merge is performed in-place using the extra space available in nums1.

The algorithm uses three pointers:

    One pointer i at the end of the initial elements of nums1.
    Another pointer j at the end of nums2.
    A third pointer k at the very end of nums1 (which has enough space for all elements).

It compares elements from the back of both arrays and places the larger element at index k. This continues until all elements are merged.

This approach ensures O(m+n) time complexity and does not require additional space.

**Example:**
Input → nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output → [1,2,2,3,5,6]


### 9. Single Number (LeetCode 136)

**Description:**
This Java program finds the element in an integer array that appears only once, while all other elements appear exactly twice.

The algorithm uses the XOR (^) bitwise operator because of its properties:

    a ^ a = 0
    a ^ 0 = a

By XORing all elements together, the duplicate numbers cancel each other out, leaving only the element that appears once.

This method runs in O(n) time and uses O(1) space.

**Example:**
Input → nums = [4,1,2,1,2]
Output → 4


### 10. Power of x to the power n (LeetCode 50)

**Description:**
This Java program calculates x^n (x raised to the power n) using Exponentiation by Squaring, which optimizes the number of multiplications.

The algorithm handles three cases:

    If n = 0, return 1.
    If n is negative, compute the power for -n and return its reciprocal.
    Use the recursive relation:
        If n is even → x^n = (x * x)^(n/2)
        If n is odd → x^n = x * (x * x)^((n-1)/2)

This approach ensures O(log n) time complexity.

**Example:**
Input → x = 2.00000, n = 10
Output → 1024.00000

### 11. Spiral Matrix (LeetCode 54)

**Description:**
This Java program prints all elements of a 2D matrix in a spiral order (clockwise traversal). The algorithm keeps track of four boundaries: top, bottom, left, and right, and iteratively traverses the matrix layer by layer.

The order of traversal:

    Left to Right across the top row.
    Top to Bottom along the right column.
    Right to Left across the bottom row.
    Bottom to Top along the left column.

After each full loop, the boundaries are updated to move inward.

**Example:**
Input → matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output → [1,2,3,6,9,8,7,4,5]

### 12. Search a 2D Matrix (LeetCode 74)

**Description:**
This Java program searches for a target element in a 2D matrix with the following properties:

    Each row is sorted in ascending order.
    The first integer of each row is greater than the last integer of the previous row.

The matrix is treated as a flattened 1D sorted array for binary search. Index conversion is done as:

    Row → mid / number_of_columns
    Column → mid % number_of_columns

This ensures an efficient O(log(m*n)) time complexity.

**Example:**
Input → matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output → true

### 13. Container With Most Water (LeetCode 11)

**Description:**
This Java program finds the maximum water that can be trapped between two lines on the x-axis, given by an array where each element represents height.

It uses the two-pointer approach:

    Initialize pointers at both ends of the array.
    Calculate the area formed and update the maximum.
    Move the pointer with the shorter line inward, hoping to find a taller line that might increase the area.

Time complexity is O(n) due to single-pass iteration.

**Example:**
Input → height = [1,8,6,2,5,4,8,3,7]
Output → 49

### 14. 3Sum (LeetCode 15)

**Description:**
This Java program finds all unique triplets in an array that sum up to zero. Each triplet must consist of three different indices (i, j, k) such that nums[i] + nums[j] + nums[k] == 0.

It uses a combination of sorting and the two-pointer technique:

    First, sort the array.
    Fix one element (nums[i]) and use two pointers (j, k) to search for the remaining two numbers such that the sum is zero.
    Skip duplicates to avoid repeating the same triplet.

Time complexity is O(n²) due to the nested loop and two-pointer traversal.

**Example:**
Input → nums = [-1, 0, 1, 2, -1, -4]
Output → [[-1, -1, 2], [-1, 0, 1]]

### 15. 4Sum (LeetCode 18)

**Description:**
This Java program finds all unique quadruplets (four elements) in an array that sum up to a given target.

It extends the 3Sum approach:
    Sort the array.
    Fix two elements (i and j), then use two pointers (left and right) to find pairs that, along with the fixed elements, sum to the target.
    Skip duplicates to avoid repeating the same quadruplet.

Time complexity is O(n³) due to three nested loops (two fixed, two-pointer for the rest).

**Example:**
Input → nums = [1, 0, -1, 0, -2, 2], target = 0
Output → [[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]