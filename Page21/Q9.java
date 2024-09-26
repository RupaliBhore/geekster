// // HW_Minimum in Array

// Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one. Print the minimum amongst all the elements of the array.

// Input Format

// First line consists N as Size of Array

// Second line consists N Integer value as Arr[i] values

// Constraints

// NA

// Output Format

// Print the Minimum element in array

// Sample Input 0

// 5
// 10
// 4
// 9
// 55
// 21
// Sample Output 0

// 4
// Explanation 0

// 4 is the minimum among all these


import java.util.*;

public class Q9 {

    public static int findMinimum(int[] arr, int n) {
        if (n == 0) { 
            return Integer.MAX_VALUE; 
        }  
        int min = arr[0]; 
        for (int i = 1; i < n; i++) { 
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
       
        int minimum = findMinimum(arr, n);

        System.out.println(minimum);

        scanner.close();
    }}