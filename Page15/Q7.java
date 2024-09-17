// HW_Print V Pattern
import java.util.*;

public class Q7 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        // Reading input
        int m = scanner.nextInt();

        // Close the scanner as we no longer need it
        scanner.close();

        // Printing the pattern using nested for and while loops
        for (int i = 0; i < m / 2 + 1; i++) {
            int j = 0;
            while (j < m) {
                if (j == i || j == m - 1 - i) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
                j++;
            }
            System.out.println();
        }
    }
}
