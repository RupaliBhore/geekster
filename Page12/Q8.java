// // // Steps till n greater than 0

// Meet Jake, a data analyst who is working on a project to analyze the performance of a new machine learning model. One of the tasks he has been assigned is to write a program that simulates the operation of the model by taking an integer input n and performing a series of steps until the value of n becomes 0.

// If n is even, the program should subtract 1 from n. 
// If n is odd, the program should subtract 3 from n. 
// Jake needs to keep track of the total number of steps that the program performs and print this value at the end. Can you help Jake come up with a solution for this problem?

// Input Format

// The first line of input contains a single integer T denoting the number of test cases. The description of T test cases follows.

// For each test case, you will be given the value of n as an integer data-type.

// Constraints

// 1 <= T <= 100

// -2^31 <= n <= 2^31-1
// Output Format

// Print the total steps as an integer data-type.

// Sample Input 0

// 2
// 20
// 37
// Sample Output 0

// 10
// 19


import java.util.*;

public class Q8 {

    public static void main(String[] args) {
     
           Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        
        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt();
            int count1 = 0, count3 = 0;
            
            while (n > 0) {
                if (n % 2 == 0) {
                    count1 += 1;
                    n -= 1;
                } else {
                    count3 += 1;
                    n -= 3;
                }
            }
            
            int steps = count1 + count3;
            System.out.println(steps);
        }
        
    }
}