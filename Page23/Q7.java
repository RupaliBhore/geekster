// // HW_Count Odd Pair
// Take the array of size n and their values from user. And Find Pairs whose sum is odd.

// Input Format

// First line contains an integer number n representing size of array.

// Second line contains n numbers representing elements of the array and all element will be unique.

// Constraints

// 1 <= n <= 100000

// 0 <= array[index] <= 100000
// Output Format

// Print the required pairs in different lines.

// Sample Input 0

// 3
// 1 2 3
// Sample Output 0

// 1 2
// 2 1
// 2 3
// 3 2
// Explanation 0

// arr[0]+arr[1] = 1+2 = odd

// arr[1]+arr[0] = 2+1 = odd

// arr[1]+arr[3] = 2+3 = odd

// arr[0]+arr[1] = 1+2 = odd

import java.util.*;

public class Q7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr [i] = scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((arr[i] + arr[j]) % 2 != 0) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}