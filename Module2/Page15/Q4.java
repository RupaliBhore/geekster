// Asteroid Collision
// We are given an array asteroids of integers representing asteroids in a row.

// For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

// Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

// Input Format

// First line contains an integer n representing the size of the array.

// Next n lines contains elements of the array.

// Constraints

// 2 <= asteroids.length <= 104

// -1000 <= asteroids[i] <= 1000

// asteroids[i] != 0

// Output Format

// Print the answer array seperated by single space.

// Sample Input 0

// 3
// 5
// 10
// -5
// Sample Output 0

// 5 10
// Explanation 0

// The 10 and -5 collide resulting in 10. The 5 and 10 never collide.

// Sample Input 1

// 3
// 10
// 2
// -5
// Sample Output 1

// 10
// Explanation 1

// The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.




import java.util.*;

public class Q4{

    // Function to handle the asteroid collision
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        // Traverse through each asteroid
        for (int asteroid : asteroids) {
            boolean exploded = false;
            
            // Process potential collisions if current asteroid is moving left
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                int top = stack.peek();
                
                // Check if the current asteroid collides with the one on the stack
                if (Math.abs(asteroid) > top) {
                    stack.pop();  // Right-moving asteroid explodes
                } else if (Math.abs(asteroid) == top) {
                    stack.pop();  // Both asteroids explode
                    exploded = true;
                    break;
                } else {
                    exploded = true;  // Left-moving asteroid explodes
                    break;
                }
            }
            
            // If the asteroid did not explode, push it onto the stack
            if (!exploded) {
                stack.push(asteroid);
            }
        }
        
        // Convert stack to array for the final result
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the size of the array
        int n = sc.nextInt();
        
        // Input the asteroids array
        int[] asteroids = new int[n];
        for (int i = 0; i < n; i++) {
            asteroids[i] = sc.nextInt();
        }
        
        // Get the result after all collisions
        int[] result = asteroidCollision(asteroids);
        
        // Print the resulting asteroids after collisions
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i == result.length - 1 ? "" : " "));
        }
        
        sc.close();
    }
}

// finded
// Time Complexity: O(n), where n is the number of asteroids. Each asteroid is pushed and popped from the stack at most once.
// Space Complexity: O(n) for the stack that stores the surviving asteroids.