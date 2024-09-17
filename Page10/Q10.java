// // HW_Print power of 17 from 1 to n

// Sophie, a computer science student, wrote a program to print the power of 17 from 1 to n, where n is taken as input from the user. She used the while loop to calculate the power of 17 and tested it successfully. Sophie's professor was impressed with her programming skills and asked her to present her solution to the class.

// Input Format

// For each test case, you will get n as an integer input.

// Constraints

// 1 <= n <= 20
// Output Format

// Print the power of 17 till n in a single line.

// Sample Input 0

// 2
// Sample Output 0

// 17 289 
// Explanation 0

// 17^1=17 17^2=289

// Sample Input 1

// 3
// Sample Output 1

// 17 289 4913 
// Sample Input 2

// 4
// Sample Output 2

// 17 289 4913 83521 
// Sample Input 3

// 5
// Sample Output 3

// 17 289 4913 83521 1419857 
// Sample Input 4

// 10
// Sample Output 4

// 17 289 4913 83521 1419857 24137569 410338673 6975757441 118587876497 2015993900449 
// Sample Input 5

// 15
// Sample Output 5

// 17 289 4913 83521 1419857 24137569 410338673 6975757441 118587876497 2015993900449 34271896307633 582622237229761 9904578032905937 168377826559400929 2862423051509815793 
// Sample Input 6

// 11
// Sample Output 6

// 17 289 4913 83521 1419857 24137569 410338673 6975757441 118587876497 2015993900449 34271896307633 
// Sample Input 7

// 12
// Sample Output 7

// 17 289 4913 83521 1419857 24137569 410338673 6975757441 118587876497 2015993900449 34271896307633 582622237229761 


import java.util.*;

public class Q10 {

    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

        // Read the input integer n
        int n = scanner.nextInt();

        // Calculate and print the powers of 17 from 1 to n
        long power = 1;
        for (int i = 1; i <= n; i++) {
            power *= 17;
            System.out.print(power + " ");
        }

        // Close the scanner
        scanner.close();
    }
}