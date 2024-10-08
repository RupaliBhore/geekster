// Find Last Occurrence
// Given an array sorted in the increasing order and an element can be there multiple times in the array. Then take an integer input x. In the end the print the index of the last occurrence of the element. Print -1 if element is not present in array.

// Input Format

// First line contains an integer value N representing size of array.

// Second line contains N integer number representing elements of array.

// Third line contains an integer value

// Constraints

// 1 <= n <= 10^4
// 1 <= arr[i] <= 10^9
// 1 <= target <= 10^9
// Output Format

// An integer value.

// Sample Input 0

// 6
// 1 2 3 3 3 4
// 3
// Sample Output 0

// 4
// Explanation 0

// As 3 is last present at 5 index.


import java.util.*;

public class Q8 {
    
    public static int lastOcc(int [] A , int x){
        int ans = -1;
        int i = 0;
        int j = A.length -1 ;
        while(i<= j){
            int m = (i + j)/2; 
            if(A[m]== x){
                ans = m;
                i = m+1;
            }else if(A[m] > x ){ // left
                j = m -1 ;
                
            }else{  // A[m] < x  right
                i = m+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] A = new int[n];
        for(int i=0; i<n; i++){
            A[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int ans =lastOcc(A, x);
        System.out.println(ans);
            
    }
}
//Discussed one





// import java.io.*;
// import java.util.*;

// public class Solution {

//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Read the size of the array
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         // Read the elements of the array
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Read the target element
//         int x = sc.nextInt();

//         // Find the last occurrence of x
//         int result = findLastOccurrence(arr, x);

//         // Print the result
//         System.out.println(result);

//         sc.close();
//     }

//     public static int findLastOccurrence(int[] arr, int x) {
//         int low = 0;
//         int high = arr.length - 1;
//         int result = -1; // Initialize result to -1 to indicate 'not found'

//         while (low <= high) {
//             int mid = low + (high - low) / 2;

//             if (arr[mid] == x) {
//                 result = mid; // Update result because we found x
//                 low = mid + 1; // Search in the right half for the last occurrence
//             } else if (arr[mid] < x) {
//                 low = mid + 1; // Search in the right half
//             } else {
//                 high = mid - 1; // Search in the left half
//             }
//         }

//         return result;
//     }
// }