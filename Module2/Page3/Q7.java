// // Sum Equals Zero

// Liam is a stock trader who is analyzing the stock prices of a company. He has stored the stock prices in an array of size N. Liam wants to find out if there is a subarray of the stock prices whose sum is zero. If such a subarray exists, Liam can take advantage of it to make a profit.

// Can you write a program to help Liam determine whether the array contains a subarray whose sum is zero?

// Input Format

// An Integer input N representing size of array
// N integer input representing elements of an array

// Constraints
// 1<=N<=9
// -10^6<=n<=10^6

// Output Format
// Return True/False

// Sample Input 0
// 4
// -1 1 2 3

// Sample Output 0
// true
// Explanation 0
// 1 + (-1) = 0


//  Searched
// import java.util.*;

// public class Q7 {

//     public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

//         // Input the size of the array
//         int N = scanner.nextInt();
//         int[] arr = new int[N];

//         // Input the elements of the array
//         for (int i = 0; i < N; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         // Using a set to store the cumulative sum
//         HashSet<Integer> cumulativeSumSet = new HashSet<>();
//         int cumulativeSum = 0;
//         boolean zeroSumExists = false;

//         // Check for the zero-sum subarray
//         for (int num : arr) {
//             cumulativeSum += num;

//             // Check if cumulative sum is zero or already exists in the set
//             if (cumulativeSum == 0 || cumulativeSumSet.contains(cumulativeSum)) {
//                 zeroSumExists = true;
//                 break;
//             }

//             // Add the cumulative sum to the set
//             cumulativeSumSet.add(cumulativeSum);
//         }

//         // Output the result
//         System.out.println(zeroSumExists);

//         scanner.close();
//     }
// }






// Discussed
import java.util.*;

public class Q7 {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int[] A = new int[n];
       
       for (int i = 0; i < n; i++) {
           A[i] = scn.nextInt();
       }
       Boolean ans = sumZero(A);
    System.out.println(ans);
}

public static boolean sumZero(int[] A ){
    int n = A.length;
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {

            int sum = 0;
            for (int k = i; k <= j; k++) {
                // System.out.print(A[k]); //One Subarray

                sum += A[k];
            
            }
            if(sum == 0){
                return true;
            }
        }
        
    } 
    return false;
}



}