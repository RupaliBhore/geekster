// //Unique Number of Occurrences    

// Take an array of integers arr as input from user and print "true" if the number of occurrences of each value in the array is unique, else print "false".

// NOTE :- After answering the question, attempt the related question in the linked resource to improve your understanding of this question . Clickhere

// Input Format

// An Integer N.
// N integers depicting elements of array.
// Constraints

// 1 <= arr.length <= 10^6
// -10^9 <= arr[i] <= 10^9
// Output Format

// "true" or "false"
// Sample Input 0

// 6
// 1 2 2 1 1 3
// Sample Output 0

// true
// Explanation 0

// The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

// Sample Input 1

// 4
// 1 2 1 2
// Sample Output 1

// false

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: First line is the size of the array
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Step 1: Count occurrences of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Track unique counts
        Map<Integer, Integer> countMap = new HashMap<>();
        boolean hasDuplicates = false;

        for (int count : frequencyMap.values()) {
            if (countMap.containsKey(count)) {
                hasDuplicates = true; // Found a duplicate count
                break;
            }
            countMap.put(count, 1);
        }

        // Output the result
        System.out.println(hasDuplicates ? "false" : "true");

        scanner.close();
    }
}

// finded