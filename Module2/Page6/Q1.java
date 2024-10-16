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

  // Check if the total sum is divisible by the number of teams
        if (totalSkillSum % (N / 2) != 0) {
            return -1; // It's not possible to form teams with equal total skill
        }
Purpose: of this if condition
This condition checks if the total sum of skill levels (totalSkillSum) can be evenly divided among the teams, such that each team has the same total skill.
Explanation:
totalSkillSum % (N / 2) != 0:

totalSkillSum is the sum of the skill levels of all players.
N is the number of players.
N / 2 represents the number of pairs (or teams) you need to form, assuming that players are paired into two teams. So, the total skill sum must be divisible by the number of pairs (teams) in order to equally distribute the skill between them.
The expression totalSkillSum % (N / 2) checks whether the total skill sum can be evenly divided by the number of pairs.
If the result is not 0 (i.e., totalSkillSum % (N / 2) != 0):

It means that the total skill sum cannot be evenly split into teams with equal skill levels.
If this condition is true, the function returns -1, indicating that it's impossible to form teams with equal total skill.
Example: Let's say you have N = 6 players with a totalSkillSum = 18. The number of pairs (teams) would be N / 2 = 3. Now, check if 18 % 3 == 0. Since this is true, we can potentially form teams with equal skill levels.

If, for example, totalSkillSum was something like 19, 19 % 3 != 0 would be true, so it would return -1 because 19 can't be evenly divided among 3 pairs.

Conclusion:
This check ensures that it's mathematically possible to form teams where the sum of skill levels in each team is equal. If it’s not possible, the function returns -1 immediately without wasting time on further calculations.









// The Java code provided aims to solve a problem where we need to form two teams of equal total skill from a list of player skill levels. Here’s a breakdown of how the code works:

// Input Reading: The code starts by reading the number of players (N) and their respective skill levels into an array skill.

// Sorting: The skill array is sorted in ascending order. Sorting helps in efficiently applying the two-pointer technique to find pairs of skills that sum up to a target value.

// Total Skill Sum Calculation: The total sum of all skill levels (totalSkillSum) is calculated.

// Divisibility Check: It checks if totalSkillSum can be evenly divided by N/2. This ensures that it's possible to form two teams with equal total skill.

// Target Sum Calculation: If divisible, targetSum is calculated as totalSkillSum / (N / 2), which represents the desired sum for each team.

// Two-pointer Technique: Two pointers (left starting at the beginning and right starting at the end) are used to find pairs of skill levels that sum up to targetSum. If found, their product is added to chemistrySum.

// Result: If all pairs are found successfully and form teams with equal total skill, chemistrySum is returned. Otherwise, -1 is returned indicating that it's not possible to form such teams.

// Here’s a quick overview of how the method calculateChemistrySum works:

// It uses sorting and the two-pointer technique to efficiently find pairs of skill levels that sum up to targetSum.
// If a valid pair is found (currentSum == targetSum), their product is added to chemistrySum.
// If no valid pairs are found or the total sum cannot be evenly divided into two equal parts, it returns -1.
// The overall complexity of the algorithm is dominated by the sorting step, which is O(N log N), followed by the linear scan with two pointers, which is O(N). This makes the solution efficient and suitable for reasonably large values of N.

// The code ensures that all edge cases, such as non-divisible total sums or insufficient pairs to form teams, are handled by returning -1 appropriately.






