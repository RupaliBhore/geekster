

// // GKSTR32 Reverse_Array

// Sophia was an aspiring programmer who had just started learning about arrays. One day, her mentor gave her a task to create an array of size N and reverse it. Sophia was excited to take up the challenge and started working on it immediately.

// She defined an array arr[] of size N and filled it with integers. However, she got stuck when it came to reversing the array.

// Can you help Sophia with this task? Write a program to define an array of size N, fill it with integers, and reverse the array.

// Input Format

// An integer N, which is the size of the array arr[]

// N integers each in a new line, depicting the elements of the array arr[]

// Constraints

// 0 <= N <= 1000

// 0 <= arr[i] <= 1000
// Output Format

// Return the array in reverse order.

// Sample Input 0

// 5
// 2
// 4
// 8
// 3
// 5
// Sample Output 0

// 5
// 3
// 8
// 4
// 2
// Explanation 0

// Since the array is of length 5 and it's elements are {2, 4, 8, 3, 5} therefore, output will be :- 5 3 8 4 2 ,with each integer in one line


// leet code 344 reverse string similar
//finded
// import java.util.*;

// public class Q3 {

//   public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         // Input the size of the array
//         int n = scanner.nextInt();
//         int[] arr = new int[n];
        
//         // Input the elements of the array
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.nextInt();
//         }
        
//         // Print the array in reverse order
//         for (int i = n - 1; i >= 0; i--) {
//             System.out.println(arr[i]);
//         }
//     }
// }


import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Input the size of the array
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        // Input the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Call the reverseArray method
        int[] reversedArr = reverseArray(arr);
        
        // Print the reversed array
        for (int num : reversedArr) {
            System.out.println(num );
        }
    }

    public static int[] reverseArray(int[] arr) {
        // Using two-pointer approach to reverse the array
        int i = 0;
        int j = arr.length - 1;
        
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++;
            j--;
        }
        return arr;  // Return the reversed array
    }
}
// as discussed according to leetcode 344