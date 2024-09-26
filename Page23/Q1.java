// // Find all Combination
// Given condition is that the array contains all the unique elements. Then take the sum as an integer input and print all the combinations of the pairs that add up to the given sum.

// Input Format

// An integer number n representing size of array

// N numbers representing elements of array

// An integer number k.

// Constraints

// 1<=n<=100000

// 0<=array[index]<=100000

// 0<=k<=1000000

// Output Format

// Print all Combination of pairs that gives the sum equals to the given number k.

// Sample Input 0

// 5
// 1 2 3 4 5
// 8
// Sample Output 0

// 3 5
// 4 4
// Explanation 0

// arr[2]+arr[4] = 8, also arr[4] +arr[2] = 8 but we need to print only combination. therefore we are not printing 5 3 as answer. arr[3]+arr[3] = 4.

import java.util.*;

public class Q1 {
    
    static void Combination(int [] arr, int n, int k) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if ((arr[i] + arr[j]) == k) {
                    System.out.println(arr[i] + " " + arr[j]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr [i] = scn.nextInt();
        }
        int k = scn.nextInt();
        scn.close();
        Combination(arr, n, k);
    }
}