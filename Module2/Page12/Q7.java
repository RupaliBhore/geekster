// Search Character
// Given a small case character ch and a sorted array containing only the small case alphabets, you have to print the alphabet just greater than the character ch present in array. If no such character found print -1.

// Input Format

// An Character ch
// An integer value representing size of array
// n character value representing elements of array.
// Constraints

// 'a'<=ch<='z'
// 1<=n<=100000
// 'a'<=arr[i]<='z'
// Output Format

// A Character value

// Sample Input 0

// c
// 5
// a b c d e
// Sample Output 0

// d
// Explanation 0

// since d is just greater than the c in given array


import java.util.*;

public class Q7 {
    
    
     public static int binarySearch(char [] A , char x){
         
         int i=0;
         int j = A.length-1;
         while(i <= j){
             int m = (i+j)/2 ;
             if(A[m] == x){
                 return m ;
             }
             else if(A[m] > x ){ //left
                 j = m - 1 ;
             }
             else{ //right
                 i = m + 1;
                 
             }
         }
         return -1;
     }

    public static void main(String[] args) {
   Scanner scn = new Scanner (System.in);
     char x = scn.next().charAt(0);  //'b'
        int n = scn.nextInt();
        char [] A = new char[n];
        for(int i=0; i<n; i++){
            A[i] = scn.next().charAt(0);
                
        }
        
        //b ==> c
        x++;
        for(char ch=x; ch<='z'; ch++){
            int ans = binarySearch(A, ch);
                if(ans != -1){
                    System.out.println(A[ans]);
                    return;
                }
        }
        System.out.println(-1);
    }

}
// discussed one














// import java.io.*;
// import java.util.*;

// public class Q7 {
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Read input
//         char ch = sc.next().charAt(0); // Character input
//         int n = sc.nextInt(); // Size of array
//         char[] arr = new char[n]; // Array of characters

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.next().charAt(0); // Reading characters into array
//         }

//         // Perform binary search to find the next greater character
//         char result = findNextGreaterChar(ch, arr);
        
//         // Output the result
//         if (result == '\0') { // '\0' represents no valid next character found
//             System.out.println(-1);
//         } else {
//             System.out.println(result);
//         }

//         sc.close();
//     }

//     // Function to find the next greater character using binary search
//     public static char findNextGreaterChar(char ch, char[] arr) {
//         int low = 0;
//         int high = arr.length - 1;
//         char result = '\0'; // Using '\0' to signify no valid next character

//         while (low <= high) {
//             int mid = low + (high - low) / 2;

//             if (arr[mid] > ch) {
//                 result = arr[mid];
//                 high = mid - 1; // Search in the left half
//             } else {
//                 low = mid + 1; // Search in the right half
//             }
//         }

//         return result;
//     }
// }