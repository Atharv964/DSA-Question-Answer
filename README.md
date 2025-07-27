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

### 3. Reverse Words in a Sentence

**Description**
This Java program reverses the order of words in a given sentence. It uses a Stack data structure to reverse the words without changing the characters within each word.

For example, input: "Java is fun" → output: "fun is Java"

**Logic**

    Accept a sentence from the user using Scanner.
    Traverse the sentence character by character.
    Build each word using a StringBuilder until a space is found.
    Push each word onto a Stack.
    After the traversal, pop all words from the stack and append them into a new StringBuilder with spaces.
    Display the final reversed sentence.

**Key Concepts Used**

    Stack (LIFO - Last In, First Out)
    StringBuilder for efficient string manipulation
    String and character operations
    Basic I/O using Scanner


### 4. Check if Two Strings are Rotations

**Description**
This Java program checks whether one string is a rotation of another using a more efficient approach with StringBuilder. A string s2 is considered a rotation of string s1 if it can be obtained by rotating s1 circularly.

For example:
Input → s1 = "aab", s2 = "aba"
Output → true (since "aba" is a rotation of "aab")

**Logic**

    Accept two strings from the user using Scanner.
    Use a StringBuilder to hold the first string (s1) for efficient character manipulation.
    Loop through the length of the string and in each iteration:
    Check if the current string matches s2. If yes, return true.
    Otherwise, rotate the string once to the right by:
    Removing the last character and inserting it at the beginning.
    If no match is found after all rotations, return false.

**Key Concepts Used**

    StringBuilder for efficient and mutable string manipulation
    String immutability in Java (avoiding repeated creation of new objects)
    Character operations for rotating the string
    Looping and conditionals
    Basic I/O using Scanner