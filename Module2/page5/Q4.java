// // 3 Sum

// Take an integer array arr as input and print all the triplets [arr[i], arr[j], arr[k]] such that i != j, i != k, and j != k, and arr[i] + arr[j] + arr[k] == 0.

// Notice that the solution set must not contain duplicate triplets.

// NOTE :-

// After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Click here

// Input Format

// An integer number N representing size of array.

// N integer number representing elements of array.

// Constraints

// 1 <= N <= 10^4

// -10^6 <= arr[i] <= 10^6
// Output Format

// Return Required Triplet in different lines.

// Sample Input 0

// 6
// -2 0 2 4 -2 -8
// Sample Output 0

// -2 -2 4 
// -2 0 2
// Explanation 0

// arr[0] + arr[1] + arr[2] = (-1) + 0 + 1 = 0.

// arr[1] + arr[2] + arr[4] = 0 + 1 + (-1) = 0.

// arr[0] + arr[3] + arr[4] = (-1) + 2 + (-1) = 0.

// The distinct triplets are [-1,0,1] and [-1,-1,2].

// Sorting takes O(n log n).
// Each triplet is found in linear time O(n^2) (due to the nested loops).
// Total complexity: O(n^2).

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {     ///// -2 0 2 4 -2 -8
        List<List<Integer>> ans = new ArrayList<>();

        // Sort the array
        Arrays.sort(nums);   //-8 -2 -2 0 2 4

        for (int i = 0; i < nums.length - 2; i++) {  //-8 -2 0 2 4
            // Skip duplicate elements for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
                                                    

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    // Found a triplet with zero sum
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k])); //asList() array la list madhe convert karate

                    // Skip duplicate elements for j
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }

                    // Skip duplicate elements for k
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }

                    // Move the pointers
                    j++;
                    k--;
                } else if (sum < 0) {
                    // Sum is less than zero, increment j to increase the sum
                    j++;
                } else {
                    // Sum is greater than zero, decrement k to decrease the sum
                    k--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        int N = scanner.nextInt();
        int[] arr = new int[N];

        // Input array elements
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find and print triplets
        List<List<Integer>> result = threeSum(arr);

        // Print the result
        // for (List<Integer> triplet : result) {    //[-2, -2, 4]
        //                                           //[-2, 0, 2]  ashaperakre ouput print hoil
        //     System.out.println(triplet);
        // }
        
        
         // Print the result without []
        for (List<Integer> triplet : result) {
            for (int num : triplet) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}


// fINDED

// import java.util.*;

// public class Q4 {
  
//     public static List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> result = new ArrayList<>();
//         Arrays.sort(nums); // Step 1: Sort the array
        
//         for (int i = 0; i < nums.length - 2; i++) {
//             // Skip duplicate elements
//             if (i > 0 && nums[i] == nums[i - 1]) {
//                 continue;
//             }
            
//             int left = i + 1;
//             int right = nums.length - 1;
            
//             while (left < right) {
//                 int sum = nums[i] + nums[left] + nums[right];
                
//                 if (sum == 0) {
//                     result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
//                     // Skip duplicate elements
//                     while (left < right && nums[left] == nums[left + 1]) {
//                         left++;
//                     }
//                     while (left < right && nums[right] == nums[right - 1]) {
//                         right--;
//                     }
                    
//                     left++;
//                     right--;
//                 } else if (sum < 0) {
//                     left++;
//                 } else {
//                     right--;
//                 }
//             }
//         }
        
//         return result;
//     }
    
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt(); // Read size of the array
//         int[] nums = new int[n];
        
//         for (int i = 0; i < n; i++) {
//             nums[i] = scanner.nextInt(); // Read array elements
//         }
        
//         List<List<Integer>> triplets = threeSum(nums);
        
//         for (List<Integer> triplet : triplets) {
//             System.out.println(triplet.get(0) + " " + triplet.get(1) + " " + triplet.get(2));
//         }
        
//         scanner.close();
//     }
// }

// dISCUSSED one
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scn.nextInt();
        }
        int tar = 0;
        Arrays.sort(A);
        // fixing with help of k
        for (int k = 0; k < n; k++) {
            if (k != 0 && A[k] == A[k - 1]) {
                continue;
            }
            int nTar = tar - A[k];
            int i = k + 1;
            int j = n - 1;
            while (i < j) {
                int sum = A[i] + A[j];
                if (sum == nTar) {
                    System.out.println(A[k] + " " + A[i] + " " + A[j]);
                    i++;
                    j--;
                } else if (sum > nTar) {
                    j--;
                } else { // sum < nTar
                    i++;
                }
            }
        }
    }
}
