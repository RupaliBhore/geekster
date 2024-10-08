// // Minimum difference 7

// You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.

// Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.

// Return the minimum possible difference.

// Input Format

// First line of input contains integer N as size of array.

// Second line of contains N integer representing the elenemts of array.

// Third line of input contains integer k.

// Constraints

// 1 <= k <= N <= 1000

// 0 <= nums[i] <= 10^5
// Output Format

// Return the minimum possible difference

// Sample Input 0

// 4
// 9 4 1 7
// 2
// Sample Output 0

// 2
// Explanation 0

// There are six ways to pick score(s) of two students: - [9,4,1,7]. The difference between the highest and lowest score is 9 - 4 = 5.

// [9,4,1,7]. The difference between the highest and lowest score is 9 - 1 = 8.

// [9,4,1,7]. The difference between the highest and lowest score is 9 - 7 = 2.

// [9,4,1,7]. The difference between the highest and lowest score is 4 - 1 = 3.

// [9,4,1,7]. The difference between the highest and lowest score is 7 - 4 = 3.

// [9,4,1,7]. The difference between the highest and lowest score is 7 - 1 = 6.

// // The minimum possible difference is 2.




//chat gpt
// import java.util.*;

// public class Q6 {

//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//         // Read the size of the array
//         int N = sc.nextInt();
//         int[] nums = new int[N];

//         // Read the elements of the array
//         for (int i = 0; i < N; i++) {
//             nums[i] = sc.nextInt();
//         }

//         // Read the value of k
//         int k = sc.nextInt();

//         // Find the minimum possible difference
//         int result = findMinDifference(nums, k);

//         // Print the result
//         System.out.println(result);
//     }

//     private static int findMinDifference(int[] nums, int k) {
//         // Sort the array
//         Arrays.sort(nums);

//         // Initialize the minimum difference to a large number
//         int minDifference = Integer.MAX_VALUE;

//         // Slide a window of size k over the sorted array
//         for (int i = 0; i <= nums.length - k; i++) {
//             int currentDifference = nums[i + k - 1] - nums[i];
//             minDifference = Math.min(minDifference, currentDifference);
//         }

//         return minDifference;
//     }
// }


//Discussed





import java.util.*;

public class Q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
     int n = sc.nextInt();
        int[] A = new int[n];
     
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }
     
     int k =sc.nextInt(); // taking input value for k

        Arrays.sort(A);
        int ans = Integer.MAX_VALUE;

        for(int i=0; i<=n-k; i ++){
           
          int l = A[i]; // let lowest value 
          int h = A[i+k-1];     //heighest value ,, we find accordingly
             
          ans = Math.min(ans, h-l);
        }   
        
            System.out.print(ans);
        

    }
}