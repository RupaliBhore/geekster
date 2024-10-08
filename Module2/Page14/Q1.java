// ArrayList Printing

// Declare an ArrayList as arr.
// Take N as an integer input.
// Take N elements inside the ArrayList.
// Print the ArrayList from the starting using for loop and for-each loop.
// Input Format

// Single Integer N.
// N Integers
// Constraints

// 1 <= N <= 10^5
// 0 <= arr[i] <= 10^5
// Output Format

//  N Integers (using for loop)
//  N Integers (using for-each loop)
// Sample Input 0

// 5
// 1 2 3 4 5
// Sample Output 0

// 1 2 3 4 5 
// 1 2 3 4 5 
// Explanation 0

//  Arr = [1, 2, 3, 4, 5]


import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Step 1: Take the integer input N
        int N = scn.nextInt();
        
        // Step 2: Declare the ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
        
        // Step 3: Take N elements as input and store them in the ArrayList
        for (int i = 0; i < N; i++) {
            arr.add(scn.nextInt());
        }
        
        // Step 4: Print using for loop
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println(); // Move to the next line after for loop
        
        // Step 5: Print using for-each loop
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println(); // Move to the next line after for-each loop
    }
}