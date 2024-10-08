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