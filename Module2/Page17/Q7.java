// Longest Consecutive Sequence 2

// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.

// Input Format

// First line contains an integer n.

// Second line contains an array nums[] of size n.

// Constraints

// 0 <= nums.length <= 10^5

// -10^9 <= nums[i] <= 10^9
// Output Format

// Returns an integer value.

// Sample Input 0

// 6
// 100 4 200 3 1 2
// Sample Output 0

// 4
// Explanation 0

// The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.




import java.util.HashSet;
import java.util.Scanner;

public class Q7 {
    public static int longestConsecutive(int[] nums) {
        // Create a HashSet to store the elements
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        // Check for the longest consecutive sequence
        for (int num : set) {
            // Check if num is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Increment the currentNum while the next consecutive number exists
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the longest streak found so far
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the size of the array
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Reading the array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Calling the function and printing the result
        System.out.println(longestConsecutive(nums));

        sc.close();
    }
}
//finded