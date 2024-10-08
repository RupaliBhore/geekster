// // Form the largest number


// Meet Sarah, an enthusiastic programmer who loves to solve challenging problems. She was recently given an array of non-negative integers and was asked to arrange its elements in such a way that they form the largest possible number.

// Solve the problem by comparing the values of the elements in a way that produced the maximum possible number.

// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Click here

// Input Format

// First line take an integer input from user as n , where n is the size of array.
// Second line takes n elements as non-negative integers input in array.

// Constraints
// 1<=n<=100
// 1<=arr[i]<=10^4

// Output Format
// Return the largest number

// Sample Input 0
// 4
// 4 46 8 9

// Sample Output 0
// 98464


//discussed

import java.io.*;
import java.util.*;

public class Q8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] A = new String[n];
        for(int i=0; i<n; i++){
            int val = scn.nextInt();
            A[i]= "" + val;  // add "" for converting in string 
        }
        
        Comparator<String> myComp = new Comparator<String>(){
            public int compare(String a , String b ){
                    String x = a + b;             
                    String y = b + a;
                
                int p = Integer.parseInt(x);  // change it into integer bcz we cant operate string while q-p 
                int q = Integer.parseInt(y); //v we cant subtract it in string formate
                return q-p ; //for decreasing in order series
            } 
        };
        
        
        Arrays.sort(A, myComp);
        for(int i=0; i<n; i++){
            System.out.print(A[i]);
        }
        
        
    }
}











// // asked one
// import java.io.*;
// import java.util.*;

// public class Q18 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Read the size of the array
//         int n = sc.nextInt();
//         String[] nums = new String[n];

//         // Read the elements of the array
//         for (int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt() + "";
//         }

//         // Sort the numbers based on custom comparator
//         Arrays.sort(nums, new Comparator<String>() {
//             @Override
//             public int compare(String x, String y) {
//                 // Compare based on the concatenated results
//                 return (y + x).compareTo(x + y);
//             }
//         });

//         // Handle case where the largest number is "0"
//         if (nums[0].equals("0")) {
//             System.out.println("0");
//         } else {
//             // Concatenate the sorted numbers
//             StringBuilder sb = new StringBuilder();
//             for (String num : nums) {
//                 sb.append(num);
//             }
//             System.out.println(sb.toString());
//         }
//     }
// }