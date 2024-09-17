// HW_Area of triangle 13

// Take the base and height of a triangle as input and store them in double variables x and y and print its area.
// Input Format
// For each test case, In the first line you will be given the value of x, In the second line you will be given the value of y.
// Constraints
// x and y both will be given as input as a double data-type.
// Output Format
// Print the area of triangle in the double data-type format.
// Sample Input 0
// 4.0
// 8.0
// Sample Output 0
// 16.0
// Explanation 0
// Since base is 4.0, height is 8.0, so area is 16.0. Hence we print 16.0
import java.util.*;
public class Q4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double x = scn.nextDouble();
        double y = scn.nextDouble();

        double area = 0.5 * x * y;

        System.out.println(area);

    }
}
