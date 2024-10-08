// Merge two sorted arrays

// Given two sorted arrays A[] and B[] of size N and M. The task is to merge both the arrays into a single array in non-decreasing order.

// Input Format

// First line take an integer input from user as N , where N is the size of A[].

// Second line takes N elements as Integer input in A[].

// Third line take an integer input from user as M , where M is the size of B[].

// Next line takes M elements as Integer input in B[].

// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Click here

// Constraints

// 1<=N<=200

// 1<=M<=200

// -10^4 <= A[i], B[j] <= 10^4
// Output Format

// Return the merged Array.

// Sample Input 0

// 4
// 1 3 5 7
// 4
// 2 4 6 8
// Sample Output 0

// 1 2 3 4 5 6 7 8 
// Explanation 0

// The merged array contains all the elements from both arrays in sorted order.



import java.util.*;

public class Q5 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of the first array
        int N = sc.nextInt();
        int[] A = new int[N];
        
        // Read elements of the first array
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Read size of the second array
        int M = sc.nextInt();
        int[] B = new int[M];
        
        // Read elements of the second array
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }

        // Merge the arrays
        int[] mergedArray = mergeSortedArrays(A, B);

        // Print the merged array
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    private static int[] mergeSortedArrays(int[] A, int[] B) {
        int N = A.length;
        int M = B.length;
        int[] result = new int[N + M];
        
        int i = 0, j = 0, k = 0;
        
        while (i < N && j < M) {
            if (A[i] <= B[j]) {
                result[k++] = A[i++];
            } else {
                result[k++] = B[j++];
            }
        }
        
        // Copy remaining elements of A[], if any
        while (i < N) {
            result[k++] = A[i++];
        }
        
        // Copy remaining elements of B[], if any
        while (j < M) {
            result[k++] = B[j++];
        }
        
        return result;
    }
}

//dry run
// import java.io.*;
// import java.util.*;

// public class Solution {
    
//      public static int[] mergeSortedArrays(int[] a,int n, int[] b, int m) {
         
         
//          int i=0;
//          int j=0; 
//          int k=0;
//          int res[]=new int[n+m];   //result = new int[N + M] = new int[6] = {0, 0, 0, 0, 0, 0}
             
             
//         while(i<n && j<m) //joprayt i madhe frist arry madhe ele ahet j madhe 2nd array madhe ele ahet toprynt 
//         {
//             if(a[i] <= b[j]) //a arryche lahan elemet asel tr res array madhe taka mag k chi index vadava next a array 
//             {                ///chi inext vadava i++
//                 res[k]=a[i];
//                 k++;         //k chi index vadava next
//                 i++;         //a arryachi index vadava next wali
//             }
            
//             else{            //jar a array cha elemt mota asel b array peksa tar b arryacha ele res array madhe taka
//                 res[k]=b[j];  //asha prakare aarya sorted madhe marge hoil
//                 k++;
//                 j++;
//             }
//         }
         
//          if(i<n)
//          {
//              res[k]=a[i];
//              k++;
//              i++;
//          }
         
         
//          if(j<m)
//          {
//              res[k]=b[j];
//              k++;
//              j++;
//          }
         
//          return res;
//      }
   

//     public static void main(String[] args) {
//              Scanner sc = new Scanner(System.in);
        
//         // Input size of array A
//         int n = sc.nextInt();
//         int[] A = new int[n];
        
//         // Input elements of array A
//         for (int i = 0; i < n; i++) {
//             A[i] = sc.nextInt();
//         }
        
//         // Input size of array B
//         int m = sc.nextInt();
//         int[] B = new int[m];
        
//         // Input elements of array B
//         for (int i = 0; i < m; i++) {
//             B[i] = sc.nextInt();
//         }
        
//         // Merge the two sorted arrays
//         int[] mergedArray = mergeSortedArrays(A,n, B,m);
        
//         // Print the merged array
//         for (int i : mergedArray) {
//             System.out.print(i + " ");
//         }
//     }
//     }





//LEEtcode
// class Solution {                                                        //0 1 2 3                //0 1 2 3
//     public void merge(int[] nums1, int m, int[] nums2, int n) {  //num1   1 3 5 7       //num2     2 4 6 8
//         int i = m - 1;      //4-1=3
//         int j = n - 1;        //4-1=3
//         int k = m + n - 1;    //4+4+-1=7  //last position of final merged array
        

// //2nd arrayche last cha elemet joptayt 0 hot nahi toprayt loop chalava
//         while (j >= 0) {   //3>=0 
//             if (i >= 0 && nums1[i] > nums2[j]) {   //3>=0 && 7 > 8
//                 nums1[k--] = nums1[i--];
//             } else {
//                 nums1[k--] = nums2[j--]; //j--2 k
//             }
//         }
//     }
// }
