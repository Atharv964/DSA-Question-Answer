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
