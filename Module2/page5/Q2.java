// // Reach Target

// Take the target as an integer input. Then print the indices of the two numbers such that they add to the target. Note that the array is sorted here.
// Use Two pionter, answer must be unique.
// Input Format
// An integer number N representing size of array
// N integers representing elements of array.
// An integer number k representing target.
// Constraints
// 1 <= arr.length <= 10^4
// -10^5 <= arr[i] <= 10^5
// -10^5 <= target <= 10^5
// Output Format
// Return All required pair in different lines.
// Sample Input 0
// 6
// -1 1 2 3 4 5
// 4
// Sample Output 0
// 0 5
// 1 3
// Explanation 0
// -1 + 5 = 4 3 + 1 = 4




// // discussed one

// import java.util.*;

// public class Q2 {

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int[] A = new int[n];
//         for (int i = 0; i < n; i++) {
//             A[i] = scn.nextInt();
//         }
//         int tar = scn.nextInt();
//         int i = 0;
//         int j = n - 1;
//         while (i < j) {
//             int sum = A[i] + A[j];
//             if (sum == tar) {
//                 System.out.println(i + " " + j);
                
//                  i++;
//                 j--;
//             } else if (sum > tar) {
                
//                 j --;

//             } else if (tar > sum) {

//                 i++;
//             }
//         }
//     }
// }






// Finded
import java.util.*;

public class Q2 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        int n = scanner.nextInt();
        
        // Input the array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Input the target value
        int target = scanner.nextInt();
        
        // Call the function to find and print pairs
        findPairs(arr, target);
    }
    
    public static void findPairs(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(left + " " + right);
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}
