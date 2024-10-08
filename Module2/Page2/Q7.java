// // Sort an array in wave form 1

// Let me introduce you to John, who loves to play with numbers. One day, he was given an unsorted array of integers and was challenged to transform it into a wave-like array. John found it interesting and decided to take up the challenge.

// Help John by sorting the array into a wave like array. An array arr[0..n-1] is sorted in wave form if

// arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..

// Input Format
// First line take an integer input from user as N , where N is the size of array.
// Second line takes N elements as non-negative integers input in array.

// Constraints
// 1<=n<=100
// 1<=arr[i]<=10^4

// Output Format
// Return the array in sorted wave form.

// Sample Input 0
// 7
// 10 90 49 2 1 5 23
// Sample Output 0
// 2 1 10 5 49 23 90 


import java.util.Arrays;
import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input size of the array
        int N = sc.nextInt();
        int[] arr = new int[N];
        
        // Input array elements
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Transform the array into wave form
        transformToWave(arr);
        
        // Print the result
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
    public static void transformToWave(int[] arr) {
        // Sort the array                                    //0 1 2 3  4   5 6 
        Arrays.sort(arr);//10 90 49 2 1 5 23         sort    //1 2 5 10 23 49 90
        
        // Swap adjacent elements to create wave pattern
        for (int i = 0; i < arr.length - 1; i += 2) { //0 //2 //4 //6
            // Swap elements at index i and i+1
            int temp = arr[i];  // 1 //5 //23
            arr[i] = arr[i + 1]; //0+1=1idx val= 2 //2+1=3inx val=10 //4+1=5idx val=49
            arr[i + 1] = temp; //1 //5 //23
        }
        //2 1 10 5 49 23
    }
}


import java.util.*;

public class Q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
     int n = sc.nextInt();
        int[] A = new int[n];
     
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }
     
     
        Arrays.sort(A);

        for(int i=0; i<=n-2; i += 2){
           
            int tmp = A[i];
            A[i] = A[i+1];
            A[i+1] = tmp;

        }   
        
            for(int i=0; i<n; i++){
            System.out.print(A[i] + " ");
        }

    }
}
