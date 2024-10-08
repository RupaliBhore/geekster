// The banana challenge
// Koko is fond of consuming bananas and is faced with n piles of bananas, where the ith pile has piles[i] bananas. Meanwhile, the guards have temporarily left and are expected to return in h hours.

// Koko has the freedom to determine her banana-eating speed per hour, which she can set to k. Every hour, she selects a pile of bananas and consumes k bananas from that pile. However, if the selected pile has less than k bananas, she finishes all the bananas in that pile and won't eat any more bananas in that hour.

// Koko prefers to eat slowly but is still determined to finish consuming all the bananas before the guards come back.

// Return the minimum integer k such that she can eat all the bananas within h hours.

// Input Format

// An integer N as size of array.

// N integer represents elements of the array.

// An integer h .

// Constraints

// 1 <= piles.length <= 10^4
// piles.length <= h <= 10^9
// 1 <= piles[i] <= 10^9
// Output Format

// return the integer k.

// Sample Input 0

// 4
// 3 6 7 11 
// 8 
// Sample Output 0

// 4



import java.util.*;

public class Q6 {
 public static int minEatingSpeed(int[] piles, int h) {
        // Define the search range for k
        int left = 1; // Minimum possible speed
        int right = getMax(piles); // Maximum possible speed is the largest pile
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canEatAll(piles, h, mid)) {
                right = mid; // Try for a smaller speed
            } else {
                left = mid + 1; // Increase the speed
            }
        }
        
        return left;
    }
    
    // Helper method to determine if Koko can eat all bananas at speed k within h hours
    private static boolean canEatAll(int[] piles, int h, int k) {
        int hoursNeeded = 0;
        for (int pile : piles) {
            hoursNeeded += (pile + k - 1) / k; // Calculating the ceiling of pile / k
            if (hoursNeeded > h) { // Early exit if more than h hours are needed
                return false;
            }
        }
        return hoursNeeded <= h;
    }
    
    // Helper method to find the maximum element in the piles array
    private static int getMax(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        int n = scanner.nextInt(); // Size of array
        int[] piles = new int[n];
        
        for (int i = 0; i < n; i++) {
            piles[i] = scanner.nextInt();
        }
        
        int h = scanner.nextInt(); // Hours

        // Output the minimum k
        System.out.println(minEatingSpeed(piles, h));
        
        scanner.close();
    }
}


