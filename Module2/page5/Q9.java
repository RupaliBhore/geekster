// // HW_Plant Watering by Alice and Bob


// Alice and Bob want to water N plants in their garden. The plants are arranged in a row and are labeled from 0 to n - 1 from left to right where the ith plant is located at x = i.

// Each plant needs a specific amount of water. Alice and Bob have a watering can each, initially full. They water the plants in the following way:

// Alice waters the plants in order from left to right, starting from the 0th plant. Bob waters the plants in order from right to left, starting from the (n - 1)th plant. They begin watering the plants simultaneously.

// It takes the same amount of time to water each plant regardless of how much water it needs.

// Alice/Bob must water the plant if they have enough in their can to fully water it. Otherwise, they first refill their can (instantaneously) then water the plant.

// In case both Alice and Bob reach the same plant, the one with more water currently in his/her watering can should water this plant. If they have the same amount of water, then Alice should water this plant.

// Given a** 0-indexed** integer array plants of N integers, where plants[i] is the amount of water the ith plant needs, and two integers capacityA and capacityB representing the capacities of Alice's and Bob's watering cans respectively, return the number of times they have to refill to water all the plants.

// Input Format

// First line of input contains integer N represents the size of array.

// Second line of input contains N integers representing elements of an array.

// Third line of input contains integer capacityA

// Third line of input contains integer capacityB

// Constraints

// N == plants.length

// 1 <= N <= 10^5

// 1 <= plants[i] <= 10^6

// max(plants[i]) <= capacityA, capacityB <= 10^9
// Output Format

// Return the number of times they have to refill to water all the plants.

// Sample Input 0

// 4
// 2 2 3 3 
// 5 5 
// Sample Output 0

// 1
// Explanation 0

// Initially, Alice and Bob have 5 units of water each in their watering cans.
// Alice waters plant 0, Bob waters plant 3.
// Alice and Bob now have 3 units and 2 units of water respectively.
// Alice has enough water for plant 1, so she waters it. Bob does not have enough water for plant 2, so he refills his can then waters it. So, the total number of times they have to refill to water all the plants is 0 + 0 + 1 + 0 = 1.


import java.util.*;

public class Q9 {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int N = scanner.nextInt();
        int[] plants = new int[N];

        // Read the elements of the array
        for (int i = 0; i < N; i++) {
            plants[i] = scanner.nextInt();
        }

        // Read the capacities of Alice's and Bob's watering cans
        int capacityA = scanner.nextInt();
        int capacityB = scanner.nextInt();

        // Output the number of refills needed
        System.out.println(minRefills(plants, capacityA, capacityB));

        scanner.close();
    }

    public static int minRefills(int[] plants, int capacityA, int capacityB) {
        int left = 0;
        int right = plants.length - 1;
        int aliceWater = capacityA;
        int bobWater = capacityB;
        int refills = 0;

        while (left <= right) {
            // Alice waters the left plant
            if (aliceWater < plants[left]) {
                refills++;
                aliceWater = capacityA;  // Refill Alice's watering can
            }
            aliceWater -= plants[left];
            left++;

            // Bob waters the right plant
            if (left <= right) {  // Check to ensure Bob has plants to water
                if (bobWater < plants[right]) {
                    refills++;
                    bobWater = capacityB;  // Refill Bob's watering can
                }
                bobWater -= plants[right];
                right--;
            }
        }

        return refills;
    }
}