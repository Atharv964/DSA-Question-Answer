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
