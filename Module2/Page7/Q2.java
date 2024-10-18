// // HW_Digit with highest frequecy
 
// Given a number as an integer input. Check which digit occurs the maximum number of times. Print that digit.

// Input Format

// Input contains an integer input

// Constraints

// 1 <= integer <= 10^9

// Output Format

// print diigt with highest freq

// Sample Input 0

// 11234
// Sample Output 0

// 1


///1  with remove last digit and count freq of that digit   //mycode

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input integer
        long num = sc.nextLong();
        
        // Array to store frequency of each digit (0-9)
        int[] frequency = new int[10];
        
        // Extract digits and count their frequency
        while (num > 0) {
            int digit = (int)(num % 10);  // Get the last digit
            frequency[digit]++;           // Increment frequency of that digit
            num /= 10;                    // Remove the last digit
        }
        
        // Find the digit with the highest frequency
        int maxFreq = 0;
        int mostFrequentDigit = 0;
        
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > maxFreq) {
                maxFreq = frequency[i];
                mostFrequentDigit = i;
            }
        }
        
        // Print the digit with the highest frequency
        System.out.println(mostFrequentDigit);
    }
}






import java.util.*;

public class Q2 {

       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the integer input
        int number = scanner.nextInt();

        // Find and print the digit with the highest frequency
        char mostFrequentDigit = findMostFrequentDigit(number);
        System.out.println(mostFrequentDigit);

        scanner.close();
    }

    public static char findMostFrequentDigit(int number) {
        // Convert number to string to process each digit
        String numStr = Integer.toString(number);

        // Frequency array to store count of each digit (0-9)
        int[] frequency = new int[10];

        // Count the frequency of each digit
        for (char c : numStr.toCharArray()) {
            frequency[c - '0']++;
        }

        // Find the digit with the maximum frequency
        int maxFrequency = 0;
        char mostFrequentDigit = '0';

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostFrequentDigit = (char) (i + '0');
            }
        }

        return mostFrequentDigit;
    }
}


///1  with remove last digit and count freq of that digit

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input integer
        long num = sc.nextLong();
        
        // Array to store frequency of each digit (0-9)
        int[] frequency = new int[10];
        
        // Extract digits and count their frequency
        while (num > 0) {
            int digit = (int)(num % 10);  // Get the last digit
            frequency[digit]++;           // Increment frequency of that digit
            num /= 10;                    // Remove the last digit
        }
        
        // Find the digit with the highest frequency
        int maxFreq = 0;
        int mostFrequentDigit = 0;
        
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > maxFreq) {
                maxFreq = frequency[i];
                mostFrequentDigit = i;
            }
        }
        
        // Print the digit with the highest frequency
        System.out.println(mostFrequentDigit);
    }
}




//number la array madhe convert karaun
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input integer
        long num = sc.nextLong();
        
        // Convert number to string, then to character array
        String numStr = Long.toString(num);
        char[] digits = numStr.toCharArray();
        
        // Array to store frequency of each digit (0-9)
        int[] frequency = new int[10];
        
        // Traverse through the digit array and count frequency of each digit
        for (char digit : digits) {
            frequency[digit - '0']++; // Convert char digit to int and increment its frequency
        }
        
        // Find the digit with the highest frequency
        int maxFreq = 0;
        int mostFrequentDigit = 0;
        
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > maxFreq) {
                maxFreq = frequency[i];
                mostFrequentDigit = i;
            }
        }
        
        // Print the digit with the highest frequency
        System.out.println(mostFrequentDigit);
    }
}

