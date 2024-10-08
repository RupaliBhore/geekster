// HW_Form smallest number

// Meet Sarah, an enthusiastic programmer who loves to solve challenging problems. She was recently given an array of non-negative integers and was asked to arrange its elements in such a way that they form the Smallest possible number.

// Solve the problem by comparing the values of the elements in a way that produced the Smallest possible number.

// Input Format

// First line take an integer input from user as N , where N is the size of array.

// Second line takes N elements as non-negative integers input in array.

// Constraints

// 1<=N<=100

// 1<=arr[i]<=10^4
// Output Format

// Return the smallest number.

// Sample Input 0

// 6
// 5 6 2 9 21 1
// Sample Output 0

// 1212569
// Explanation 0

// Print the smallest number.


import java.io.*;
import java.util.*;

public class Q3 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        int N = scanner.nextInt();
        String[] arr = new String[N];

        // Input the elements of the array
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.next();
        }

        // Custom sort the array using a comparator
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order1.compareTo(order2);
            }
        });

        // If the largest number is '0', the result should be '0'
        if (arr[0].equals("0")) {
            System.out.println("0");
        } else {
            // Concatenate all numbers to form the smallest number
            StringBuilder smallestNumber = new StringBuilder();
            for (String num : arr) {
                smallestNumber.append(num);
            }
            System.out.println(smallestNumber.toString());
        }

        scanner.close();
    }
}