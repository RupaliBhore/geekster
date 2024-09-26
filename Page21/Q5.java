// // HW_Product of Arrays 1
// Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

// Print Product of all the elements of arrays

// Input Format

// First line contains N as Size of Array.

// Second line contains n integer value as Arr[i] values

// Constraints

// NA

// Output Format

// Product of all the array values

// Sample Input 0

// 5
// 1
// 2
// 3
// 4
// 5
// Sample Output 0

// 120
// Explanation 0

// 1*2*3*4*5



import java.util.*;

public class Q5 {

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the array
        int n = scanner.nextInt();
        
        // Declare and initialize the array
        int[] arr = new int[n];
        
        // Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Calculate the product of all elements
        long product = 1;
        for (int i = 0; i < n; i++) {
            product *= arr[i];
        }
        
        // Print the product
        System.out.println(product);
        
        scanner.close();
    }
}