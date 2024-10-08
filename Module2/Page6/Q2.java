// // Greatest Till Me

// Make a prefix array of size N such that at the kth index of the prefix array store the greatest element from the left till the kth index of the given array.
// Input Format
// First line contains integer N as size of array.
// Second line contains N integer representing elements of array.
// Constraints
// 1 <= N <= 10^4
// -10^5 <= A[i] < 10^5
// Output Format
// Retrurn the prefix array
// Sample Input 0
// 7
// 1
// 88
// 3
// 2
// 16
// 10
// 9
// Sample Output 0
// 1
// 88
// 88
// 88
// 88
// 88
// 88
// Explanation 0
// 88>1 88>1,3 88>1,3,2 88>1,3,2,16 88>1,3,2,10 88>1,3,2,10,9
// Finded
// import java.util.*;
// public class Q2 {
//    public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         // Read the size of the array
//         int N = scanner.nextInt();
//         int[] arr = new int[N];
//         // Read the elements of the array
//         for (int i = 0; i < N; i++) {
//             arr[i] = scanner.nextInt();
//         }
//         // Generate the prefix max array
//         int[] prefix = generatePrefixMaxArray(arr);
//         // Output the prefix max array
//         for (int value : prefix) {
//             System.out.println(value + " ");
//         }
//         scanner.close();
//     }
//     public static int[] generatePrefixMaxArray(int[] arr) {
//         int N = arr.length;
//         int[] prefix = new int[N];
//         // Initialize the first element of the prefix array
//         prefix[0] = arr[0];
//         // Fill the prefix array
//         for (int i = 1; i < N; i++) {
//             prefix[i] = Math.max(prefix[i - 1], arr[i]);
//         }
//         return prefix;
//     }
// }


//Discussed
import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scn.nextInt();
        }
        int[] ans = new int[n];
        ans[0] = A[0]; //this is first ele , so no ele before this
        for (int i = 1; i < n; i++) {
            ans[i] = Math.max(ans[i - 1], A[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
    }
}

//Discussed one
