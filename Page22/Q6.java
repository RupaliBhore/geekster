// // HW_Update query 2

// Take an number n and n elemetns from the user. Also Take left, right as integer inputs such that 0<=left, right and also take x as an integer input.

// Then update the given array from 0 to index-left and from index-right to arr.length (both left index and right index included) by adding x to the value already present at that index. In the end print all the elements of the array such that each element is printed in a separate line

// Input Format

// First line contains an integer number n representing size of array

// Second line contains n integer number representing elements of array

// Third line contains integer inputs left ,right and x.

// Constraints

// 1 <= n <= 100000

// 0 <= arr[index] <= 100000

// 0 <= left <= right <n

// 0 <= x <= 100000
// Output Format

// single line containing updated value of array.

// Sample Input 0

// 6
// 1 2 3 4 5 6
// 2 4
// 10
// Sample Output 0

// 11 12 13 4 15 16 
// Explanation 0

// since we are given left as 2 and right as 4.

// therefore for index 0 to 2 and 4 till length of array,we increase value at this indexes by given x i.e 10.

// and print the resultant array in single line.

import java.util.*;

public class Q6 {

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Read the left, right, and x values
        int left = scanner.nextInt();
        int right = scanner.nextInt();
        int x = scanner.nextInt();

        // Update the array from 0 to index-left by adding x
        for (int i = 0; i <= left; i++) {
            array[i] += x;
        }

        // Update the array from index-right to end by adding x
        for (int i = right; i < n; i++) {
            array[i] += x;
        }

        // Print the updated array elements
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
