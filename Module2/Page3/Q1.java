// HW_Sort the array according to their 

// Sophie is a student who enjoys playing video games in her free time. One of her favorite games involves an array of integers. Sophie noticed that the array was unsorted and she wanted to sort it in a unique way.

// She thought of an interesting challenge - to sort the array acccording to the cubes of the elements.

// Help Sophie and write a program that sort the array according to teh cubes of the elements.

// Input Format

// First line take an integer input from user as N , where N is the size of array.

// Second line takes N elements as integers input in array.

// Constraints

// 1 <= N <= 100

// -10^2 <= arr[i] <= 10^2
// Output Format

// Return the sorted array according to their cubes.

// Sample Input 0

// 5
// 4 -1 0 -5 6
// Sample Output 0

// -5 -1 0 4 6 
// Explanation 0

// Print the sorted array


import java.io.*;
import java.util.*;

public class Q1 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        int N = scanner.nextInt();

        // Input the elements of the array
        Integer[] arr = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array based on the cubes of the elements
        Arrays.sort(arr, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                long cubeA = (long) a * a * a;
                long cubeB = (long) b * b * b;
                return Long.compare(cubeA, cubeB);
            }
        });

        // Output the sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
