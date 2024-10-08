// // HW_Insertion Sort Decreasing Order
// Write a program to Perform an insertion sort on the array to sort it in the decreasing order and print the final array.

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

public class Q5{

    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

     
        int N = scanner.nextInt();

 
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        insertionSortDescending(arr);

       
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

   
    public static void insertionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

          
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
