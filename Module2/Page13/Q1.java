// Search insert position



// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

// Input Format

// Given an array arr and an interger x.

// Constraints

// 1 <= nums.length <= 104 -104 <= nums[i] <= 104 nums contains distinct values sorted in ascending order. -104 <= target <= 104

// Output Format

// An integer denoting the index of target if present else the index where the element should be inserted.

// Sample Input 0

// 4
// 1 3 5 6
// 5
// Sample Output 0

// 2
// Explanation 0

// Here the nums array = [1,2,3,4,5] and the target is 4 so the output is 3 because array is 0-index means target which is 4 is present at index 3 in given array.

// Sample Input 1

// 4
// 1 3 5 6
// 2
// Sample Output 1

// 1
// Explanation 1

// Here the given array nums = [1,2,5,6] and target is 7 as you can see that target is not present in nums so we will insert it at index 4 means after last index of array which is 3. So the output is 4.

// Sample Input 2

// 4
// 1 3 5 6
// 7
// Sample Output 2

// 4




// finded

// import java.util.*;

// public class Q1 {
// public static int searchInsert(int[] nums, int target) {
//         int left = 0, right = nums.length - 1;
        
//         while (left <= right) {
//             int mid = left + (right - left) / 2; // Prevents potential overflow
//             if (nums[mid] == target) {
//                 return mid;
//             } else if (nums[mid] < target) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }
        
//         // If the target is not found, 'left' is the index where it should be inserted.
//         return left;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Read the size of the array
//         int n = scanner.nextInt();

//         // Read the sorted array
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         // Read the target value
//         int target = scanner.nextInt();

//         // Get the result from the searchInsert function
//         int result = searchInsert(arr, target);

//         // Print the result
//         System.out.println(result);

//         scanner.close();
//     }
// }




//  Discussed one

// import java.util.*;

// public class Q1 {

//     public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int A[] = new int[n];
        
//         for(int i = 0; i<n; i++){
//             A[i] = sc.nextInt();
//         }
//         int x = sc.nextInt();
    
//         int  i = 0 ;
//         int j = n-1;
//         int ans = -1; // suppose ans is -1 
//         while(i<=j){
//             int m = (i+j)/2;
//             if(A[m]==x){
//                 ans = m;
//                 System.out.println(m);
//                 return; 
//             }else if (A[m]>x){
//                 //left
//                 j= m-1;
//             }else{// save and right
//                 ans =m;
//                 i =m +1;
//             }
//         }
//         System.out.println(ans + 1);
//     }
// }






// class discussed using boolean

import java.util.*;

public class Q1 {

    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        
        for(int i = 0; i<n; i++){
            A[i] = sc.nextInt();
        }
        int x = sc.nextInt();
    
        int  i = 0 ;
        int j = n-1;
        int ans = -1; // suppose ans is -1 
        boolean isPresent = false ;
        while(i<=j){
            int m = (i+j)/2;
            if(A[m]==x){
                ans = m;
               isPresent = true;
                break; 
            }else if (A[m]>x){
                //left
                j= m-1;
            }else{// save and right
                ans =m;
                i =m +1;
            }
        } if (isPresent){
            System.out.println(ans);
        }else{
        System.out.println(ans + 1);
        }
    }
}
// class discussed using boolean
