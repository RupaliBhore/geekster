// // Multiples of 3, 5 and Both 3 and 5
// Meet Maria, a math teacher who is preparing a lesson plan for her students. One of the activities she wants to include is a challenge for her students to find all the multiples of 3, 5, and both 3 and 5, within a given range. She has decided to use a program to generate the list of multiples for her students. Can you help Maria write a program that takes in an integer n and returns a list of all the multiples of 3, 5, and both 3 and 5, starting from 1 and going up to n?

// Input Format

// The first and the only line of each test case contains an integer n.

// Constraints

// 1 <= N <= 1000
// Output Format

// Print Integer values (Multiples of 3, 5 or Both 3 and 5)

// Sample Input 0

// 15
// Sample Output 0

// 3 5 6 9 10 12 15 



import java.util.*;

public class Q8 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scanner = new Scanner(System.in);

        // Read the input integer n
        int n = scanner.nextInt();

        // List to store multiples of 3, 5, and both
        List<Integer> multiples = new ArrayList<>();

        // Loop through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                multiples.add(i); // Add i to the list if it's a multiple of 3 or 5
            }
        }

        // Print the multiples separated by spaces
        for (int i = 0; i < multiples.size(); i++) {
            System.out.print(multiples.get(i));
            if (i < multiples.size() - 1) {
                System.out.print(" ");
            }
        }

    }
}