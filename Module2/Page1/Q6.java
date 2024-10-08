// // HW_Bubble sort decreasing order

// Write a progrma to Perform a bubble sort on the array to sort the array in the decreasing order and print it.

// Input Format

// First line take an integer input from user as N , where N is the size of array.

// Second line takes N elements as Integer input in array.

// Constraints

// 1 <= N <= 10^5

// -10^5 <= arr[i] <= 10^5
// Output Format

// Return sorted Array.

// Sample Input 0

// 5
// 2 4 1 5 3
// Sample Output 0

// 5 4 3 2 1



//Asked

import java.util.*;

public class Q6 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

     
        int N = scanner.nextInt();

      
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        bubbleSortDescending(arr);

       
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

   
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
               
                if (arr[j] < arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}