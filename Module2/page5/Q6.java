// // Count boat

// You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.

// Return the minimum number of boats to carry every given person.

// Input Format

// First line contains integer N represents the size of array.

// Second line contains N integers represents the elements of array.

// Third line contains integer limit.

// Constraints

// 1 <= people.length <= 5 * 10^4

// 1 <= people[i] <= limit <= 3 * 10^4
// Output Format

// Return the minimum number of boats to carry every given person.

// Sample Input 0

// 2
// 1 2 
// 3
// Sample Output 0

// 1
// Explanation 0

// 1 boat (1, 2)

// Sample Input 1

// 4
// 3 2 2 1 
// 3
// Sample Output 1

// 3
// Explanation 1

// 3 boats (1, 2), (2) and (3)

import java.util.*;

public class Q6 {

      public static int numBoats(int[] people, int limit) {
        Arrays.sort(people); // Step 1: Sort the array
        int left = 0;
        int right = people.length - 1;
        int boats = 0;
        
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++; // Pair the lightest and heaviest person
            }
            right--; // The heaviest person gets on the boat
            boats++; // Count the boat
        }
        
        return boats;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); // Read size of the array
        int[] people = new int[n];
        
        for (int i = 0; i < n; i++) {
            people[i] = scanner.nextInt(); // Read array elements
        }
        
        int limit = scanner.nextInt(); // Read the weight limit
        
        int result = numBoats(people, limit);
        System.out.println(result); // Output the result
        
        scanner.close();
    }
}