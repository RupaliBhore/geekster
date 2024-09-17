// // HW_First Occurance of consonant from End

import java.util.*;

public class Q9 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read size of the array
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline after integer input

        // Initialize char array
        char[] arr = new char[N];

        // Read characters into the array
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.next().charAt(0);
        }

        // Find the first consonant index from the end
        int consonantIndex = -1;
        for (int i = N - 1; i >= 0; i--) {
            char ch = Character.toLowerCase(arr[i]);
            if ((ch >= 'a' && ch <= 'z') && !isVowel(ch)) {
                consonantIndex = i;
                break;
            }
        }

        // Print the result
        System.out.println(consonantIndex);

        scanner.close();
    }

    // Function to check if a character is a vowel
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}


// Time Complexity: O(n) due to a single reverse pass through the array to find the first consonant.
// Space Complexity: O(n) because of the storage required for the array of size n.








// Take n as an integer input. Declare the first array of size n that stores values of char data-type. Then take n character inputs and store them in the array one by one. Traverse the array from the last and print the index at which the consonant occurs for the first time.

// Input Format

// First line consists N as size.

// Second line consists an array of N char Values

// Constraints

// NA
// Output Format

// First occurance of Constant from end.

// Sample Input 0

// 5
// a
// b
// c
// d
// q
// Sample Output 0

// 4

// Explanation 0

// q is first consonant from last
