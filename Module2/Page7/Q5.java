// // HW_Odd occurance
// Jack was a treasure hunter who spent his life traveling the world, looking for hidden riches. One day, while exploring a remote island, he stumbled upon an old map that promised great wealth.

// The map showed a series of clues that led to a hidden treasure trove, but it was written in a secret code that Jack could not decipher. He knew that he needed to find a way to decode the map if he was going to find the treasure.

// Jack remembered a Java program he had learned about that could find an odd occurring element in an array of integers. He realized that he could use this program to decode the map.

// Given an array arr[] of N integers, find a number which occurred odd times in the array. If such an element exists, print that respective element, else print There is no odd occurring element.

// Note :- Consider there is only one element which occurs odd time.

// Hint use frequency array.

// Input Format

// The first line contains N, i.e. the size of the array.

// The second line contains N space-separated positive integers arr[i] denoting elements of the array.

// Constraints

// 0 <= N <= 10^4

// 0 <= arr[i] <= 9
// Output Format

// Return the odd occuting element.

// Sample Input 0

// 5
// 1 1 1 2 2
// Sample Output 0

// 1




import java.util.*;

public class Q5 {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int N = scanner.nextInt();
        if (N == 0) {
            System.out.println("There is no odd occurring element");
            return;
        }

        // Initialize the frequency array for digits 0-9
        int[] frequency = new int[10];
        
        // Read array elements and populate the frequency array
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            frequency[num]++;
        }

        // Find and print the element with an odd frequency
        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (frequency[i] % 2 != 0) {
                System.out.println(i);
                found = true;
                break;
            }
        }

        // If no element with an odd frequency is found
        if (!found) {
            System.out.println("There is no odd occurring element");
        }

        scanner.close();
    }
}