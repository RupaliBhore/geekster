// // Sort the array according to their Square of each element


// Given an array arr[] of N integers, the task is to sort the array according to the Squares of each element.

// Input Format
// First line take an integer input from user as N , where N is the size of array.
// Second line takes N elements as integers input in array.

// Constraints
// 1<=n<=100
// -10^3<=arr[i]<=10^3

// Output Format
// Return the sorted array according to their squares.
// Sample Input 0
// 5
// 4 -1 0 -5 6
// Sample Output 0

// 0 -1 4 -5 6 


// discussed
import java.util.*;

public class Q10 {

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
              
              return a*a - b*b;        // a-b for increasing order b-a for decreasing order here for square we use square

            }
        };
 
           Arrays.sort(arr, myComp);

        // Output the sorted array
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//  chat Gpt

// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Reading the size of the array
//         int N = sc.nextInt();
//         int[] arr = new int[N];

//         // Reading the elements of the array
//         for (int i = 0; i < N; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Create an array of objects to hold elements and their squares
//         Element[] elements = new Element[N];
//         for (int i = 0; i < N; i++) {
//             elements[i] = new Element(arr[i], arr[i] * arr[i]);
//         }

//         // Sort elements based on their squared values
//         Arrays.sort(elements, (a, b) -> Integer.compare(a.square, b.square));

//         // Print the result array sorted by their squares
//         for (Element e : elements) {
//             System.out.print(e.value + " ");
//         }
//     }

//     // Helper class to store the value and its square
//     static class Element {
//         int value;
//         int square;

//         Element(int value, int square) {
//             this.value = value;
//             this.square = square;
//         }
//     }
// }