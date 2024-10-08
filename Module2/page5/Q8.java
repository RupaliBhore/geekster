// // HW_Reach Target - II

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// Input Format

// An integer number N representing size of array

// N integer number representing elements of array.

// An integer number k representing target.

// Constraints

// 1 <= N <= 10^4

// -10^5 <= arr[i] <= 10^5

// -10^5 <= K <= 10^5
// Output Format

// Return All required pair.

// Sample Input 0

// 4
// 2 7 11 15
// 9
// Sample Output 0

// 0 1
// Explanation 0

// Because nums[0] + nums[1] == 9, we return [0, 1].


import java.util.*;

public class Q8 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        //Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==tar){
                System.out.println(i+" "+j);
                i++;
                j--;
            }   
            else if(arr[i]+arr[j]>tar){
                j--;
            }
            else{
                i++;
            }
        }
    }
}