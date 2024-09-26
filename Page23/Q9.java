// // HW_Find Difference 2

// Take an array as input. Given condition is that the array contains all the unique elements. Then take k as an integer input and print all the combinations of the pairs whose absolute difference is k.

// Input Format

// First line contains an integer number n representing size of array.

// Second line contains n integer numbers representing elements of the array.

// Third line contains an integer number k

// Constraints

// 1 <= n <= 100000

// 0 <= array[index] <= 100000

// 0 <= k <= 1000000
// Output Format

// Print the required combinations in different line.

// Sample Input 0

// 5
// 1 2 3 4 5
// 3
// Sample Output 0

// 1 4
// 2 5
// Explanation 0

// |arr[0] - arr[3]| = |1 - 4| = 3

// |arr[1] - arr[4]| = |2 - 5| = 3

// A



import java.util.*;

public class Q9 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr [i] = scn.nextInt();
        }
        int k = scn.nextInt();
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            if (Math.abs(arr[i] - arr[j]) == k) {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }
}
}