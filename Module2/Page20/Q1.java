// // HW_Sort Characters By Frequency 3

// Given a string s, sort it in decreasing order based on the frequency of the characters.If frequency of two characters are same sort them in ascending order. The frequency of a character is the number of times it appears in the string.

// Return the sorted string. If there are multiple answers, return any of them.

// Input Format

// First line contains a string s.

// Constraints

// 1 <= s.length <= 5 * 10^5
// s consists of uppercase and lowercase English letters and digits.
// Output Format

// Returns a string as an output.

// Sample Input 0

// tree
// Sample Output 0

// eert
// Explanation 0

// 'e' appears twice while 'r' and 't' both appear once. So 'e' must appear before both 'r' and 't'.

// Sample Input 1

// magjjkkwq
// Sample Output 1

// jjkkagmqw


import java.util.*;

public class Q1 {

     public static String frequencySort(String s) {
        // Step 1: Create a frequency map to count the occurrence of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Create a list from the map's key set (characters) and sort it
        List<Character> charList = new ArrayList<>(freqMap.keySet());
        Collections.sort(charList, (a, b) -> {
            // Sort by frequency in decreasing order first
            int freqComparison = freqMap.get(b) - freqMap.get(a);
            // If frequencies are the same, sort by the character in ascending order
            if (freqComparison == 0) {
                return a - b;
            }
            return freqComparison;
        });

        // Step 3: Build the result string based on the sorted characters and their frequencies
        StringBuilder result = new StringBuilder();
        for (char c : charList) {
            int freq = freqMap.get(c);
            for (int i = 0; i < freq; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();  // Input the string

        System.out.println(frequencySort(s));  // Output the sorted string
    }
}

// // finded
// Time complexity for the code is O(n log n) because we need to iterate through the string (O(n)) and then sort the characters based on their frequency (O(n log n)).
// Space complexity is O(n) due to the frequency map and the result string, which store data proportional to the size of the input string.