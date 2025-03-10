// // Maximum Freq Character

// Given a string consisting of only small case alphabets. Find the element with the maximum occurrence. The solution should have O(n) time complexity.

// Input Format

// Input contains a string.

// Constraints

// 1 <= str.length <= 10^4
// Output Format

// Return the most frequent char.

// Sample Input 0

// abcdaccd
// Sample Output 0

// c

import java.util.Scanner;

public class Solution {

    public static char maxOccurrence(String str) {
        // Array to store frequency of each character
        int[] freq = new int[26]; // Since only lowercase alphabets a-z
        
        // Iterate through the string and update the frequency array
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++; // 'a' is at index 0, 'b' at index 1, etc.
        }
        
        // Find the character with the maximum frequency
        int maxFreq = 0;
        char maxChar = 'a';
        
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxChar = (char) (i + 'a'); // Convert index back to character
            }
        }
        
        return maxChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        // Call the function to get the most frequent character
        char result = maxOccurrence(str);
        System.out.println(result);
    }
}



// import java.util.HashMap;
// import java.util.Scanner;

// public class Solution {       //with hashmap

//     public static char maxOccurrence(String str) {
//         // HashMap to store frequency of each character
//         HashMap<Character, Integer> freqMap = new HashMap<>();
        
//         // Iterate through the string and update the frequency map
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             // Update the frequency in the map
//             freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
//         }
        
//         // Find the character with the maximum frequency
//         char maxChar = 'a';
//         int maxFreq = 0;
        
//         for (char ch : freqMap.keySet()) {
//             int frequency = freqMap.get(ch);
//             if (frequency > maxFreq) {
//                 maxFreq = frequency;
//                 maxChar = ch;
//             }
//         }
        
//         return maxChar;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
        
//         // Call the function to get the most frequent character
//         char result = maxOccurrence(str);
//         System.out.println(result);
//     }
// }


//Finded
// import java.util.*;

// public class Q10 {

//    public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         // Read the input string
//         String str = scanner.nextLine();
        
//         // Find the most frequent character
//         char result = findMostFrequentChar(str);
//         System.out.println(result);
        
//         scanner.close();
//     }

//     public static char findMostFrequentChar(String str) {
//         int[] frequency = new int[26]; // Array to store frequency of each character ('a' to 'z')
        
//         // Count the frequency of each character
//         for (char c : str.toCharArray()) {
//             frequency[c - 'a']++;
//         }
        
//         // Find the character with the maximum frequency
//         int maxFrequency = -1;
//         char mostFrequentChar = ' ';
//         for (int i = 0; i < frequency.length; i++) {
//             if (frequency[i] > maxFrequency) {
//                 maxFrequency = frequency[i];
//                 mostFrequentChar = (char) (i + 'a');
//             }
//         }
        
//         return mostFrequentChar;
//     }
// }






// Discussed One

// import java.util.*;

// public class Q10 {
// public static void main (String[] args) {
// Scanner scn = new Scanner(System.in);
// String s = scn.next();
// //freq
// int [] freq = new int [26];
// for(int i = 0; i < s. length(); i++){
// char ch = s.charAt(i);
// int idx = ch - 'a';
// freq[idx] = freq[idx] + 1;
// }
// //max
// int maxIdx = 0;
// for(int i = 0; i < 26; i++) {
// if(freq[maxIdx] < freq[i]) {
// maxIdx = i;
// }
// }
// System.out.println((char) ('a' + maxIdx));
// }
// }
