// // Shop Discount

// A shop will give a discount of 10% on the total cost if the cost of the quantity purchased is more than 1000. a. Ask user for the number of units b. Suppose, one unit will cost 100. c. Judge and print total cost for the user in the integer format.

// Input Format

// For each test case, You will be given the number of units in the integer format.

// Constraints

// 0<=number of units<=2^20-1

// Output Format

// You have to print the final cost of the quantities.

// Sample Input 0

// 15
// Sample Output 0

// 1350
// Explanation 0

// The output is 1350, because the entered quantity is 15, so the cost of the units before the discount is 1500, now 10% discount on 1500 is 150, so the final cost becomes 1500-150, which is equal to 1350.

// Sample Input 1

// 10
// Sample Output 1

// 1000
// Sample Input 2

// 9
// Sample Output 2

// 900
// Sample Input 3

// 11
// Sample Output 3

// 990
// Sample Input 4

// 8
// Sample Output 4

// 800


import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
         int numberOfUnits = scn.nextInt();
        int costPerUnit = 100;
        int totalCost = numberOfUnits*costPerUnit;
        if (totalCost > 1000) {
            int discount = (int) (0.1 * totalCost); 
            totalCost -= discount;
        }
        
        System.out.println(totalCost);
    }
}