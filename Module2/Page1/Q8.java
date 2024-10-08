// // increasing order using inbuilt sort


// Sort Array in incresing order using inbuilt sort.

// Input Format

// First line of input contains integer N as size of array.

// Second line of contains N integer representing the elements of array.

// Constraints

// 1 <= N <= 10^5

// 1 <= arr[i] <= 10^5
// Output Format

// Return the sorted array.

// Sample Input 0

// 5
// 1 4 3 5 3
// Sample Output 0

// 1 3 3 4 5


import java.util.*;

public class Q8 {

       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int N = scanner.nextInt();

        // Read the array elements
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array in increasing order using inbuilt sort
        Arrays.sort(arr);

        // Output the sorted array
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}