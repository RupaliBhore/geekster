// // Pattern 6 - Right triangle of 5 multiples

// Take an integer n as an integer input, and then

// print the first multiple of 5 in the first line,

// print the first two multiples of 5 in the second line.

// .

// .

// .

// .

// print first n multiples of 5 in the nth line.

// Note: In each line the multiples of 5 should be tab separated.

// Input Format

// For each test case, take n as an integer input.

// Constraints

// 1<=n<=2^10

// Output Format

// Print as given in the problem statement.

// Sample Input 0

// 6
// Sample Output 0

// 5    
// 5    10    
// 5    10    15    
// 5    10    15    20    
// 5    10    15    20    25    
// 5    10    15    20    25    30    
// Sample Input 1

// 7
// Sample Output 1

// 5    
// 5    10    
// 5    10    15    
// 5    10    15    20    
// 5    10    15    20    25    
// 5    10    15    20    25    30    
// 5    10    15    20    25    30    35
// Sample Input 2

// 9
// Sample Output 2

// 5    
// 5    10    
// 5    10    15    
// 5    10    15    20    
// 5    10    15    20    25    
// 5    10    15    20    25    30    
// 5    10    15    20    25    30    35    
// 5    10    15    20    25    30    35    40    
// 5    10    15    20    25    30    35    40    45
// Sample Input 3

// 10
// Sample Output 3

// 5    
// 5    10    
// 5    10    15    
// 5    10    15    20    
// 5    10    15    20    25    
// 5    10    15    20    25    30    
// 5    10    15    20    25    30    35    
// 5    10    15    20    25    30    35    40    
// 5    10    15    20    25    30    35    40    45    
// 5    10    15    20    25    30    35    40    45    50
// Sample Input 4

// 4
// Sample Output 4

// 5    
// 5    10    
// 5    10    15    
// 5    10    15    20




import java.util.*;

public class Q6 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        // Read the integer input n
        int n = scanner.nextInt();
        
        // Iterate from 1 to n
        for (int i = 1; i <= n; i++) {
            // Print multiples of 5 up to i times
            for (int j = 1; j <= i; j++) {
                // Calculate the multiple of 5
                int multiple = j * 5;
                System.out.print(multiple);
                
                // Print tab separator if it's not the last number in the line
                if (j < i) {
                    System.out.print("\t");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
        
        scanner.close();
    }
}
