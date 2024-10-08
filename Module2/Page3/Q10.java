// // HW_Sum Equals One

// Liam is a stock trader who is analyzing the stock prices of a company. He has stored the stock prices in an array of size N. Liam wants to find out if there is a subarray of the stock prices whose sum is one. If such a subarray exists, Liam can take advantage of it to make a profit.

// Can you write a program to help Liam determine whether the array contains a subarray whose sum is one?

// Input Format

// An Integer input N representing size of array

// N integer input representing elements of an array

// Constraints

// 1<=N<=9

// -10^6<=A[i]<=10^6
// Output Format

// Return true/false

// Sample Input 0

// 5
// -1 1 2 3 -2
// Sample Output 0

// true
// Explanation 0

// 3 + (-2) = 1 Also, 1 is itself an subarray


import java.util.*;

public class Q10 {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        int N = scanner.nextInt();
        int[] arr = new int[N];

        // Input the elements of the array
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Target sum to find
        int target = 1;

        // Use a set to store cumulative sums
        HashSet<Integer> cumulativeSumSet = new HashSet<>();
        int cumulativeSum = 0;
        boolean found = false;

        // Check for the subarray with sum equal to the target
        for (int num : arr) {
            cumulativeSum += num;

            // Check if the cumulative sum equals the target or if the difference exists in the set
            if (cumulativeSum == target || cumulativeSumSet.contains(cumulativeSum - target)) {
                found = true;
                break;
            }

            // Add the cumulative sum to the set
            cumulativeSumSet.add(cumulativeSum);
        }

        // Output the result
        System.out.println(found);

        scanner.close();
    }
}