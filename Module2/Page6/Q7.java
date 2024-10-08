// HW_Road Trip 5

// There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

// You are given an integer array gain of length N where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

// Input Format

// First line of input contains integer N representing the size of array.

// Second line of input contains N integers representing elements of array.

// Constraints

// 1 <= N <= 100

// -100 <= gain[i] <= 100
// Output Format

// Return the highest altitude.

// Sample Input 0

// 5
// -5 1 5 0 -7
// Sample Output 0

// 1
// Explanation 0

// The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.




import java.util.*;

public class Q7 {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();
        int[] gain = new int[n];

        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            gain[i] = scanner.nextInt();
        }

        // Compute the highest altitude
        int highestAltitude = findHighestAltitude(gain);
        System.out.println(highestAltitude);

        scanner.close();
    }

    public static int findHighestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;

        for (int g : gain) {
            currentAltitude += g;
            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;
            }
        }

        return maxAltitude;
    }
}