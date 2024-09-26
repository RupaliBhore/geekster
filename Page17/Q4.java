// // Print the final number xyzw...

// Take n as an integer input. Then take n digits as integer inputs and form a number from 
// it and print that number as an integer output.

// Input Format

// For each test case, n will be given as an integer input in the first line,

// then n digits will be given as integer inputs in each line.

// Constraints

// 1 <= n <= 2^3 

// 0 <= digits as integer inputs <= 9

// Output Format

// Print the final number as an integer output.

// Sample Input 0

// 4
// 1
// 2
// 3
// 6
// Sample Output 0

// 1236
// Sample Input 1

// 5
// 1
// 2
// 3
// 6
// 7
// Sample Output 1

// 12367
// Sample Input 2

// 6
// 8
// 5
// 6
// 7
// 8
// 9
// Sample Output 2

// 856789
// Sample Input 3

// 3
// 4
// 5
// 8
// Sample Output 3

// 458
// Sample Input 4

// 2
// 7
// 9
// Sample Output 4

// 79







// import java.util.*;

// public class Q4 {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

       
//         int n = scanner.nextInt();      //2
//         scanner.nextLine(); 

//         // Initialize an array to store the digits
//         int[] digits = new int[n]; // 7 , 9

//         // Reading the digits
//         for (int i = 0; i < n; i++) {
//             digits[i] = scanner.nextInt();  // [7 , 9 ]
//         }

//         // Close the scanner
//         scanner.close();

//         // Forming the number from the digits
//         int formedNumber = formNumber(digits); 

//         // Printing the formed number
//         System.out.println(formedNumber);
//     }

//     // Function to form number from digits
//     public static int formNumber(int[] digits) {  // [7 , 9 ]
//         int number = 0;

//         // Calculate the number from digits
//         for (int i = 0; i < digits.length; i++) {
//             number = number * 10 + digits[i]; // 7 9
//         }

//         return number;
//     }
// }

// rupalis code



import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 2

        if (n > 0) { //2

            int number = 0;

            for (int i = 0; i < n; i++) {
                int digit = scanner.nextInt();   // 7 

                if (digit >= 0 && digit <= 9) {

                    number = number * 10 + digit;   //7 //9
                 } 
                 else {

                    i--; // decrement i to re-take the digit
                }
            }

            // Output: formed number
            System.out.println(number);
        } 

    }
}