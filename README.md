# Dyanmic-Programming
An assignment that I've solved for my algorithms class at Penn Sate. Using 4 different approaches to solve the Lego Towers problem. 
Approaches include: 
-Top-Down using hash map as a memo table 
-Bottom-up using a hash map as a memo table
-Bottom-up using an array as an memo table 
-Bottom-up using a constant amount of space for the memo table

Problem Description:
  Alice is building a tower out of legos, and would like it to be exactly 30 centimeters tall. She has lego blocks that are 2 cms, 3 cms, 6 cms, 7 cms, and 8 cms tall, and she is
  wondering how many different ways she could arrange the blocks so that she could make this tower.

  After alot of thought, she was surprised to find that there are actually 28,542 different sequences of different block heights in towers of height 30 cm. She wants your help to
  create a program that will let her calculate the total number of height sequences that can lead to towers of other heights.

Input Format: Input will consist of a single integer n.\
Constraints: 0 ≤ n ≤ 108\
Output Format: Output the total number of sequences of heights that sum n centimeters, 
               given that at we have an unlimited number blocks that are of height 2, 3, 6, 7, and 8 cms.
               
Sample Input: 8\
Sample Output: 7\
Explanation: There are 7 sequences of block heights that lead to a tower that is 8 cms tall:\
             1. 2, 2, 2, 2\
             2. 2, 3, 3\
             3. 2, 6\
             4. 3, 2, 3\
             5. 3, 3, 2\
             6. 6, 2\
             7. 8\
             \
Sample Input 2: 150\
Sample Output 2: 232772521\
Explanation 2: There are 2,378,571,319,779,247,918,121,475 ways to make towers that are 150 cms tall. The final number is taken mod 1,000,000,009 to produce the answer.

Note: You will probably want to apply the mod operation to all of your intermediate results so that you do not end up with integer overflow.
