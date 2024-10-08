// HW_Weighty Voyage
// In order to transport packages from one port to another within a specific time frame, there is a conveyor belt that contains these packages. Each package on the conveyor belt is assigned a weight denoted by weights[i]. The packages are loaded onto the ship on a daily basis in the order given by the weights, ensuring that the total weight loaded onto the ship does not exceed the maximum weight capacity of the ship.

// Your task is to determine the minimum weight capacity that the ship needs to have in order to successfully transport all the packages on the conveyor belt within the given time frame of D days.

// Input Format

// first line contains integer N representing the size of array.

// second line contains N integers representing th elements of array.

// third line contains integer D representing days.

// Constraints

// 1 <= days <= N <= 5 * 10^4 1 <= arr[i] <= 500

// Output Format

// Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within D days.

// Sample Input 0

// 10
// 1 2 3 4 5 6 7 8 9 10
// 5
// Sample Output 0

// 15
// Explanation 0

// A ship capacity of 15 is the minimum to ship all the packages in 5 days like this: 1st day: 1, 2, 3, 4, 5 2nd day: 6, 7 3rd day: 8 4th day: 9 5th day: 10

// Note that the cargo must be shipped in the order given, so using a ship of capacity 14 and splitting the packages into parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.




import java.util.*;

public class Q8 {

   public static boolean canShipWithCapacity(int[] weights, int days, int capacity) {
        int currentSum = 0;
        int requiredDays = 1; // At least one day is needed
        
        for (int weight : weights) {
            if (currentSum + weight > capacity) {
                requiredDays++;
                currentSum = weight;
                if (requiredDays > days) {
                    return false;
                }
            } else {
                currentSum += weight;
            }
        }
        
        return true;
    }

    // Function to find the minimum ship capacity
    public static int findMinimumCapacity(int[] weights, int days) {
        int low = 0;
        int high = 0;
        
        // Initialize low and high bounds for binary search
        for (int weight : weights) {
            low = Math.max(low, weight); // Maximum weight of a single package
            high += weight; // Sum of all weights
        }
        
        int result = high;
        
        // Binary search to find the minimum feasible capacity
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canShipWithCapacity(weights, days, mid)) {
                result = mid;
                high = mid - 1; // Try for a smaller capacity
            } else {
                low = mid + 1; // Increase capacity
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the size of the array
        int n = sc.nextInt();
        int[] weights = new int[n];
        
        // Input the elements of the array
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }
        
        // Input the number of days
        int days = sc.nextInt();
        
        // Find and print the minimum capacity required
        System.out.println(findMinimumCapacity(weights, days));
    }
}
//finded
// Time Complexity:
// O(n log S): Where n is the number of packages and S is the sum of package weights. Binary search runs in O(log S) and each feasibility check runs in O(n).
// Space Complexity:
// O(1): Only a few extra variables are used