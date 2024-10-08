// priority queue basics

// Take T as an integer input. Then take t integer elements as input. Each time you take an input. Print the smallest element so far, each time a new element is taken as an input.

// Input Format

// Single IntegerT .
// T lines of Input with sinlge Integer.
// Constraints

//  0 <T  <= 10^5 
//  -10^6 <= A[i] <= 10^6
// Output Format

// T Lines of Output with minimum element.

// Sample Input 0

// 5
// 4
// 2
// 1
// 3
// -1
// Sample Output 0

// 4
// 2
// 1
// 1
// -1
// Explanation 0

// A = [4] , min_element = 4.
// A = [4, 2] , min_element = 2.
// A = [4, 2, 1] , min_element = 1.
// A = [4, 2, 1, 3] , min_element = 1.
// A = [4, 2, 1, 3, -1] , min_element = -1.



import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input: First integer is the number of elements
        int T = sc.nextInt();
        
        int minElement = Integer.MAX_VALUE;  // Initialize to a large value
        
        // Loop through each of the next T integers
        for (int i = 0; i < T; i++) {
            int num = sc.nextInt();
            
            // Update the minimum element if the current number is smaller
            if (num < minElement) {
                minElement = num;
            }
            
            // Print the current minimum element
            System.out.println(minElement);
        }
        
        sc.close();
    }
}
//finded