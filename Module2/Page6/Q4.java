// // Find Pivot Index
// Given an array of integers nums, calculate the pivot index of this array.

// The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

// If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

// Return the leftmost pivot index. If no such index exists, return -1.

// Input Format

// given an integer n representing size of the array.

// next n lines contain element of array.

// Constraints

// 1 <= nums.length <= 104

// -1000 <= nums[i] <= 1000

// Output Format

// an integer representing index of pivot element if found else print -1.

// Sample Input 0

// 6
// 1 7 3 6 5 6
// Sample Output 0

// 3
// Explanation 0

// The pivot index is 3.

// Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11

// Right sum = nums[4] + nums[5] = 5 + 6 = 11

// Sample Input 1

// 3
// 1 2 3
// Sample Output 1

// -1
// Explanation 1

// There is no index that satisfies the conditions in the problem statement.


//fINDED
// import java.util.*;

// public class Q4 {
//  public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Read the size of the array
//         int n = scanner.nextInt();
//         int[] nums = new int[n];

//         // Read the elements of the array
//         for (int i = 0; i < n; i++) {
//             nums[i] = scanner.nextInt();
//         }

//         // Find the pivot index
//         int pivotIndex = findPivotIndex(nums);
//         System.out.println(pivotIndex);
        
//         scanner.close();
//     }

//     public static int findPivotIndex(int[] nums) {
//         int totalSum = 0;
//         int leftSum = 0;

//         // Calculate the total sum of the array
//         for (int num : nums) {
//             totalSum += num;
//         }

//         // Find the pivot index
//         for (int i = 0; i < nums.length; i++) {
//             // Right sum calculation
//             int rightSum = totalSum - leftSum - nums[i];

//             if (leftSum == rightSum) {
//                 return i;
//             }

//             // Update left sum for the next iteration
//             leftSum += nums[i];
//         }

//         return -1;
//     }
// }


// /Discussed

import java.util.*;

public class Q4 {
public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
        int [] A = new int[n];
        for (int i = 0; i < n; i++){
          A[i] = scn.nextInt();
        }
          //left -> 12r
        int [] l2r = new int[n];
       l2r [0] = 0; // left to right
            for (int i = 1; i < n; i++){
             l2r[i] = l2r[i-1] + A[i-1];
            }
             int [] r2l = new int[n];  //right to left
               r2l[n-1] = 0;
            
        for(int i = n-2; i >= 0; i -- ){
        r2l[i] = r2l[i+1] + A[i+1];
        }
          int ans = - 1;
     for (int i = 0; i < n; i++) {
      if (l2r[i] == r2l[i]){
       ans = i;
        break;
      }
        
     }
     System.out.print(ans) ;
}
} // discussed one