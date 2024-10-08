
// Print Freq of Alphabet in String

// John is a software engineer who is passionate about programming. One day, he stumbled upon a challenging problem in an online coding platform. The problem required him to find the frequency of each alphabet in a given string and print the frequency of each alphabet present in the string.

// help John and write a program that return the frequency of each element of string using array as hashmap.

// Input Format

// Input contains a string of small char

// Constraints

// 1 <= str.length <= 10^4
// Output Format

// Return all the char with their corresponding frequences

// Sample Input 0

// abcdaccd
// Sample Output 0

// a-2
// b-1
// c-3
// d-2
// Explanation 0

// a appear 2 times in string b-1 ,c-3 and d 2 times

// Sample Input 1

// abbhim
// Sample Output 1

// a-1
// b-2
// h-1
// i-1
// m-1
// Sample Input 2

// test
// Sample Output 2

// t-2
// e-1
// s-1
// Sample Input 3

// hello
// Sample Output 3

// h-1
// e-1
// l-2
// o-1
// Sample Input 4

// addcase
// Sample Output 4

// a-2
// d-2
// c-1
// s-1
// e-1





// Discussed 
import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        // s = "aman"
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // e -> 4 //a
            int idx = ch - 'a';
            // 'e' - 'a' == 101 - 97 = 4 // a - a = 97 -97 = 0
            freq[idx] = freq[idx] + 1;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';

            if (freq[idx] != 0) {
                System.out.println(ch + "-" + freq[idx]);
                freq[idx] = 0;
            }
        }
    }
}

// // finded

// import java.io.*;
// import java.util.*;

// public class Q8 {
// public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         // Read the input string
//         String str = scanner.nextLine();
        
//         // Compute the frequency of each character
//         Map<Character, Integer> frequencyMap = computeFrequency(str);
        
//         // Print the frequencies
//         for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
//             System.out.println(entry.getKey() + "-" + entry.getValue());
//         }
        
//         scanner.close();
//     }

//     public static Map<Character, Integer> computeFrequency(String str) {
//         Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        
//         // Count frequency of each character
//         for (char c : str.toCharArray()) {
//             frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
//         }
        
//         return frequencyMap;
//     }
// }