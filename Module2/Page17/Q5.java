// HW_Find the missing number
// Given two integers (L,R), which define the range of integers, find out the missing elements.

// Input Format

// The first line contains N, the number of integers present in the array. The second line contains L and R that define the range of elements in the array. The third line contains N space separated integers. These elements may be repeated.

// Constraints

// 0 <= N, L, R <= 100

// 1 <= arr[i] <= 1000

// Output Format

// Print all the missing numbers in the range L and R. If all the numbers within the stated range are present, print -1 as the output.

// Sample Input 0

// 10
// 20 40
// 20 21 22 23 24 25 26 27 28 29
// Sample Output 0

// 30 31 32 33 34 35 36 37 38 39 40 
// Explanation 0

// The given value of N = 10 The given range = [20 - 40] And the given elements in the array are: 20 21 22 23 24 25 26 27 28 29

// The stated range is from 20 to 40 and the array contains only 10 elements (20 21 22 23 24 25 26 27 28 29) We see, the missing elements from the range are : 30 31 32 33 34 35 36 37 38 39 40 Therefore, they are printed as the output.

// Sample Input 1

// 1
// 1 10
// 5
// Sample Output 1

// 1 2 3 4 6 7 8 9 10 
// Explanation 1

// Given N = 1, which means the array currently contains only 1 element. The given range is from 1 to 10. The only element present in the array is 5. Therefore, the missing elements in the range 1-10 are: 1 2 3 4 6 7 8 9 10

// Sample Input 2

// 10
// 1 10
// 6 4 1 4 1 8 3 6 4 4
// Sample Output 2

// 2 5 7 9 10 
// Explanation 2

// The array contains total of 10 (N = 10) elements. The range of elements is stated to be 1-10. The unique elements in the array are: 1, 3, 4, 6 and 8 ELements 1, 4 and 6 are repeated. The missing elements in the range 1-10 are : 2 5 7 9 10 Therefore output = 2 5 7 9 10


import java.util.HashSet;
import java.util.Scanner;

public class Q5{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Number of integers
        int N = scanner.nextInt();
        
        // Input: Range L and R
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        
        // Input: Array of integers
        HashSet<Integer> present = new HashSet<>();
        for (int i = 0; i < N; i++) {
            present.add(scanner.nextInt());
        }
        
        // Store missing numbers
        StringBuilder missingNumbers = new StringBuilder();
        boolean foundMissing = false;

        // Check for missing numbers in the range [L, R]
        for (int i = L; i <= R; i++) {
            if (!present.contains(i)) {
                missingNumbers.append(i).append(" ");
                foundMissing = true;
            }
        }
        
        // Output the result
        if (foundMissing) {
            System.out.println(missingNumbers.toString().trim());
        } else {
            System.out.println(-1);
        }
        
        scanner.close();
    }
}
//finded