# DSA Practice Repository

This repository is a personal collection of **Data Structures and Algorithms (DSA)** problems that I solve during my practice journey. It will be updated regularly as I learn and implement new concepts.

---

## ✅ Current Programs

### 1. Palindrome Checker

**Description**:  
Checks whether a given string is a palindrome or not. A palindrome is a word, number, or sequence that reads the same backward as forward (e.g., "madam", "121").

**Logic**:
- Use two pointers: one starting from the beginning and the other from the end of the string.
- Compare the characters at both pointers.
- Move the pointers towards the center.
- If all corresponding characters match, the string is a palindrome.

### 2. Reverse of String

**Description**:
Reverses a given string. For example, "hello" becomes "olleh". This is useful for understanding string manipulation and is often used as a basic exercise in programming interviews.

**Logic**:

    - Accept a string as input from the user.
    - Use the StringBuilder class to create a mutable sequence of characters.
    - Call the .reverse() method of StringBuilder to reverse the string in-place.
    - Convert the result back to a string and display the reversed string.

**Steps**:

    -Create a StringBuilder object using the input string.
    -Call reverse() on the StringBuilder object.
    -Use toString() to convert the reversed content back to a String.
    -Output the reversed string.