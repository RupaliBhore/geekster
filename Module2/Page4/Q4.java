// Interleaving x and y Elements

// Suppose you have an array called nums that contains 2N elements. The first N elements are labeled as x1, x2, ..., xn, and the remaining N elements are labeled as y1, y2, ..., yn.

// Your task is to rearrange the elements of the nums array in a specific way. Specifically, you need to create a new array where the first element is x1, the second element is y1, the third element is x2, the fourth element is y2, and so on, up to the nth element being yn.

// In other words, you need to return an array in the form [x1, y1, x2, y2, ..., xn, yn].

// NOTE :- After answering the question, attempt the related question in the linked resource to improve your understanding of this question. Click here

// Input Format

// An integer N representing the length of array.

// N integers representing the elements of array.

// Constraints

// 0 <= N <= 10000

// 0 <= arr[i] <= 10000
// Output Format

// Return the array.

// Sample Input 0

// 6
// 2 5 1 3 4 7
// Sample Output 0

// 2 3 5 4 1 7


import java.util.*;

public class Q4 {

    public static void main(String[] args) {       
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int [] ans=new int[n];
        int j =0;
        int k = n/2;
        int i=0; 
        while(i<n){
            ans[i] = a[j];
            j++;
            i++;
            ans[i] = a[k];
            k++;
            i++;
        }
        
        for( i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}