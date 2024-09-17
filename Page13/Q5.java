// // Hw_print z-a
// Write a Program using while loop for print all the characters from z-a.

// Input Format

// No Input

// Constraints

// NA
// Output Format

// All characters from z-a.

// Sample Output 0

// z y x w v u t s r q p o n m l k j i h g f e d c b a

public class Q5 {

    public static void main(String[] args) {  
        char ch = 'z';
        
        // Using while loop to print characters from 'z' to 'a'
        while (ch >= 'a') {
            System.out.print(ch + " ");
            ch--;
        }
    }
}