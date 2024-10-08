// // Print Pair

// Take the array of size n and their values from user. And Print all the pairs in the array.

// Input Format

// First line contains an integer number n representing size of array.

// Second line contains n numbers representing elements of the array and all element will be unique.

// Constraints

// 1 <= n <= 100000

// 0 <= array[index] <= 100000
// Output Format

// See the DESCRIPTION

// Sample Input 0

// 5
// 1 2 3 4 5
// Sample Output 0

// 1 2
// 1 3
// 1 4
// 1 5
// 2 3
// 2 4
// 2 5
// 3 4
// 3 5
// 4 5
// Explanation 0

// since we are given 5 number.

// Therefore 1st number can pair up with next 4 numbers.

// similarly 2nd number can pair up with next 3 numbers as pairing with first number will result same pair we have achieved when 1st number paired with 2nd.therfore we can pair with the next remaining numbers.

// Therefore 3rd number i.e 3 pair with 4 and 5 only.And so on.

import java.util.*;

public class Q10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Print all pairs in the array
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println(array[i] + " " + array[j]);
            }
        }
    }
}
