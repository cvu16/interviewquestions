The basic idea is, keep a hashmap which stores the characters in string as keys and their positions as values, and keep two pointers which define the max substring. move the right pointer to scan through the string , and meanwhile update the hashmap.

If the character is already in the hashmap, then move the left pointer to the right of the same character last found. Note that the two pointers can only move forward.

In the solution, the hashmap is converted to an array with similar function.
