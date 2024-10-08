// //HW_Third Maximum

// Meet Tom, a data analyst who was tasked with analyzing a dataset that contained information about the sales of a retail company. Tom needed to find the third highest sales amount from the dataset.

// Help Tom to write a program that take an array of sales amount as input and return the third highest sales amount in the array and If the third highest amount does not exist than return the highest amount.

// NOTE :- After answering the question, attempt the related question in the linked resource to improve your understanding of the question. Click here

// Input Format

// First line of input contains integer N representing the size of array.

// Second line of input contains N integers representing the elements of array.

// Constraints

// 1 <= nums.length <= 10^4

// -2^31 <= nums[i] <= 2^31 - 1
// Output Format

// Return the third maximum element.

// Sample Input 0

// 3
// 3 2 1
// Sample Output 0

// 1
// Explanation 0

// The first distinct maximum is 3.

// The second distinct maximum is 2.

// The third distinct maximum is 1.

// Sample Input 1

// 2
// 1 2
// Sample Output 1

// 2
// Explanation 1

// The first distinct maximum is 2.

// The second distinct maximum is 1.

// The third distinct maximum does not exist, so the maximum (2) is returned instead.


import java.util.*;

public class Q3 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int N = sc.nextInt();
        Set<Integer> uniqueSales = new TreeSet<>(Collections.reverseOrder());

        // Read the elements of the array
        for (int i = 0; i < N; i++) {
            uniqueSales.add(sc.nextInt());
        }

        // Convert Set to a List
        List<Integer> sortedSales = new ArrayList<>(uniqueSales);

        // Check if there are at least three unique sales amounts
        if (sortedSales.size() >= 3) {
            System.out.println(sortedSales.get(2)); // The third highest
        } else {
            System.out.println(sortedSales.get(0)); // The highest
        }
    }
}