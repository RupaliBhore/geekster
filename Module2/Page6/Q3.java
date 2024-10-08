// // Print Prefix Sum between L and R

// Take an integer input l and r such that l,r<=array.length. Given an array. Make a prefix sum array from this. The print the sum of the elements inside the array starting from the l-index till the r-index(l and r both inclusive).

// Input Format

// First line contains integer N as size of array.

// Second line contains N integer values as array elements.

// Third line contains L and R integer values

// Constraints

// 1 <= N <= 10^4

// -10^4 <= A[i] <= 10^4

// 0 <= L < R <= N
// Output Format

// Return the prefix arrays in range.

// Sample Input 0

// 5
// 1
// 2
// 8
// 4
// 10
// 1
// 3
// Sample Output 0

// 3
// 11
// 15
// Explanation 0

// Prefix Array of the given array is 1 2 8 4 10 1 3 11 15 25 Idx 1,3 Prefix Sum array from 1 to 3 is 3 11 15

// Finded

// import java.util.*;

// public class Q3 {
//   public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Read the size of the array
//         int N = scanner.nextInt();
//         int[] arr = new int[N];

//         // Read the elements of the array
//         for (int i = 0; i < N; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         // Read the L and R values
//         int L = scanner.nextInt();
//         int R = scanner.nextInt();

//         // Generate the prefix sum array
//         int[] prefix = generatePrefixSumArray(arr);

//         // Print the prefix sums from L to R
//         for (int i = L; i <= R; i++) {
//             System.out.println(prefix[i]);
//         }

//         scanner.close();
//     }

//     public static int[] generatePrefixSumArray(int[] arr) {
//         int N = arr.length;
//         int[] prefix = new int[N];

//         // Initialize the first element of the prefix sum array
//         prefix[0] = arr[0];

//         // Compute the prefix sum array
//         for (int i = 1; i < N; i++) {
//             prefix[i] = prefix[i - 1] + arr[i];
//         }

//         return prefix;
//     }
// }

//Discussed

import java.util.*;

public class Q3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scn.nextInt();
        }

        int l = scn.nextInt();
        int r = scn.nextInt();

        // prefix sum array -- psa
        int[] psa = new int[n];
        psa[0] = A[0];
        for (int i = 1; i < n; i++) {
            psa[i] = psa[i - 1] + A[i];
        }
        // print from 1 to r
        for (int i = l; i <= r; i++) {
            System.out.println(psa[i]);
        }
    }
}