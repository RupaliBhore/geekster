// // Print the array elements linewise

import java.util.*;
public class Q10 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the size of the array
        int N = scanner.nextInt();
        // Initialize an array of size N
        int[] arr = new int[N];
        // Read N integers into the array
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        // Print each element of the array in a new line
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        } 
        scanner.close();
    }
}

//Time Complexity: O(N) because both reading the integers into the array and printing them involve iterating through the array of size N.

// Space Complexity: O(N) due to the storage of the array of size 



// Question
// Take n as an integer input. Declare an array of size n that stores value of int data-type.

// Then take n integer inputs and store them in the array one by one.

// And print each integer in each line.

// Input Format

// first line contains integer N as size of array.

// Second line contains N integers representing size of array.

// Constraints

// 1 <= arr.length <= 1000000
// 1 <= arr[i] <= 1000000
// Output Format

// Print the array element in different line.

// Sample Input 0

// 5
// 1
// 2
// 3
// 4
// 5
// Sample Output 0

// 1
// 2
// 3
// 4
// 5
// Explanation 0

// given size of array n. we store all 5 elements in the array. And printed them in different line in given format.

// Submissions: 46
// Max Score: 10
// Difficulty: Medium
// Rate This Challenge:

    
// More
 

