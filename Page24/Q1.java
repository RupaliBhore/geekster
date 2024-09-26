// // Max Count 3
// Take an array of size n with integer elements. And Print an element in the array which occurs for the maximum number of times.

// Input Format

// First line contains an Integer number n representing size of array.

// Second line contains n integer inputs representing elements of array.

// Constraints

// 1 <= n <= 10000

// -100000 <= arr[i] <= 100000
// Output Format

// Returns an Integer number

// Sample Input 0

// 7
// 1 1 1 2 2 3 3
// Sample Output 0

// 1
// Explanation 0

// 1 has occured maximum times i.e 3.

import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Input elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Use a HashMap to count occurrences of each element
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int value : arr) {
            countMap.put(value, countMap.getOrDefault(value, 0) + 1);
        }

        // Find the element with the maximum occurrences
        int maxCount = 0;
        int maxElement = arr[0];
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        // Print the element with the maximum occurrences
        System.out.println(maxElement);
    }
}

