// // Reverse The String
// Meet Sarah, a software developer who is working on a new project for her company. One of the tasks she has been assigned is to write a program that takes in a string and returns the string in reverse order. Can you help Sarah come up with an algorithm to solve this problem?

// Input Format

// The first and the only line of each test case is a string.

// Constraints

// 1 <= str.length() <= 10^4
// Output Format

// Print the string after reversing the input string.

// Sample Input 0

// geekster
// Sample Output 0

// retskeeg


import java.util.*;

public class Q4 {

    public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        
        StringBuilder reversedString = new StringBuilder(input);
        reversedString.reverse();
        
    
        System.out.println(reversedString.toString());
   
        scanner.close();
    }
}