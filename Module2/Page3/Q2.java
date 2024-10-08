// HW_Sort Array By Parity II

// Sophie is a student who enjoys playing video games in her free time. One of her favorite games involves an array of integers. Sophie noticed that the array was unsorted and she wanted to sort it in a unique way.

// She thought of an interesting challenge - to sort the array acccording to the cubes of the elements.

// Help Sophie and write a program that sort the array according to teh cubes of the elements.

// Input Format

// First line take an integer input from user as N , where N is the size of array.

// Second line takes N elements as integers input in array.

// Constraints

// 1 <= N <= 100

// -10^2 <= arr[i] <= 10^2
// Output Format

// Return the sorted array according to their cubes.

// Sample Input 0

// 5
// 4 -1 0 -5 6
// Sample Output 0

// -5 -1 0 4 6 
// Explanation 0

// Print the sorted array

import java.util.*;

public class Q2 {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        int N = scanner.nextInt();
        int[] nums = new int[N];

        // Input the elements of the array
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }

        // Separate and sort odd and even numbers
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                evens.add(num);
            } else {
                odds.add(num);
            }
        }
        Collections.sort(evens);
        Collections.sort(odds);

        // Create the result array with sorted odd and even numbers in their respective places
        int[] result = new int[N];
        int evenIndex = 0, oddIndex = 1;
        for (int even : evens) {
            result[evenIndex] = even;
            evenIndex += 2;
        }
        for (int odd : odds) {
            result[oddIndex] = odd;
            oddIndex += 2;
        }

        // Output the result array
        for (int i = 0; i < N; i++) {
            System.out.print(result[i] + " ");
        }

        scanner.close();
    }
}