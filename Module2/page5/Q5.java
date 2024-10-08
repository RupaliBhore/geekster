// // Four Sum

// The given array is not sorted. The given array may or may not contain duplicate elements. Then take the target as an integer input. Print all the unique quadruple whose sum is equal target.

// NOTE all quadruple should be unique, for example : [6, 7, 8, 9], [7, 6, 8, 9] are considered as same quadruple. Also if the array has repeated elements then return only unique quadruple, for eg : if array is arr = [3, 3, 5, 5, 1, 1, 2, 2], and the target = 11, then result will have only one quadruple, i.e. [1, 2, 3, 5].The result should be sorted in increasing order and also the quadruple.

// NOTE :-

// After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Click here

// Input Format

// An integer number N representing size of array

// N integer number representing elements of array

// An integer number Target

// Constraints

// 1 <= N <= 200

// -10^6 <= array[index] <= 10^6

// -10^6 <= Target <= 10^6
// Output Format

// Return the required quadruple in different lines.

// Sample Input 0

// 8
// 3 3 5 5 1 1 2 2
// 11
// Sample Output 0

// 1 2 3 5
// Explanation 0

// only 1 + 2 + 3 + 5 have sum equals to target.


import java.util.*;

public class Q5 {

  
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Step 1: Sort the array
        
        for (int i = 0; i < nums.length - 3; i++) {
            // Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            for (int j = i + 1; j < nums.length - 2; j++) {
                // Skip duplicate elements
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                
                int left = j + 1;
                int right = nums.length - 1;
                
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        
                        // Skip duplicate elements
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); // Read size of the array
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt(); // Read array elements
        }
        
        int target = scanner.nextInt(); // Read target
        
        List<List<Integer>> quadruples = fourSum(nums, target);
        
        for (List<Integer> quadruple : quadruples) {
            System.out.println(quadruple.get(0) + " " + quadruple.get(1) + " " + quadruple.get(2) + " " + quadruple.get(3));
        }
        
        scanner.close();
    }
}