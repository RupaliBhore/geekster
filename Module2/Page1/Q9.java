// decreasing order using inbuilt sort

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;



// Sort Array in decreasing order using inbuilt sort.

// Input Format
// First line of input contains integer N as size of array.
// Second line of contains N integer representing the elements of array.

// Constraints
// 1 <= N <= 10^5
// 1 <= arr[i] <= 10^5

// Output Format

// Return the sorted array

// Sample Input 0
// 5
// 1 2 3 4 5 

// Sample Output 0
// 5 4 3 2 1





// import java.util.*;

// public class Q9 {

//     public static void main(String[] args) {
//           Scanner scanner = new Scanner(System.in);

//         // Read the size of the array
//         int N = scanner.nextInt();

//         // Read the array elements
//         Integer[] arr = new Integer[N];
//         for (int i = 0; i < N; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         // Sort the array in decreasing order using inbuilt sort with a custom comparator
//         Arrays.sort(arr, Collections.reverseOrder());

//         // Output the sorted array
//         for (int i = 0; i < N; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }





// orr



public class Q9 {

   
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
  
          // Read the size of the array
          int N = scanner.nextInt();
  
          // Read the array elements
          Integer[] arr = new Integer[N];
  
          for (int i = 0; i < N; i++) {
              arr[i] = scanner.nextInt();
          }
  
          // how to write own Comparator
  
          Comparator<Integer>  myComp = new  Comparator<Integer>(){
  
              public int compare(Integer a, Integer b ){
                
                return b-a;    // a-b for increasing order b-a for decreasing order .
  
              }
          };
   
             Arrays.sort(arr, myComp);
  
          // Output the sorted array
          for (int i = 0; i < N; i++) {
              System.out.print(arr[i] + " ");
          }
      }
  }