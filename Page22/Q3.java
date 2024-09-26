// // Update query 1
// Given an array of size n with intial values. Take left, right as integer inputs such that 0 <= left, right < arr.length and also take x as an integer input.

// Then update the given array from the index-left till the index-right(both left index and right index included) with the element x. In the end print all the elements of the array such that each element is printed in a separate line.

// Input Format

// First line contains an integer number n representing size of array.

// Second line contains n integer numbers representing elements of an array.

// Third line contains two Integer number representing range i.e left and right.

// Fourth line contains an integer number x.

// Constraints

// 1 <= n <= 100000

// 0 <= array[index] <= 100000

// 0 <= left <= right < n

// 0 <= x <= 100000
// Output Format

// Print N numbers in a single line.

// Sample Input 0

// 10
// 1 2 3 4 5 6 7 8 9 10
// 2 8
// 0
// Sample Output 0

// 1 2 0 0 0 0 0 0 0 10
// Explanation 0

// We are given range of 2 to 8, so we update all the index from left to right with given value of x i.e 0. And printed the answer in sinle line.

import java.util.*;

public class Q3 {

       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the array
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Read the left and right indices
        int left = scanner.nextInt();
        int right = scanner.nextInt();
        
        // Read the value to update
        int x = scanner.nextInt();
        
        // Update the array from left to right index with the value x
        for (int i = left; i <= right; i++) {
            array[i] = x;
        }
        
        // Print the updated array
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}