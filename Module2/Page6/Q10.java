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

import java.util.*;

public class Q10 {
public static void main (String[] args) {
Scanner scn = new Scanner(System.in);
String s = scn.next();
//freq
int [] freq = new int [26];
for(int i = 0; i < s. length(); i++){
char ch = s.charAt(i);
int idx = ch - 'a';
freq[idx] = freq[idx] + 1;
}
//max
int maxIdx = 0;
for(int i = 0; i < 26; i++) {
if(freq[maxIdx] < freq[i]) {
maxIdx = i;
}
}
System.out.println((char) ('a' + maxIdx));
}
}