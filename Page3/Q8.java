// // HW_Print age bracket
// You will be given age as an integer input from the user, and print according to the conditions given below

// a. Print Super Senior Citizen if age is equal to or above 70.

// b. Print Senior Citizen if age is below 70 but equal to or above 59.

// c. Print Adult if age is below 59 but equal to or above 18.

// d. Print Underage is age is below 18 but above 1.

// e. Print New Born if none of the above conditions follow.

// Input Format

// For each test case, you will be given age as an integer in an integer data-type.

// Constraints

// 0<=age<=1000
// Output Format

// Print according to the given conditions.

// Sample Input 0

// 75
// Sample Output 0

// Super Senior Citizen
// Explanation 0

// Since the entered age is equal to or above 70, so we print "Super Senior Citizen"



import java.util.*;

public class Q8 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

      
        int age = scanner.nextInt();

        if (age >= 70) {
            System.out.println("Super Senior Citizen");
        } else if (age >= 59) {
            System.out.println("Senior Citizen");
        } else if (age >= 18) {
            System.out.println("Adult");
        } else if (age > 1) {
            System.out.println("Underage");
        } else {
            System.out.println("New Born");
        }
    }
}