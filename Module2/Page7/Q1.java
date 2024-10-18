// // Good String Checker

// Given a string str, return true if str is a good string, or false otherwise.

// A string str is good if all the characters that appear in str have the same number of occurrences (i.e., the same frequency).

// Input Format

// String as an input.

// Constraints

// 1 <= str.length <= 10^4

// str consists of lowercase English letters.
// Output Format

// Return true and false.

// Sample Input 0

// abacbc
// Sample Output 0

// true
// Explanation 0

// The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.

                           //my code
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class GoodStringChecker {
    
    public static boolean isGoodString(String s) {
        // Map to store the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Count frequencies of each character
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Set to store unique frequencies
        Set<Integer> frequencySet = new HashSet<>(frequencyMap.values());
        
        // If all characters have the same frequency, there should be only one unique frequency
        return frequencySet.size() == 1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        String s = scanner.nextLine();
        
        // Check if the string is good and print the result
        System.out.println(isGoodString(s));
        
        scanner.close();
    }
}


isGoodString takes a string s as input and checks if all characters in the string have the same frequency.
It uses a HashMap (frequencyMap) to count occurrences of each character.
After counting, it extracts these frequencies into a HashSet (frequencySet) to get unique frequencies.
If frequencySet contains only one element, it means all characters in s have the same frequency, so it returns true; otherwise, it returns false.







// Finded
// import java.util.*;

// public class Q1 {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         // Read the input string
//         String str = scanner.nextLine();
        
//         // Check if the string is good
//         boolean result = isGoodString(str);
//         System.out.println(result);
        
//         scanner.close();
//     }

//     public static boolean isGoodString(String str) {
//         // Frequency map to store occurrences of each character
//         Map<Character, Integer> frequencyMap = new HashMap<>();
        
//         // Populate the frequency map
//         for (char c : str.toCharArray()) {
//             frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
//         }
        
//         // Get the frequency of the first character
//         int firstFrequency = frequencyMap.values().iterator().next();
        
//         // Check if all frequencies are the same
//         for (int freq : frequencyMap.values()) {
//             if (freq != firstFrequency) {
//                 return false;
//             }
//         }
        
//         return true;
//     }
// }


//Discussed One
import java.util.*;

public class Q1 {

    public static boolean isGoodStr(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';
            freq[idx] = freq[idx] + 1;
        }
        int val = freq[s.charAt(0) - 'a'];
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0 && freq[i] != val) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        boolean ans = isGoodStr(s);
        System.out.println(ans);
    }
}
// Discussed One
