// // HW_Team Formation 7
// You are given a positive integer array skill of even length N where skill[i] denotes the skill of the ith player. Divide the players into n/2 teams of size 2 such that the total skill of each team is equal.

// The chemistry of a team is equal to the product of the skills of the players on that team.

// Return the sum of the chemistry of all the teams, or return -1 if there is no way to divide the players into teams such that the total skill of each team is equal.

// Input Format

// The first line contains N, i.e. the size of the array.

// The second line contains N space-separated positive integers skills[i] denoting elements of the array.

// Constraints

// 2 <= N <= 10^5

// N is even.

// 1 <= skill[i] <= 1000
// Output Format

// Return the sum of the chemistry of all the teams, or return -1 if there is no way to divide the players into teams such that the total skill of each team is equal.

// Sample Input 0

// 6
// 3 2 5 1 3 4
// Sample Output 0

// 22
// Explanation 0

// Divide the players into the following teams: (1, 5), (2, 4), (3, 3), where each team has a total skill of 6. The sum of the chemistry of all the teams is: 1 * 5 + 2 * 4 + 3 * 3 = 5 + 8 + 9 = 22.

// Sample Input 1

// 2
// 3 4 
// Sample Output 1

// 12
// Explanation 1

// The two players form a team with a total skill of 7. The chemistry of the team is 3 * 4 = 12.



import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of players
        int N = scanner.nextInt();
        int[] skill = new int[N];
        
        // Read the skill levels of players
        for (int i = 0; i < N; i++) {
            skill[i] = scanner.nextInt();
        }

        // Output the result
        System.out.println(calculateChemistrySum(skill));

        scanner.close();
    }

    public static int calculateChemistrySum(int[] skill) {
        int N = skill.length;
        Arrays.sort(skill); // Sort the array to use two-pointer technique
        
        // Calculate the total skill sum
        int totalSkillSum = 0;
        for (int num : skill) {
            totalSkillSum += num;
        }
        
        // Check if the total sum is divisible by the number of teams
        if (totalSkillSum % (N / 2) != 0) {
            return -1; // It's not possible to form teams with equal total skill
        }

        int targetSum = totalSkillSum / (N / 2);
        int left = 0;
        int right = N - 1;
        int chemistrySum = 0;

        while (left < right) {
            int currentSum = skill[left] + skill[right];
            if (currentSum == targetSum) {
                chemistrySum += skill[left] * skill[right];
                left++;
                right--;
            } else {
                return -1; // Teams can't be formed with equal total skill
            }
        }

        return chemistrySum;
    }
}