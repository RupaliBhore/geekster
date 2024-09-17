// // Find GCD 3    //Greatest Common Divisor  //HCF heigest common factor

import java.util.*;

public class Q3 {

    public static int gcd(int a, int b) { // a= 100 b = 35
        while (b != 0) {     
            int temp = b;  
            b = a % b;    
            a = temp;      
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number of test cases
      
        int T = scanner.nextInt();
        
        // Process each test case
        for (int i = 0; i < T; i++) {
            // Input x and y
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            // Calculate GCD of x and y
            int result = gcd(x, y);
            
            // Print GCD
            System.out.println( result);
        }
        
        scanner.close();
    }
}

//Time Complexity:O(T×log(min(x,y))) because each GCD computation takes O(log(min(x,y))) time, and there are T test cases.
//Space Complexity:  O(1) because the algorithm uses a constant amount of extra space for a few integer variables.













// Question
// Take two integer inputs x and y. Then print the gcd of these two numbers as an integer output.

// Input Format

// T will be given as an integer input representing the number of test cases.

// For each test case,

// x will be given as an integer input in the first line,

// y will be given as an integer input in the second line.

// Constraints

// 1 <= T <= 2^10
// 1 <= x , y <= 2^10
// Output Format

// Print the gcd as an integer output.

// Sample Input 0

// 2
// 100 35
// 20 7
// Sample Output 0

// 5
// 1
// Sample Input 1

// 1
// 300 20
// Sample Output 1

// 20




