// // HW_Height, weight and age
// Once upon a time, there was a program that took three integers (height, weight, and age) as input from a person. The program performed different operations based on the values of height, weight, and age.

// If height was equal to 5, weight was equal to 50, and age was equal to 10, the program printed Overweight.

// If height was equal to 5 or weight was equal to 60, the program printed Fat.

// If height was equal to 6 and weight was equal to 50, the program printed Slim.

// If none of these conditions were met, the program simply printed None.

// Would you like to write a program that performs these operations using your programming skills?

// Input Format

// For each test case, you will get

// Height of the person as an integer input in the first line,

// Weight of the person as an integer input in the second line,

// Age of the person as an integer input in the third line.

// Constraints

// 0<=height,weight,age<=2^31-1
// Output Format

// Pint the string according to the given conditions.

// Sample Input 0

// 5
// 50
// 10
// Sample Output 0

// Overweight
// Explanation 0

// Here the first condition follows, so we print the string "Overweight"

// Sample Input 1

// 5
// 60
// 10
// Sample Output 1

// Fat
// Explanation 1

// Here the second condition follows, so we print the string "Fat"

import java.util.*;

public class Q5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        // Reading the inputs
        int height = scanner.nextInt();
        int weight = scanner.nextInt();
        int age = scanner.nextInt();
        scanner.close();

        // Checking the conditions and printing the corresponding message
        if (height == 5 && weight == 50 && age == 10) {
            System.out.println("Overweight");
        } else if (height == 5 || weight == 60) {
            System.out.println("Fat");
        } else if (height == 6 && weight == 50) {
            System.out.println("Slim");
        } else {
            System.out.println("None");
        }
    }
}