// // HW_Maximum Product of 3 Numbers

// Once upon a time, there was a mathematician named Max who loved solving number puzzles. One day, he was given an array of integers and was challenged to find the maximum product of three numbers from the array.

// Max eagerly accepted the challenge and began working on it. Help Max to find the maximum product of three numbers.

// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Click here

// Input Format

// An integer N, which is the size of the array.

// N integers, depicting the elements of the array.

// Constraints

// - 3<=N<=1000

// - -1000<=arr[i]<=1000
// Output Format

// Return the maximum product of three numbers from the array.

// Sample Input 0

// 5
// -7 3 -5 2 4
// Sample Output 0

// 140
// Explanation 0

// Product of -7, -5 and 4 will give 140.



import java.util.*;

public class Q4 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int N = sc.nextInt();
        int[] arr = new int[N];

        // Read the elements of the array
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array
        Arrays.sort(arr); //array sort kelyanantr asc madhe largest value last la jatil tr last che 3 element che product kada

        // Calculate the maximum product of three numbers
        // Product of the three largest numbers
        int max1 = arr[N-1] * arr[N-2] * arr[N-3];

        // Product of the two smallest numbers and the largest number  //array madhe negativ number pan asu shakata mhunun ha check
        int max2 = arr[0] * arr[1] * arr[N-1];

        // The maximum product of three numbers
        int result = Math.max(max1, max2);

        // Print the result
        System.out.println(result);
    }
}




  //with fun for leetcode
// import java.io.*;
// import java.util.*;

// public class Solution {
    
    
//      public static int maxProductOfThree(int[] a) {
//         // Check if the array has at least 3 elements
//         if (a.length < 3) {
//             throw new IllegalArgumentException("Array must contain at least 3 numbers.");
//         }
        
//         // Sort the array
//         Arrays.sort(a);
        
//         // Calculate the product of the three largest numbers
//         int max1 = a[a.length - 1] * a[a.length - 2] * a[a.length - 3];
        
//         // Calculate the product of the two smallest and the largest number
//         int max2 = a[0] * a[1] * a[a.length - 1];   // -7 3 -5 2 4   //2 negative number cha product postive yeteo -7*-5=35
        
//         // Return the maximum of the two computed products
//         return Math.max(max1, max2);
//     }

  
//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//          Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int a[]=new int[n];
//         for(int i=0; i<n; i++)
//         {
//             a[i]=sc.nextInt();
//         }
        
//         // Compute and print the maximum product of three numbers
//         int result = maxProductOfThree(a);
//         System.out.println(result);  // Output: 140
//     }
// }
