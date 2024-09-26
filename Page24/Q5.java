// // HW_Repeating and Missing element

// Given an array arr[] of size N of positive integers(1 - N). One number 'A' from set {1, 2, …N} is missing and one number 'B' occurs twice in array. Write a program to print the repeating element and the missing element in array.

// Input Format

// First line contains integer input N (size of array).

// Second line contains n integers of arr[] elements.

// Constraints

// 1 ≤ N ≤ 10^4

// 1 ≤ arr[i] ≤ N
// Output Format

// In the first line print repeating element.

// In the second line contains print missing element.

// Sample Input 0

// 4
// 1 2 4 4
// Sample Output 0

// 4
// 3
// Explanation 0

// Repeating number is 4 and smallest positive missing number is 3 in given array.

// Sample Input 1

// 5
// 1 1 2 3 4
// Sample Output 1

// 1
// 5
// Explanation 1

// Repeating number is 1 and positive missing number is 5 in given array.

// import java.util.*;

// public class Q5 {

//       public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input size of array
//         int N = scanner.nextInt();
//         int[] arr = new int[N];
        
//         // Input elements of array
//         for (int i = 0; i < N; i++) {
//             arr[i] = scanner.nextInt();
//         }
        
//         // Calculate expected sum and sum of squares for numbers 1 to N
//         int expectedSum = N * (N + 1) / 2;
//         int expectedSumSquares = N * (N + 1) * (2 * N + 1) / 6;
        
//         // Calculate actual sum and sum of squares from the given array
//         int actualSum = 0;
//         int actualSumSquares = 0;
        
//         for (int i = 0; i < N; i++) {
//             actualSum += arr[i];
//             actualSumSquares += arr[i] * arr[i];
//         }
        
//         // Calculate differences
//         int sumDiff = actualSum - expectedSum; // B - A
//         int sumSquaresDiff = actualSumSquares - expectedSumSquares; // B^2 - A^2
        
//         // B^2 - A^2 = (B + A) * (B - A)
//         // sumSquaresDiff = (B + A) * sumDiff
//         int sumPlus = sumSquaresDiff / sumDiff; // B + A
        
//         // Solving equations to find A and B
//         int B = (sumPlus + sumDiff) / 2;
//         int A = sumPlus - B;
        
//         // Print the repeating and missing numbers
//         System.out.println(B);
//         System.out.println(A);
//     }
// }


//Rupalis code 
import java.util.*;

public class Q5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();

        // Read the array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Variables to store repeating and missing elements
        int repeatingA = -1, missingB = -1;

        // Traverse the array to mark elements
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0) {
                repeatingA = Math.abs(arr[i]);
            } else {
                arr[index] = -arr[index];
            }
        }

        // Find the missing element
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missingB = i + 1;
                break;
            }
        }

        // Print the results
        System.out.println( repeatingA);
        System.out.println( missingB);

    }
}