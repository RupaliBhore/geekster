// // Print table of 4

// You have to print the table of 4 using the loop concept as given below:

// 4x1=4

// 4x2=8

// 4x3=12

// 4x4=16

// 4x5=20

// 4x6=24

// 4x7=28

// 4x8=32

// 4x9=36

// 4x10=40
// Input Format

// You won't be given any input

// Constraints

// No contraints required for this question.
// Output Format

// Print the table of 4 as explained in the problem statement.

// Sample Output 0

// 4x1=4
// 4x2=8
// 4x3=12
// 4x4=16
// 4x5=20
// 4x6=24
// 4x7=28
// 4x8=32
// 4x9=36
// 4x10=40

public class Q6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          int num = 4;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + (num * i));
        }
    }
}