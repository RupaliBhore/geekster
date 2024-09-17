// // runner up 3
// Three numbers A, B and C are the inputs. Write a program to find second largest among them.

// Input Format

// For each test case, you will get

// A in the first line as an integer input,

// B in the second line as an integer input,

// C in the third line as an integer input.

// Constraints

// 1<=A,B,C<=1000000
// Output Format

// display the second largest among A, B and C, in a new line.

// Sample Input 0

// 120
// 11 
// 400
// Sample Output 0

// 120


import java.util.*;

public class Q3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

 
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

       
        int secondLargest;

        if ((A >= B && A <= C) || (A <= B && A >= C)) {
            secondLargest = A;
        } else if ((B >= A && B <= C) || (B <= A && B >= C)) {
            secondLargest = B;
        } else {
            secondLargest = C;
        }

        System.out.println(secondLargest);

    }
}