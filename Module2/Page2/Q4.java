// // HW_Maximum Product of 3 Numbers

// Once upon a time, there was a mathematician named Max who loved solving number puzzles. One day, he was given an array of integers and was challenged to find the maximum product of three numbers from the array.

// Max eagerly accepted the challenge and began working on it. Help Max to find the maximum product of three numbers.

// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Click here

// Input Format

// An integer N, which is the size of the array.

// N integers, depicting the elements of the array.

// Constraints

// - 3<=N<=1000

// - -1000<=arr[i]<=1000
// Output Format

// Return the maximum product of three numbers from the array.

// Sample Input 0

// 5
// -7 3 -5 2 4
// Sample Output 0

// 140
// Explanation 0

// Product of -7, -5 and 4 will give 140.



import java.util.*;

public class Q4 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int N = sc.nextInt();
        int[] arr = new int[N];

        // Read the elements of the array
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array
        Arrays.sort(arr);

        // Calculate the maximum product of three numbers
        // Product of the three largest numbers
        int max1 = arr[N-1] * arr[N-2] * arr[N-3];

        // Product of the two smallest numbers and the largest number
        int max2 = arr[0] * arr[1] * arr[N-1];

        // The maximum product of three numbers
        int result = Math.max(max1, max2);

        // Print the result
        System.out.println(result);
    }
}