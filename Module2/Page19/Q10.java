// weakest rows

// You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the 0's left of all the  in each row.

// A row i is weaker than a row j if one of the following is true:

// The number of soldiers in row  is less than the number of soldiers in row j .
// Both rows have the same number of soldiers and i<j .
// Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.

// NOTE :- After answering the question, attempt the related question in the linked resource to improve your understanding of this question . Click here

// Input Format

// Three Integers M ,N ,K .
// M lines of N Integers spaces with single space.

// Constraints

// m == mat.length
// n == mat[i].length
// 2 <= n, m <= 10000
// 1 <= k <= m
// matrix[i][j] is either 0 or 1.
// Output Format

// K Integers spaced with single space.

// Sample Input 0

// 5 5 3
// 1 1 0 0 0
// 1 1 1 1 0
// 1 0 0 0 0 
// 1 1 0 0 0 
// 1 1 1 1 1
// Sample Output 0

// 2 0 3
// Explanation 0

// The number of soldiers in each row is:

// Row 0: 2
// Row 1: 4
// Row 2: 1
// Row 3: 2
// Row 4: 5
// The rows ordered from weakest to strongest are [2,0,3,1,4].


import java.util.*;

public class Q10 {

     public static int[] kWeakestRows(int[][] mat, int m, int n, int k) {
        // List to store soldier count and respective row index
        List<int[]> soldiers = new ArrayList<>();
        
        // Count the number of soldiers in each row
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    count++;
                } else {
                    break; // Since soldiers are in front of civilians, we can break here
                }
            }
            soldiers.add(new int[]{count, i}); // Store count and index
        }
        
        // Sort the list based on number of soldiers and then by index
        Collections.sort(soldiers, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]); // Sort by index if soldiers count is the same
            }
            return Integer.compare(a[0], b[0]); // Sort by soldier count
        });
        
        // Prepare result array to hold the weakest row indices
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = soldiers.get(i)[1]; // Get the index of the weakest rows
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input for m, n, k
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        // Input for the matrix
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        // Get the indices of the k weakest rows
        int[] weakestRows = kWeakestRows(mat, m, n, k);
        
        // Print the result
        for (int i = 0; i < weakestRows.length; i++) {
            System.out.print(weakestRows[i]);
            if (i < weakestRows.length - 1) {
                System.out.print(" "); // Print space between indices
            }
        }
        
        sc.close();
    }
}
//finded 
