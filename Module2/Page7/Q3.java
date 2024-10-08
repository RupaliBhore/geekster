// // HW_Lucky Number 26

// Given an array arr of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value. Return the largest lucky integer in the array. If there is no lucky integer return -1.

// Input Format

// N as size
// N int value as array elements
// Constraints

// 1<=N<=10^5
// 1<=arr[i]<10
// Output Format

// Lucky Number

// Sample Input 0

// 5
// 1 2 2 3 4
// Sample Output 0

// 2
// Explanation 0

// There are two lucky numbers:

// 1 because frequency of 1 is equals to 1

// 2 because frequency of 2 is equals to 2.

// 2 is largest among the two lucky numbers, hence output is 2.


import java.util.*;

public class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int N = scanner.nextInt();

        // Initialize the frequency array for digits 1 through 9
        int[] frequency = new int[10];

        // Read array elements and populate the frequency array
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num >= 1 && num <= 9) {
                frequency[num]++;
            }
        }

        // Find the largest lucky integer
        int largestLucky = -1;
        for (int i = 1; i <= 9; i++) {
            if (frequency[i] == i) {
                largestLucky = i;
            }
        }

        // Print the result
        System.out.println(largestLucky);

        scanner.close();
    }
}