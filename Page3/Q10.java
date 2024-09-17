// // Print the oldest among three
// There are three friends A , B , C. You will be given the ages of these three friends as an integer input, you have to print the same of the oldest friend among them.

// Input Format

// For each test case, you will be given

// Age of A in the first line as an integer input

// Age of B in the second line as an integer input

// Age of C in the third line as an integer input

// Constraints

// 0<=age<=2^31-1
// Output Format

// You have print A or B or C accordingly.

// Sample Input 0

// 10
// 20
// 30
// Sample Output 0

// C
// Explanation 0

// Since C is the oldest among the three friends, so we print C.

// Sample Input 1

// 20
// 30
// 5
// Sample Output 1

// B
// Explanation 1

// Since B is the oldest among the three, so we print B.
import java.util.*;

public class Q10 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           Scanner scn = new Scanner(System.in);

        // Read ages of friends A, B, C
        int ageA = scn.nextInt();
        int ageB = scn.nextInt();
        int ageC = scn.nextInt();

        // Determine the oldest friend
        int oldestAge = ageA;
        String oldestFriend = "A"; // Assume A is the oldest initially

        if (ageB > oldestAge) {
            oldestAge = ageB;
            oldestFriend = "B";
        }

        if (ageC > oldestAge) {
            oldestAge = ageC;
            oldestFriend = "C";
        }

        // Print the oldest friend
        System.out.println(oldestFriend);
    }
}



