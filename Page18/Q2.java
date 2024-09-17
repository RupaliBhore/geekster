// //HW_Print count of digits and digits line by line.
import java.util.*;
public class Q2 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number
        long number = scanner.nextLong();
        // Convert number to positive if it's negative (though the problem states >= 0)
        if (number < 0) {
            number = -number;
        }
        // Count number of digits
        int count = countDigits(number);
        // Output count of digits
        System.out.println(count);
        // Print each digit from ones place to largest place
        printDigits(number);
        scanner.close();
    }
    // Function to count number of digits
    public static int countDigits(long number) {
        return String.valueOf(number).length();
    }
    // Function to print each digit from ones place to largest place
    public static void printDigits(long number) {
        String numString = String.valueOf(number);
        for (int i = numString.length() - 1; i >= 0; i--) {
            System.out.println(numString.charAt(i));
        }
    }
}

//Time Complexity: 𝑂(𝑑) , where d is the number of digits in the input number.
//Space Complexity: 𝑂(𝑑) , due to the string conversion used in both functions.





// Question
// You will be given a number greater than or equal to zero. Print the count of digits in the first line and then you have to print its digits from the digit at one’s place till the digit at the at the largest place value such that each digit should be printed in a separate line.

// Input Format

// For each test case, a number will be given.

// Constraints

// 0 <= number <= 2^31-1
// Output Format

// Print as given in the problem statement.

// Sample Input 0

// 7654
// Sample Output 0

// 4
// 4
// 5
// 6
// 7
// Sample Input 1

// 85439
// Sample Output 1

// 5
// 9
// 3
// 4
// 5
// 8
// Sample Input 2

// 8765430
// Sample Output 2

// 7
// 0
// 3
// 4
// 5
// 6
// 7
// 8
