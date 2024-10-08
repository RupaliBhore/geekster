// // Sort Array By Parity

// Given an integer array nums[] , move all the even integers at the beginning of the array followed by all the odd integers in non- decreasing order.

// Input Format

// First line contains an integer N representing the size to the array.

// Next N lines contains integer representing elements of array.

// Constraints

// 1 <= N <= 5000

// 0 <= nums[i] <= 5000
// Output Format

// Print the final array, each element is seperated by a single space.

// Sample Input 0

// 4
// 3 1 2 4
// Sample Output 0

// 2 4 1 3
// Explanation 0

// All even numbers are in the beginning and odd numbers are at the end









// By Chat Gpt

// import java.io.*;
// import java.util.*;

// public class Q1 {

//   public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Reading the size of the array
//         int N = sc.nextInt();
//         ArrayList<Integer> evens = new ArrayList<>();
//         ArrayList<Integer> odds = new ArrayList<>();

//         // Reading the elements of the array
//         for (int i = 0; i < N; i++) {
//             int num = sc.nextInt();
//             if (num % 2 == 0) {
//                 evens.add(num);
//             } else {
//                 odds.add(num);
//             }
//         }

//         // Sorting both lists
//         Collections.sort(evens);
//         Collections.sort(odds);

//         // Printing the final sorted array
//         for (int i : evens) {
//             System.out.print(i + " ");
//         }
//         for (int i : odds) {
//             System.out.print(i + " ");
//         }
//     }
// }



// by discussion

import java.util.*;

public class Q1 {
  public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] A = new int[n];
        for(int i=0; i<n; i++){
            A[i]= scn.nextInt();
        }

     int i= 0;
     int j= n-1;

     while (i<= j) {
       if(A[i] % 2 == 0 ){
        i++;

       }else if(A[j] % 2 != 0 ) {
        
        j--;

       }else{

        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
        i++;
         j--;

       }
    }


    Arrays.sort(A , 0, i);
    Arrays.sort(A , i, n);

    for(int k=0; k<n; k++){
        System.out.print(A[k] + " ");
    }

       }
    }

//discussed

//dry un
// import java.io.*;
// import java.util.*;

// public class Solution {
//                                                       //use 2 poniter approach
//     public static void main(String[] args) {
//          Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
        
//         int a[]=new int[n];
//         for(int i=0; i<n; i++)
//         {
//             a[i]=sc.nextInt();
//         }
        
//         int i=0;   //starting point 0index rakha
//         int j=n-1;  //ending point n-1 rakha
//                                                                                                           //i
//                                                                                                           //j
//         while(i<=j)    //jabtak starting point chota he ya barabar he ending point se tabtak loop chalo 1 2 3 4 yese
//         {                                                                                                  
//             if(a[i] % 2==0)   //agar starting me even number he to use vese hi rahane do i++ karo aage wala cheack karo
//             {
//                 i++;
//             }
//             else if(a[j] % 2 !=0)  //agar ending index odd he to use vese he rahane do aur uske piche wla check karo j--
//             {
//                 j--;
//             }
//             else         //varcha doni pan condition false astil tr else madhe swap kara even left la ghya odd right dya
//             {                      //If a[i] is odd and a[j] is even, swap them, then increment i and decrement j to                                            //continue checking the next elements. 
//                 int temp=a[i];   
//                 a[i]=a[j];  
//                 a[j]=temp;
//                 i++;
//                 j--;
//             }

//         }
        
//         Arrays.sort(a,0,i);   //After rearranging, Arrays.sort(a, 0, i) sorts the even numbers.
//         Arrays.sort(a,i,n);  //Arrays.sort(a, i, n) sorts the odd numbers.
        
//          for(int k=0; k<n; k++)
//         {
//             System.out.print(a[k]+" ");
//         }
//     }
// }
