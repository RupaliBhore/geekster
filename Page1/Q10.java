// Area and Perimeter 5


// Take length and breadth of the rectangle as input. And print area of the rectangle in the first line and perimeter of the rectangle in the second line.

// Input Format

// In the first line, length of the rectangle is given as input. In the second line, breadth of the rectangle is given as input.

// Constraints

// Inputs will be given in integer format. 1<= length <= 2^31 - 1 1 <= breadth <= 2^31 - 1

// Output Format

// In the first line Area of the rectangle should be printed. In the second line perimeter of the rectangle should be printed.

// Sample Input 0

// 10
// 20
// Sample Output 0

// 200
// 60
// Sample Input 1

// 20
// 30
// Sample Output 1

// 600
// 100



import java.util.*;

public class Q10 {

    public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
        int l = scn.nextInt();
        int b = scn.nextInt();
        
        System.out.println(l*b);
         System.out.println(l+l+b+b);

    }
}