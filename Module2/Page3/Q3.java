// HW_Form smallest number

// Meet Sarah, an enthusiastic programmer who loves to solve challenging problems. She was recently given an array of non-negative integers and was asked to arrange its elements in such a way that they form the Smallest possible number.

// Solve the problem by comparing the values of the elements in a way that produced the Smallest possible number.

// Input Format

// First line take an integer input from user as N , where N is the size of array.

// Second line takes N elements as non-negative integers input in array.

// Constraints

// 1<=N<=100

// 1<=arr[i]<=10^4
// Output Format

// Return the smallest number.

// Sample Input 0

// 6
// 5 6 2 9 21 1
// Sample Output 0

// 1212569
// Explanation 0

// Print the smallest number.


import java.io.*;
import java.util.*;

public class Q3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        
        String[] A = new String[n];
        
        for(int i=0; i<n; i++){
            int val = scn.nextInt();
            A[i]= "" + val;  // add "" for converting in string 
        }
        

        
        
                // Create a custom comparator using the specified syntax
        Comparator<String> myc = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (a + b).compareTo(b + a);  //positiv int asel tr acending madhe sort kara
            }
        };
        
        
        Arrays.sort(A, myc);
        for(int i=0; i<n; i++){
            System.out.print(A[i]);
        }
        
        
    }
}










// import java.io.*;
// import java.util.*;

// public class Q3 {

//     public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

//         // Input the size of the array
//         int N = scanner.nextInt();
//         String[] arr = new String[N];

//         // Input the elements of the array
//         for (int i = 0; i < N; i++) {
//             arr[i] = scanner.next();
//         }

//         // Custom sort the array using a comparator
//         Arrays.sort(arr, new Comparator<String>() {
//             public int compare(String a, String b) {
//                 String order1 = a + b;
//                 String order2 = b + a;
//                 return order1.compareTo(order2);
//             }
//         });

//         // If the largest number is '0', the result should be '0'
//         if (arr[0].equals("0")) {
//             System.out.println("0");
//         } else {
//             // Concatenate all numbers to form the smallest number
//             StringBuilder smallestNumber = new StringBuilder();
//             for (String num : arr) {
//                 smallestNumber.append(num);
//             }
//             System.out.println(smallestNumber.toString());
//         }

//         scanner.close();
//     }
// }


// import java.util.Scanner;
// import java.util.Arrays;
// import java.util.Comparator;

// public class CustomSortExample {
//     public static void main(String[] args) {
//         String[] numbers = {"5", "6", "2", "9","21","1"};   //output [1, 21, 2, 5, 6, 9]


//         // Create a custom comparator using the specified syntax
//         Comparator<String> myc = new Comparator<String>() {
//             @Override
//             public int compare(String a, String b) {
//                 return (a + b).compareTo(b + a);  //positiv int asel tr acending madhe sort kara
//             }
//         };

        // Sort using the custom comparator
        Arrays.sort(numbers, myc);

        // Print the sorted array
        System.out.println(Arrays.toString(numbers));
        
        // Arrays.toString() is a utility method from the java.util package that converts the array numbers into a                   string           where each element is separated by commas. 
        //showing something like [element1, element2, element3, ...], 
    }
}
// The compareTo method compares these two concatenated strings lexicographically (dictionary order).

// If (a + b) is lexicographically less than (b + a), compareTo will return a negative integer.

// If (a + b) is lexicographically greater than (b + a), it will return a positive integer.

// If they are equal, it will return zero.


// a = "10"
// b = "2"
// Now, we evaluate:

// Concatenations:

// a + b → "102"
// b + a → "210"

// Now we compare "102" and "210":
// Since "102" is lexicographically less than "210", the result of compareTo will be negative.
   

// Summary of compareTo Result:
// If the first string is less than the second string, compareTo returns a negative integer.
// If the first string is greater than the second string, it returns a positive integer.
// If both strings are equal, it returns zero.



//Initial Comparison:

// Compare "5" and "6":
// "5" + "6" = "56"
// "6" + "5" = "65"
// "56".compareTo("65") → returns negative (so "5" comes before "6").
// Next Comparison:

// Compare "6" and "2":
// "6" + "2" = "62"
// "2" + "6" = "26"
// "62".compareTo("26") → returns positive (so "2" comes before "6").
// Swap "6" and "2":
// Copy
// numbers = {"5", "2", "6", "9", "21", "1"}
// Next Comparison:

// Compare "6" and "9":
// "6" + "9" = "69"
// "9" + "6" = "96"
// "69".compareTo("96") → returns negative (so "6" comes before "9").
// Next Comparison:

// Compare "9" and "21":
// "9" + "21" = "921"
// "21" + "9" = "219"
// "921".compareTo("219") → returns positive (so "21" comes before "9").
// Swap "9" and "21":
// Copy
// numbers = {"5", "2", "6", "21", "9", "1"}
// Next Comparison:

// Compare "9" and "1":
// "9" + "1" = "91"
// "1" + "9" = "19"
// "91".compareTo("19") → returns positive (so "1" comes before "9").
// Swap "9" and "1":
// Copy
// numbers = {"5", "2", "6", "21", "1", "9"}
// Second Pass (to ensure sorting):
// The sorting algorithm may require multiple passes through the array to ensure all elements are in the correct order.

// First Comparison:

// Compare "5" and "2":
// "5" + "2" = "52"
// "2" + "5" = "25"
// "52".compareTo("25") → returns positive (so "2" comes before "5").
// Swap "5" and "2":
// Copy
// numbers = {"2", "5", "6", "21", "1", "9"}
// Next Comparison:

// Compare "5" and "6":
// "5" + "6" = "56"
// "6" + "5" = "65"
// "56".compareTo("65") → returns negative (no swap).
// Next Comparison:

// Compare "6" and "21":
// "6" + "21" = "621"
// "21" + "6" = "216"
// "621".compareTo("216") → returns positive (so "21" comes before "6").
// Swap "6" and "21":
// Copy
// numbers = {"2", "5", "21", "6", "1", "9"}
// Next Comparison:

// Compare "6" and "1":
// "6" + "1" = "61"
// "1" + "6" = "16"
// "61".compareTo("16") → returns positive (so "1" comes before "6").
// Swap "6" and "1":
// Copy
// numbers = {"2", "5", "21", "1", "6", "9"}
// Next Comparison:

// Compare "6" and "9":
// "6" + "9" = "69"
// "9" + "6" = "96"
// "69".compareTo("96") → returns negative (no swap).
// Final Pass:
// Final Sorting:
// Continue comparing until no more swaps are needed.
// Eventually, you will arrive at the final sorted order.
// Final Sorted Array:
// After all comparisons and swaps, the final sorted array will be:

// Copy
// numbers = {"1", "2", "21", "5", "6", "9"}
