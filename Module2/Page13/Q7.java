// The painter


// We have to paint n boards of length {A1, A2…An}. There are k painters available and each takes 1 unit of time to paint 1 unit of the board. The problem is to find the minimum time to get this job was done under the constraints that any painter will only paint continuous sections of boards, say board {2, 3, 4} or only board {1} or nothing but not board {2, 4, 5}.

// NOTE :-

// After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Click here

// Input Format

// An integer N as size of array.

// N integer represents elements of the array.

// An integer k .

// Constraints

// 1 <= N <= 10^4
// 1 <= arr[i] <= 10^4
// 1 <=  k <= 10^4
// Output Format

// print the final output.

// Sample Input 0

// 4
// 10 10 10 10 
// 2    
// Sample Output 0

// 20
// Explanation 0

// Here we can divide the boards into 2 equal sized partitions, so each painter gets 20 units of board and the total time taken is 20.


import java.util.*;

public class Q7 {
    public static boolean isPossible(int [] A, int limit, int k){
        //k is total given painter
        int painter = 1;
        int work = 0;   //work of current painter
        for(int i = 0; i < A.length; i++){
            if(work + A[i] <= limit){
                work += A[i];
            }else{
                painter++;
                work = A[i];
            }
        }
        return painter <= k;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] A = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            A[i] = scn.nextInt();
            sum += A[i];
        }
        int k = scn.nextInt();
        
        int i = 1;
        int j = sum;
        int ans = sum;
        
        while(i <= j){
            int m = (i + j)/2;
            if(isPossible(A, m, k)){
                ans = m;
                j = m-1;
            }else{
                i = m+1;
            }
        }
        System.out.println(ans);
        
    }
}
//AMAN SIR














// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static boolean canPaintInTime(int[] boards, int k, int maxTime) {
//         int painterCount = 1;
//         int currentSum = 0;
        
//         for (int board : boards) {
//             if (currentSum + board > maxTime) {
//                 painterCount++;
//                 currentSum = board;
//                 if (painterCount > k) {
//                     return false;
//                 }
//             } else {
//                 currentSum += board;
//             }
//         }
        
//         return true;
//     }

//     public static int findMinimumTime(int[] boards, int k) {
//         int low = 0;
//         int high = 0;
        
//         for (int board : boards) {
//             low = Math.max(low, board);
//             high += board;
//         }
        
//         int result = high;
        
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
            
//             if (canPaintInTime(boards, k, mid)) {
//                 result = mid;
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
        
//         return result;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         // Input the size of the array
//         int n = sc.nextInt();
//         int[] boards = new int[n];
        
//         // Input the elements of the array
//         for (int i = 0; i < n; i++) {
//             boards[i] = sc.nextInt();
//         }
        
//         // Input the number of painters
//         int k = sc.nextInt();
        
//         // Find and print the minimum time required
//         System.out.println(findMinimumTime(boards, k));
//     }
// }
// // fINDEDD
// // Time Complexity:O(n log sum(A)): The binary search operates in O(log sum(A)) where sum(A) is the sum of all board lengths, and each feasibility check runs in O(n).
// // Space Complexity:O(1): We use only a few extra variables for the binary search and feasibility check.