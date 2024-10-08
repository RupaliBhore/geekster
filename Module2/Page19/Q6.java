// HW_Relative Ranks
// You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.

// The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:

// The 1st place athlete's rank is "Gold Medal".
// The 2nd place athlete's rank is "Silver Medal".
// The 3rd place athlete's rank is "Bronze Medal".
// For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
// Return an array answer of size n where answer[i] is the rank of the ith athlete.

// Input Format

// First line contains an input n.

// Next line contains an integer array score[i] of size n.

// Constraints

// n == score.length
// 1 <= n <= 104
// 0 <= score[i] <= 106
// All the values in score are unique.
// Output Format

// Print an array of strings answer of size n where answer[i] is the rank of the ith athlete.

// Sample Input 0

// 5
// 5 4 3 2 1
// Sample Output 0

// Gold Medal Silver Medal Bronze Medal 4 5 
// Explanation 0

// The placements are [1st, 2nd, 3rd, 4th, 5th].


import java.util.*;

public class Q6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
   PriorityQueue<int[]>pq= new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<n;i++){
            pq.add(new int[]{arr[i],i});
        }
        int[] res= new int[n];
        int rank=1;
        while(pq.size()>0){
            int[] root=pq.remove();
            int idx=root[1];
            res[idx]=rank;
            rank++;
        }
        for(int i=0;i<n;i++){
            if(res[i]==1){
                System.out.print("Gold Medal"+" ");
            }else if(res[i]==2){
                 System.out.print("Silver Medal"+" ");
            }else if(res[i]==3){
                 System.out.print("Bronze Medal"+" ");
            }else{
                 System.out.print(res[i]+" ");
            }
        }
    }
}