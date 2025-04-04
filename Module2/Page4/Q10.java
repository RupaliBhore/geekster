// // HW_De-Duplication    //on leetcode remove dupicate from sorted array
// Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.

// Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

// Return k after placing the final result in the first k slots of nums.

// Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

// NOTE :- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Click here

// Input Format

// The first line contains N, i.e. the size of the array.

// The second line contains N space-separated positive integers nums[i] denoting elements of the array.

// Constraints

// 1 <= nums.length <= 3 * 10^4

// -10^4 <= nums[i] <= 10^4

// nums is sorted in non-decreasing order
// Output Format

// Return the desired answer.

// Sample Input 0

// 6
// 1 1 1 2 2 3
// Sample Output 0

// 5
// Explanation 0

// Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively. It does not matter what you leave beyond the returned k (hence they are underscores).

// Sample Input 1

// 9
// 0 0 1 1 1 1 2 3 3
// Sample Output 1

// 7
// Explanation 1

// Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively. It does not matter what you leave beyond the returned k (hence they are underscores).
import java.util.*;
public class Solution {
    
    //dilela aaray sorted asel ani tyamdhun asel elemet gyache ki te 2 vela ale pahijt 1 kiva 2 vela 
    //jastit jast elemet 2 vela ala pahije
//We will use two pointers: one to iterate over the array (i) and one to track where to place the next valid element ////index.
//array sorted ahe tr pahile 2 elemt ahe tase gheu ani arrray 2 indx pausn start karu cheack karayala

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        
        if (n <= 2) {
            return n; // No need to process if array length is 2 or less
        }
                                                                                   //0 1 2 3 4 5
                                                                                  ///1 1 1 2 2 3

        int index = 2; // Start placing elements from the third position             
        for (int i = 2; i < n; i++) {                            //2<6 //3<6 //4<6 //5<6 6<6
            // Place element at index if it's different from the one at index-2
            if (nums[i] != nums[index - 2]) {                   //1!=1 f i++3 //2!=1(3-2) t  //2!=1(2-2) //3!=1(3-2)
                nums[index] = nums[i];                        //2 //2 //3
                index++;             //3 //4 //5
            }
            //i++4 //5 //6
        }
        
        return index; // The value of index is the number of valid elements (k)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = removeDuplicates(nums);
        System.out.println(k);

        // Print the first k elements, which are the result
        // for (int i = 0; i < k; i++) {
        //     System.out.print(nums[i] + " ");
        // }
    }
}




import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        int n = scanner.nextInt();
        
        // Input the array elements
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        // Call the function and get the result
        int k = removeDuplicates(nums);
        
        // Print the result length
        System.out.println(k);
        
        // Print the modified array up to k elements
      //  for (int i = 0; i < k; i++) {
            // System.out.print(nums[i] + " ");
        // }
    }
    
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        
        int slow = 2;
        
        for (int fast = 2; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow - 2]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        
        return slow;
    }
}
