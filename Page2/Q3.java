// HW_Area of a circle 6

// Given the diameter of the circle as input, print its area.

// For pi use 22/7 instead of 3.14 or Math.pi.

// Also Area=(22*radius*radius)/7

// Input Format

// For each test case, you will get diameter as an integer input.

// Constraints

// 1<= diameter <= 2^31-1

// Output Format

// Print the output in the integer format.

// Sample Input 0

// 8
// Sample Output 0

// 50

import java.util.*;

public class Q3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner scn = new Scanner(System.in);
     
        int diameter = scn.nextInt();
        
   
        double radius = diameter / 2.0;
        
  
        double area = (22 * radius * radius) / 7;
        
     
        System.out.println((int) area);
    }
}