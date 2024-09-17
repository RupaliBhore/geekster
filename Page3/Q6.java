// // HW_GKSTR06 Greater_Number
// Tom is a junior developer who is working on a programming project. One of his tasks involves creating a program that takes two integer inputs, compares them, and prints the greater value. If both values are the same, the program should output either one.

// To accomplish this task, Tom began by writing a code that prompts the user to input two integer values and stores them in separate variables. He then created a conditional statement that compares the two values to determine which one is greater. If the first value is greater than the second, the program outputs the first value. If the second value is greater, the program outputs the second value. If both values are equal, the program outputs either one.

// Input Format

// First Line will contain first integer value.

// Second Line will contain second integer value.

// Constraints

// -(10^5)<=N1, N2<=10^5
// Output Format

// Print the greater value.

// Sample Input 0

// 78
// 96
// Sample Output 0

// 96
// Sample Input 1

// 78
// -96
// Sample Output 1

// 78



import java.util.*;

public class Q6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner scanner = new Scanner(System.in);
        int N1 = scanner.nextInt();
    
        int N2 = scanner.nextInt();

      
        if (N1 > N2) {
            System.out.println(N1);
        } else {
            System.out.println(N2);
        }
        
    }
}