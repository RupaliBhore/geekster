// Longest Substring Without Repeating Characters 6



// You are given a string, print the length of Longest Substring Without Repeating Characters.

// Input Format

// A String
// Constraints

// 0 <= s.length <= 5 * 104
// s consists of ASCII values
// Output Format

// An Integer Value
// Sample Input 0

// abcabcbb
// Sample Output 0

// 3
// Explanation 0

// The answer is "abc", with the length of 3.

// Sample Input 1

// quukeu
// Sample Output 1

// 3
// Explanation 1

// The answer is "uke", with the length of 3.

// Notice that the answer must be a substring, "quke" is a subsequence and not a substring.



import java.util .*;


    public class Q9 {
        public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        int i = 0;
        int j = 0;
        int ans = 0;
        HashSet<Character> hs = new HashSet<>();
        while(j < s. length()){
        if(hs.contains(s.charAt(j))){ //release
        hs.remove(s.charAt(i));
        i++;
        }else{
        //acquire
        hs.add(s.charAt(j));
        j++;
        }
        ans = Math.max(ans, hs.size());
        }
        System.out.println(ans);
        }
            }
//class discussed