// print odd from n to 1

import java.util.*;

public class Q4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scanner = new Scanner(System.in);
        
        // Read integer input N
        int n = scanner.nextInt();
        
        // Print odd numbers from n to 1
        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }}



