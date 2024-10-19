// // HW_Lucky Number 26

// Given an array arr of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value. Return the largest lucky integer in the array. If there is no lucky integer return -1.

// Input Format

// N as size
// N int value as array elements
// Constraints

// 1<=N<=10^5
// 1<=arr[i]<10
// Output Format

// Lucky Number

// Sample Input 0

// 5
// 1 2 2 3 4
// Sample Output 0

// 2
// Explanation 0

// There are two lucky numbers:

// 1 because frequency of 1 is equals to 1

// 2 because frequency of 2 is equals to 2.

// 2 is largest among the two lucky numbers, hence output is 2.


import java.util.*;                 //with array

public class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int N = scanner.nextInt();

        // Initialize the frequency array for digits 1 through 9
        int[] frequency = new int[10];

        // Read array elements and populate the frequency array
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num >= 1 && num <= 9) {
                frequency[num]++;
            }
        }

        // Find the largest lucky integer
        int largestLucky = -1;
        for (int i = 1; i <= 9; i++) {
            if (frequency[i] == i) {
                largestLucky = i;
            }
        }

        // Print the result
        System.out.println(largestLucky);

        scanner.close();
    }


}




                              //with hashmap
import java.util.*;
import java.util.HashMap;

public class LuckyIntegerFinder {
    public static int findLargestLuckyInteger(int[] arr) {
        // Step 1: Count frequencies using HashMap
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Find the largest lucky integer
        int largestLucky = -1;
        for (int key : frequencyMap.keySet()) {   ///keySet all key dete
            int frequency = frequencyMap.get(key); //  get(key) ji key yeil tya key chi value return karel value freq                                                         //madhe store hoil
            if (key == frequency) {                //key=
                largestLucky = Math.max(largestLucky, key);
            }
        }
        
        // Step 3: Return result (largest lucky number or -1)
        return largestLucky;
    }

    public static void main(String[] args) {
        // Sample input
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        //int[] arr = {5, 1, 2, 2, 3, 4};
        
        // Output the largest lucky integer
        System.out.println(findLargestLuckyInteger(arr));  // Output: 2
    }
}



/////////////print key and ist freq progrma

// import java.io.*;
// import java.util.*;

// public class Solution {

//     static void maxFeq(int a[]) {
//         // Step 1: Create a HashMap to count frequencies
//         Map<Integer, Integer> hm = new HashMap<>();
        
//         // Step 2: Populate the HashMap with frequency counts
//         for (int val : a) {
//             if (hm.containsKey(val)) {
//                 hm.put(val, hm.getOrDefault(val, 0) + 1);
//             } else {
//                 hm.put(val, 1);
//             }
//         }
        
//         // Step 3: Print all key-value pairs
//         for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
//             System.out.println(entry.getKey() + " " + entry.getValue());
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         int a[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }
        
//         maxFeq(a);
//     }
// }
