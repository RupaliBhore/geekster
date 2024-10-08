// ArrayList with if-else



// First Declare an ArrayList arr.
// Then take  as an Integer input.
// Format for next T Lines : (case , x(optional))

// case 1: Print the size of the ArrayList in a separate line.
// case 2: Print and Remove element from the last index of the ArrayList.
// case 3: Print x and Add x in last index of the ArrayList.
// case 4: Print and Remove an element from the starting (index = 0) of the ArraList.
// case 5: Print x and Add x at beginning (index = 0) of the ArrayList.
// case 6: Print all the elements from left to right that are there inside the ArrayList.
// Note : In case 2,4,6  when arr is empty the move is invalid, so print "invalid-move all lowercase".

// Input Format

// Single Integer T.
// For next T lines we can have single or pair of Integers(case , x(optional)).
// Note : we have x in cases where it is needed and otherwise not present.
// Constraints

// 0 <= T <= 1000
// 1 <= case <= 6
// 0 <= x <= 1000
// Output Format

// Print the information that is explained in the statement according to case.

// Sample Input 0

// 8
// 2
// 6
// 3 2
// 5 1
// 6
// 1
// 3 3
// 2
// Sample Output 0

// invalid-move
// invalid-move
// 2
// 1
// 1 2
// 2
// 3
// 3
// Explanation 0

// First two moves in invalid becuase  is empty.
//     arr= [2], x = 2.
//  arr= [1,2], x = 1.
//     arr= [1,2]
//     arr= [1,2], size = 2.
//     arr= [1,2,3], x = 3.
//     arr= [1,2], arr.last_element = 3.



import java.util.*;

public class Q10 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Declare the ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
        
        // Input the number of test cases
        int T = scn.nextInt();
        
        // Process each case
        for (int t = 0; t < T; t++) {
            int operation = scn.nextInt();
            
            switch (operation) {
                case 1:
                    // Print the size of the ArrayList
                    System.out.println(arr.size());
                    break;
                
                case 2:
                    // Print and remove the last element
                    if (arr.isEmpty()) {
                        System.out.println("invalid-move");
                    } else {
                        System.out.println(arr.remove(arr.size() - 1));
                    }
                    break;
                
                case 3:
                    // Print x and add x at the last index
                    int x1 = scn.nextInt();
                    System.out.println(x1);
                    arr.add(x1);
                    break;
                
                case 4:
                    // Print and remove the element at index 0
                    if (arr.isEmpty()) {
                        System.out.println("invalid-move");
                    } else {
                        System.out.println(arr.remove(0));
                    }
                    break;
                
                case 5:
                    // Print x and add x at index 0
                    int x2 = scn.nextInt();
                    System.out.println(x2);
                    arr.add(0, x2);
                    break;
                
                case 6:
                    // Print all elements in the ArrayList from left to right
                    if (arr.isEmpty()) {
                        System.out.println("invalid-move");
                    } else {
                        for (int num : arr) {
                            System.out.print(num + " ");
                        }
                        System.out.println();  // Newline after printing the elements
                    }
                    break;
                
                default:
                    break;
            }
        }
        
        scn.close();
    }
}