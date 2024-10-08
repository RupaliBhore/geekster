// HW_Union of two arrays 5

// Given two arrays a[] and b[] of size n and m respectively. The task is to find the number of elements in the union between these two arrays.

// Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.

// Input Format

// The first Line will integer N representing the Size of Array 1.

// The second Line will N integer representing the Element of Array 1.

// The first Line will integer M representing the Size of Array 2.

// The second Line will M integer representing the Element of Array 2.

// Constraints

// 1 ≤ n ≤ 10^5

// 0 ≤ a[i] < 10^5

// 1 ≤ m ≤ 10^5

// 0 ≤ b[i] < 10^5

// Output Format

// returns the count of union elements of the two arrays.

// Sample Input 0

// 5
// 1 2 3 4 5
// 3
// 1 2 3
// Sample Output 0

// 5



import java.util.*;

public class Q7 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read size of the first array
        int n = scanner.nextInt();
        int[] a = new int[n];
        
        // Read elements of the first array
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        // Read size of the second array
        int m = scanner.nextInt();
        int[] b = new int[m];
        
        // Read elements of the second array
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        
        // Find the number of distinct elements in the union of both arrays
        int unionCount = findUnionCount(a, b);
        System.out.println(unionCount);
        
        scanner.close();
    }
    
    private static int findUnionCount(int[] a, int[] b) {
        HashSet<Integer> unionSet = new HashSet<>();
        
        // Add all elements of the first array to the set
        for (int num : a) {
            unionSet.add(num);
        }
        
        // Add all elements of the second array to the set
        for (int num : b) {
            unionSet.add(num);
        }
        
        // The size of the set is the number of distinct elements in the union
        return unionSet.size();
    }
}
//finded 
// Time Complexity: O(n + m), where n is the number of elements in the first array and m is the number of elements in the second array. Each insertion in the HashSet takes average O(1) time.
// Space Complexity: O(n + m) in the worst case, as we may need to store all unique elements from both arrays in the HashSet.
