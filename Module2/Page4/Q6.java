// // Zeroes and Ones
// Suppose you work in a warehouse that receives shipments of boxes labeled with either "fragile" or "non-fragile". Your job is to sort these boxes into two different areas, one for fragile boxes and one for non-fragile boxes. However, you notice that the boxes are not always sorted properly, and sometimes the fragile and non-fragile boxes are mixed together.

// To make your job easier, you decide to write a program that can sort the boxes for you. Given an array of N elements consisting of only 0s and 1s, where 0 represents a non-fragile box and 1 represents a fragile box, write a function to sort the array in O(N) time complexity.

// Input Format

// First line contains integer N representing size of array.

// Second line contains N line of inputs representing elements of array.

// Constraints

// 1 <= n <= 10^4

// arr[i] == 0 or 1
// Output Format

// Return the Sorted array.

// Sample Input 0

// 6
// 0 1 1 1 1 0
// Sample Output 0

// 0 0 1 1 1 1
// Explanation 0

// no of zereos-2 no of one 4, separated by space



import java.util.*;

public class Q6 {

    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] A = new int [n];
        for (int i=0; i<n; i++) {
            A[i] = scn.nextInt();
        }
        
        int i = 0;
        int j= n-1;
                
        while(i<j){
            if (A[i]== 0){
                i++;
            }else if(A[j] ==1){
                j--;
                
            }else {
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
                i++;
                j--;
            }
                
        }
        for( i=0; i<n; i++) {
            System.out.print(A[i] + " ");
        }
        
        }
}
//too many ways to solve it,  discussed