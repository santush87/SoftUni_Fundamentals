1.	Encrypt, Sort and Print Array
Write a program that reads a sequence of strings from the console. Encrypt every string by summing:
•	The code of each vowel multiplied by the string length
•	The code of each consonant divided by the string length
Sort the number sequence in ascending order and print it on the console.
On the first line, you will always receive the number of strings you have to read.
<p>Examples</p>

![Screenshot_1](https://user-images.githubusercontent.com/73018624/176996219-664262e1-6d35-4ab8-9a8a-10ef695a04cb.jpg)

2.	Pascal Triangle
The triangle may be constructed in the following manner: In row 0 (the topmost row), there is a unique nonzero entry 1. Each entry of each subsequent row is constructed by adding the number above and to the left with the number above and to the right, treating blank entries as 0. For example, the initial number in the first (or any other) row is 1 (the sum of 0 and 1), whereas the numbers 1 and 3 in the third row are added to produce the number 4 in the fourth row.
If you want more info about it: https://en.wikipedia.org/wiki/Pascal's_triangle
Print each row element separated with whitespace.
<p>Examples</p>

![Screenshot_2](https://user-images.githubusercontent.com/73018624/176996263-25c779e6-766a-4e42-a374-2eab1e9b7a33.jpg)


3.	Recursive Fibonacci
The Fibonacci sequence is quite a famous sequence of numbers. Each member of the sequence is calculated from the sum of the two previous elements. The first two elements are 1, 1. Therefore the sequence goes like 1, 1, 2, 3, 5, 8, 13, 21, 34…
The following sequence can be generated with an array, but that’s easy, so your task is to implement recursively.
So if the function GetFibonacci(n) returns the n’th Fibonacci number we can express it using GetFibonacci(n) = GetFibonacci(n-1) + GetFibonacci(n-2).
However, this will never end and in a few seconds, a StackOverflow Exception is thrown. For the recursion to stop it has to have a "bottom". The bottom of the recursion is GetFibonacci(2) should return 1 and GetFibonacci(1) should return 1.
Input
•	On the only line in the input, the user should enter the wanted Fibonacci number.
Output
•	The output should be the n’th Fibonacci number counting from 1.
Constraints
•	1 ≤ N ≤ 50
<p>Examples</p>

![Screenshot_3](https://user-images.githubusercontent.com/73018624/176996300-6cbf366e-eb30-4e89-b388-3bffabddc900.jpg)

For the Nth Fibonacci number, we calculate the N-1th and the N-2th number, but for the calculation of the N-1th number we calculate the N-1-1th(N-2th) and the N-1-2th number, so we have a lot of repeated calculations.

![Screenshot_4](https://user-images.githubusercontent.com/73018624/176996325-7bad9e1a-3152-4cde-ac88-f6d3ea36cf3d.jpg)
