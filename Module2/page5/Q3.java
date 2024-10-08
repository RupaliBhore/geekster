// // Target Sum


// The given array is not sorted. The given array may or may not contain duplicate elements. Then take the target as an integer input. Return Pair of target sum in which all pairs are unique, for example : [6, 7], [7, 6] are considered as the same pair.

// Also if the array has repeated elements then return only unique pairs, for eg : if array is arr = [3, 3, 5, 5], and the target = 8 then result will have only one pair, i.e. [3, 5].

// Note : Print the pairs such the smallest integers comes first.

// For example arr = [ 3 , 3, 2, 4]

// output should be:

// 2 4		 
// 3 3                 
// output should not be:

// 3 3		 
// 2 4
// Input Format

// An integer number N representing size of array.

// N integer number representing elements of array.

// An integer number Target.

// Constraints

// 1 <= N <= 10^4

// -10^6 <= array[index] <= 10^6

// -10^6 <= Target <= 10^6
// Output Format

// Return Target pairs in different lines.

// Sample Input 0

// 4
// 3 3 5 5
// 8
// Sample Output 0

// 3 5
// Explanation 0

// 3 + 5 = 8






// //DISCUSSED one

// import java.util.*;

// public class Q3 {

//      public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int[] A = new int[n];
//         for (int i = 0; i < n; i++) {
//             A[i] = scn.nextInt();
//         }

//         int tar = scn.nextInt();
//         // Sort the array
//         Arrays.sort(A);
//         int i = 0;
//         int j = n - 1;

//         while (i < j) {
//             int sum = A[i] + A[j];

//             if (sum == tar) {
//                 // Print the pair
               

//                 // Skip duplicates
//                 while (A[i] == A[i + 1]) {
//                     i++;
//                 }
//                 while ( A[j] == A[j - 1]) {
//                     j--;
//                 }
//                  System.out.println(A[i] + " " + A[j]);

//                 i++;
//                 j--;
//             } else if (sum > tar) {
//                 j--;
//             } else { // sum < tar
//                 i++;
//             }
//         }
//     }
// }




// finded
import java.util.*;

public class Q3 {
 public static void findPairs(int[] arr, int target) {
        // Create a set to store unique pairs
        Set<List<Integer>> pairs = new HashSet<>();
        // Create a set to store elements we've seen so far
        Set<Integer> seen = new HashSet<>();
        
        for (int num : arr) {
            int complement = target - num;
            // Check if the complement exists in the set
            if (seen.contains(complement)) {
                // Create a pair ensuring the smaller number is first
                List<Integer> pair = Arrays.asList(Math.min(num, complement), Math.max(num, complement));
                pairs.add(pair);
            }
            // Add the current number to the set
            seen.add(num);
        }
        
        // Convert the set to a list and sort it
        List<List<Integer>> sortedPairs = new ArrayList<>(pairs);
        sortedPairs.sort(Comparator.comparingInt(a -> a.get(0)));

        // Print the pairs
        for (List<Integer> pair : sortedPairs) {
            System.out.println(pair.get(0) + " " + pair.get(1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the target sum
        int target = scanner.nextInt();

        // Find and print unique pairs
        findPairs(arr, target);
    }
}