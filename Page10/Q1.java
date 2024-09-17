// // HW_Print series AAA,bb,CCC,dd,EEE,ff till 26 lines

// Write a program to print AAA,bb,CCC,dd,EEE,ff,....uptil 26 lines ,where each String printed in a seperate line.

// Input Format

// No input

// Constraints

// NA

// Output Format

// Print each String in a seperate line.

// Sample Output 0

// AAA
// bb
// CCC
// dd
// EEE
// ff
// GGG
// hh
// III
// jj
// KKK
// ll
// MMM
// nn
// OOO
// pp
// QQQ
// rr
// SSS
// tt
// UUU
// vv
// WWW
// xx
// YYY
// zz

public class Q1 {

    public static void main(String[] args) {
   char uppercase = 'A';
        char lowercase = 'b';
        
        // Loop for 26 lines
        for (int i = 0; i < 26; i++) {
            if (i % 2 == 0) {
                // Print uppercase letter repeated 3 times
                for (int j = 0; j < 3; j++) {
                    System.out.print(uppercase);
                }
                // Move to the next uppercase letter
                uppercase += 2;
            } else {
                // Print lowercase letter repeated 2 times
                for (int j = 0; j < 2; j++) {
                    System.out.print(lowercase);
                }
                // Move to the next lowercase letter
                lowercase += 2;
            }
            // Print a newline to move to the next line
            System.out.println();
        }
    }
}