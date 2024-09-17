// // Reverse 5 table

// You have to print the table of 5 in reverse as given below.

// Input Format

// No input needed.

// Constraints

// NA
// Output Format

// Print as in the problem statement.

// Sample Output 0

// 5x10=50
// 5x9=45
// 5x8=40
// 5x7=35
// 5x6=30
// 5x5=25
// 5x4=20
// 5x3=15
// 5x2=10
// 5x1=5

public class Q3 {

    public static void main(String[] args) {
      
       int num = 5;

     for (int i = 10; i >= 1; i--) {
                System.out.println( num + "X" + i + "=" + (num*i) );
            }
       
       
    }
}
// Time complexity: O(1), because the loop runs a constant 10 times regardless of the input.
// Space complexity: O(1), as only a few variables are used and no significant memory is consumed.