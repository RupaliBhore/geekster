// // Max Subarray 2          // kedans Algo

// Samantha is a college student who is struggling to balance her part-time job with her studies. One day, she decided to take a break and went to the nearby park. While sitting on the bench, she overheard a group of students discussing a coding challenge they were trying to solve. Samantha was intrigued and asked them about the challenge.

// The challenge was to find the contiguous sub-array with the maximum sum from a given array. Samantha decided to take up the challenge and spent the next few hours working on it. Finally, she was able to come up with a solution that could find the maximum sum sub-array in linear time.

// NOTE :- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Click here

// Input Format

// Line 1 : Take input N size of array

// Line 2 : Take N input representing array elements

// Constraints

// 1 ≤ N ≤ 10^4

// -10^4 ≤ A[i] ≤ 10^4
// Output Format

// Return max sum of subarray

// Sample Input 0

// 5
// -1 2 3 -2 1
// Sample Output 0

// 5
// Explanation 0

// Max subarray sum is 5 which is {2,3}




//finded 
// import java.util.*;

// public class Q8 {

//     public static void main(String[] args) {
//      Scanner scanner = new Scanner(System.in);

//         // Input the size of the array
//         int N = scanner.nextInt();
//         int[] arr = new int[N];

//         // Input the elements of the array
//         for (int i = 0; i < N; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         // Kadane's Algorithm to find the maximum sum subarray
//         int maxCurrent = arr[0];
//         int maxGlobal = arr[0];

//         for (int i = 1; i < N; i++) {
//             maxCurrent = Math.max(arr[i], maxCurrent + arr[i]);
//             if (maxCurrent > maxGlobal) {
//                 maxGlobal = maxCurrent;
//             }
//         }

//         // Output the result
//         System.out.println(maxGlobal);

//         scanner.close();
//     }
// }





// Discussed one


import java.util.*;

public class Q8{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = scn.nextInt();
        }
     
       int ans = kadanse(A);

     System.out.println(ans);
    }
    public static int kadanse(int [] A){

        int prevSum = 0;
        int max = Integer.MIN_VALUE;

        for (int i=0; i<A.length; i++){
            if (prevSum>0){
                prevSum += A[i];
            }else{
                prevSum = A[i];
            }
            max =Math.max(max , prevSum);
        }
        return max;
    }
}