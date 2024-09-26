// // HW_ Mirror Image 4


// Given an array of size n with unique integer elements. And Then take m as an integer input. Declare the second array of size m that stores values of int data-type. Then take m integer inputs and store them in the array one by one.

// Then print all the unique elements of the first array whose additive inverses are present in the second array.

// Note: The additive inverse of a number is a value that gives a net outcome of zero when added to the original number.

// Input Format

// An integer number n representing size of first array.
// n integer inputs representing elements of first array.
// An integer number m representing size of second array.
// m integer inputs representing elements of second array.


// Constraints

// 1 <= n,m <= 100000

// 0 <= arr1[i] , arr2[i] <= 100000
// Output Format

// An series on integer element in single line.

// Sample Input 0

// 5
// 1 2 3 4 54
// 5
// 4 3 12 -1 -2
// Sample Output 0

// 1 2 
// Explanation 0

// arr1[0] + arr2[3] = 1+(-1) = 0

// arr1[1] + arr2[4] = 2+(-2) = 0


import java.util.*;

public class Q7 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of first array
        int n = scanner.nextInt();
        int[] arr1 = new int[n];

        // Input elements of first array
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Input size of second array
        int m = scanner.nextInt();
        int[] arr2 = new int[m];

        // Input elements of second array
        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Create a set to store elements of the second array
        Set<Integer> set = new HashSet<>();
        for (int value : arr2) {
            set.add(value);
        }

        // Check for additive inverses and print the unique elements of first array
        for (int value : arr1) {
            if (set.contains(-value)) {
                System.out.print(value + " ");
            }
        }
    }
}