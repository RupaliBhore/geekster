// HW_Unique sum 2
// Once upon a time, there was a young boy named Jack who was fascinated by numbers. He loved playing with numbers and solving puzzles. One day, he came across a challenge where he was given an array of integers and had to find the sum of all unique elements present in the array.

// Return the sum of all the unique elements of nums.

// Input Format

// First line of input contains integer N representing the size of array.

// Second line of input contains N integers representing elements of array.

// Constraints

// 1 <= N <= 10^5

// 1 <= nums[i] <= 10^5
// Output Format

// Return the sum of all the unique elements of nums.

// Sample Input 0

// 4
// 1 2 3 2
// Sample Output 0

// 4
// Explanation 0

// he unique elements are [1,3], and the sum is 4.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueSum {     //using hashmap
    public static int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        // Count occurrences of each element
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // Sum up elements that occur exactly once
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input size of the array
        int N = scanner.nextInt();
        int[] nums = new int[N];
        
        // Input array elements
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }
        
        // Calculate and print the sum of unique elements
        int result = sumOfUnique(nums);
        System.out.println(result);
        
        scanner.close();
    }
}


//using freq array

import java.util.*;

public class Q10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int N = scanner.nextInt();
        int[] nums = new int[N];

        // Read the elements of the array
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }

        // Output the sum of unique elements
        System.out.println(sumOfUnique(nums));

        scanner.close();
    }

    public static int sumOfUnique(int[] nums) {
        // Since nums[i] is in the range 1 to 100,000, we use a frequency array
        int[] frequency = new int[100001]; // Array to store frequency of each number
        int sum = 0;

        // Count frequencies of each number in the input array
        for (int num : nums) {
            frequency[num]++;
        }

        // Calculate sum of unique elements
        for (int i = 1; i < frequency.length; i++) {
            if (frequency[i] == 1) {  // If the element is unique
                sum += i;
            }
        }

        return sum;
    }
}
