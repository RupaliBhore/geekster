// // HW_Valid Anagram 3

// Samantha is a Scrabble champion who always manages to find the best anagrams from her letters. One day, her friend Jake asked her how she does it so quickly. Samantha revealed her secret: a Java function that she wrote to determine if two strings are anagrams of each other.

// take two strings, s and t, and compare the frequency of each character in both strings. If the frequency of each character is the same in both strings, then they are anagrams of each other.

// Input Format

// First line contain string S.

// Second line contain string T.

// Constraints

// 1<=S.length() , T.length()<=10^5
// Output Format

// Return Yes or No

// Sample Input 0

// anagram
// nagaram
// Sample Output 0

// Yes



import java.util.*;

public class Q4 {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input strings
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        
        // Check if the two strings are anagrams
        if (areAnagrams(s, t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
    
    public static boolean areAnagrams(String s, String t) {
        // Check if the lengths are different
        if (s.length() != t.length()) {
            return false;
        }
        
        // Create frequency maps for both strings
        Map<Character, Integer> freqMapS = new HashMap<>();
        Map<Character, Integer> freqMapT = new HashMap<>();
        
        // Populate frequency map for s
        for (char c : s.toCharArray()) {
            freqMapS.put(c, freqMapS.getOrDefault(c, 0) + 1);
        }
        
        // Populate frequency map for t
        for (char c : t.toCharArray()) {
            freqMapT.put(c, freqMapT.getOrDefault(c, 0) + 1);
        }
        
        // Compare frequency maps
        return freqMapS.equals(freqMapT);
    }
}