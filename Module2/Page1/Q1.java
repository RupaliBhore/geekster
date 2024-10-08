// // GKSTR44 Bubble Sort           //Max. element at correct position

import java.util.*;
public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt() ;
        int[] A = new int[n];
        for(int i=0; i<n; i++){  //input array
            A[i] = sc.nextInt();
            // System.out.print(A[i]);
        }                                                   // 9 4 3 8 7
        for(int i=0; i<n; i++){                               // 9 4 3 8 7   // 9 4 3 8 7 
        //    System.out.print(A[i]); // our array            // i             
            
          for(int j=0; j<n-1-i; j++){                        //  9 4 3 8 7    // 4 9 3 8 7 
            if(A[j] > A[j+1] ){                              //  j j+1             j j+1
             int temp = A[j];
               A[j] = A[j+1];
              A[j+1] = temp;                                 //  4 9 3 8 7  // 4 3 9 8 7 //7  //
            //   System.out.print(A[i]);
            }

        }
    }
    for(int i=0 ; i<n ; i++){
        System.out.print(A[i] +" " );  //
  }

    }
}


// Time Complexity: O(n²) — due to the nested loops and comparison of adjacent elements.
// Space Complexity: O(1) — because the sorting is done in place with no additional data structures.






// Take an array of size N as input.
// Sort the array using bubble sort.

// Note: Don't use inbuilt sort function.

// Input Format
// An integer N, which is the size of the array.
// N integers, depicting the elements of the array.

// Constraints
// 0 <= arr.length <= 10^4
// -1*10^5 <= arr[i] <= 10^5

// Output Format
// Return A sorted array of size N.

// Sample Input 0
// 5
// 9 4 3 8 7
// Sample Output 0
// 3 4 7 8 9


//  9 4 3 8 7 ==> 4 3 8 7 9 ==> 4 , 3 ,7, 8 , 9 


// Discussion


//chat gpt answer 

// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
//          Scanner scanner = new Scanner(System.in);

//         int N = scanner.nextInt();
//         int[] arr = new int[N];

//         for (int i = 0; i < N; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         bubbleSort(arr);

//         for (int i = 0; i < N; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void bubbleSort(int[] arr) {
//         int n = arr.length;
//         boolean swapped;

//         for (int i = 0; i < n - 1; i++) {
//             swapped = false;

//             for (int j = 0; j < n - 1 - i; j++) {
//                 if (arr[j] > arr[j + 1]) {
            
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;

//                     swapped = true;
//                 }
//             }

         
//             if (!swapped) {
//                 break;
//             }
//         }
//     }
// }