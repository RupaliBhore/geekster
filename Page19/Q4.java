// // Check if two arrays are identical?
import java.util.*;

public class Q4 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read size of array1
        int n = scanner.nextInt();
        
        // Initialize array1 of size n
        int[] array1 = new int[n];
        
        // Read elements of array1
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }
        
        // Read size of array2
        int m = scanner.nextInt();
        
        // Initialize array2 of size m
        int[] array2 = new int[m];
        
        // Read elements of array2
        for (int i = 0; i < m; i++) {
            array2[i] = scanner.nextInt();
        }
        
        // Check if arrays are equal
        if (n != m) {
            System.out.println("false");
        } else {
            boolean isEqual = true;
            for (int i = 0; i < n; i++) {
                if (array1[i] != array2[i]) {
                    isEqual = false;
                    break;
                }
            }
            System.out.println(isEqual ? "true" : "false");
        }

        scanner.close();
    }
}



// Time Complexity:-O(n+m) because reading elements into both arrays requires O(n) and O(m) time respectively, and comparing the arrays takes O(min(n,m)) time.
// Space complexity:- O(n+m) due to the storage of both arrays of sizes n and m.







// Question:-
// Take n as an integer input. Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

// Declare the second array of size m that stores values of int data-type. Then take m integer inputs and store them in the array one by one.

// Then print true if the arrays are equal and print false if the array is not equal.

// Definition of Equal Arrays: Arrays whose size is equal and whose elements at the corresponding indexes are the same

// Input Format

// A number n denoting array1 size

// n numbers representing elements of array1

// A number m denoting array2 size

// m numbers representing elements of array2

// Constraints

// 1 <= n , m <= 1000000
// 1 <= array1[i] <= 1000000
// 1 <= array2[i] <= 1000000
// Output Format

// Print true or false

// Sample Input 0

// 5
// 1 2 3 4 5
// 5 
// 1 2 3 4 5
// Sample Output 0

// true
// Explanation 0

// Since size of both arrays are same. And array1[i]==array2[i] is same for all 0<=i<=array.length.Therefore answer is true.

