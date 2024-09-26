// // Given x and y, print xy

// Take x and y digits as integer inputs and then form a number xy from it and then finally print that number.

// for eg. if you are the given 3 and 4, then you have to form the number 34 from it and then finally print the number 34.

// Input Format

// The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.

// For each test case,

// Digit x will be given as an integer input in the first line,

// Digit y will be given as an integer input in the second line.

// Constraints

// 1 <= T <= 10^4

// 0 <= x , y <= 9
// Output Format

// Print the number xy as an integer output.

// Sample Input 0

// 4
// 4
// 3
// 1
// 2
// 3
// 5
// 5
// 3
// Sample Output 0

// 43
// 12
// 35
// 53
// Sample Input 1

// 3
// 8
// 9
// 9
// 9
// 5
// 6
// Sample Output 1

// 89
// 99
// 56

// import java.util.*;

// public class Q1 {

//     public static void main(String[] args) {
//           Scanner scanner = new Scanner(System.in);

//         // Reading the number of test cases
//         int T = scanner.nextInt();
//         // scanner.nextLine(); // Consume newline character after T

//         // Iterating over each test case
//         for (int i = 0; i < T; i++) {
//             // Reading digits x and y for each test case
//             int x = scanner.nextInt();
//             int y = scanner.nextInt();
            
//             // Forming the number xy
//             int number = formNumber(x, y);
            
//             // Printing the formed number
//             System.out.println(number);
//         }

//         scanner.close();
//     }

//     // Function to form number xy from digits x and y
//     public static int formNumber(int x, int y) {
//         return x * 10 + y; // Form the number by concatenating x and y
//     }
// }













// public class Q1 {
// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);

// int T = sc.nextInt(); // for test case 
// sc.nextLine();

// for(int i=0; i<T; i++){   
//     // Iterating over each test case
// int x = sc.nextInt();
// int y = sc.nextInt();

//  // Forming the number xy

//  int number = formingNumber(x , y) ;
//  System.out.println(number);

// }
//  sc.close();
// }
//  public static int formingNumber(int x , int y){
 
//      return x*10+y ;
//  }
// }


// Hackerrank Rupali

import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int t=sc.nextInt();
        
        for(int i=0; i<t; i++) {
                   
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        System.out.println(x+""+y);
        }
        
    }
}