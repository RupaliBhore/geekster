// // HW_Perform Operations 1
// For each index,

// Add 1 to the value stored at that index if the element at that index is greater than zero.

// Add 2 to the value at the index if the element at that index is equal to zero.

// Add 3 to the value at the index if the element at that index is less than zero.

// In the end print all the elements of the array such that each element is printed in a separate line.

// Input Format

// First line contains an integer number n representing size of array.

// Second line contains n numbers representing elements of the array.

// Constraints

// 1 <= n <= 100000

// 0 <= array[index] <= 100000
// Output Format

// Print the updated the values of array in single line.

// Sample Input 0

// 3
// -3 0 3
// Sample Output 0

// 0 2 4 
// Explanation 0

// since at index 0 value is negative therfore numbers[0] changes as numbers[0]+3 i.e = -3+3 = 0.

// Similarly, at index 1 value is 0. Therefore we have added 2 to the numbers[1].

// And at index 2, value is positive. Therefore we have added 1 to the numbers[2].



import java.util.*;

public class Q5 {
    public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Update the values in the array based on the conditions
        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {
                array[i] += 1;
            } else if (array[i] == 0) {
                array[i] += 2;
            } else {
                array[i] += 3;
            }
        }

        // Print the updated array elements
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
