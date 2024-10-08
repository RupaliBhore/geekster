// // HW_Selection Sort Decreasing 
// Meet Lily, a high school student who is preparing for her upcoming math exam. One of the topics covered in her course is sorting algorithms, and she is particularly interested in the selection sort algorithm.

// Lily decides to practice implementing the selection sort algorithm on an array of integers.

// Can you help Lily and create a programm to sort the array in decreasing order and print the final sorted array.

// Input Format

// First line take an integer input from user as N , where N is the size of array.

// Second line takes N elements as Integer input in array.

// Constraints

// 1 <= N <= 10^5

// -10^5 <= arr[i] <= 10^5
// Output Format

// Return the sorted Array.

// Sample Input 0

// 5
// 2 4 1 5 3
// Sample Output 0

// 5 4 3 2 1
// Explanation 0

// print the sorted array



//Asked


import java.util.*;

public class Q4 {

    public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);       
        int N = scanner.nextInt();    
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }     
        selectionSortDescending(arr);
    
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
 
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
           
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

}