// minimum digits

// Given an array of digits (values are from 0 to 9), find the minimum possible sum of two numbers formed from digits of the array. All digits of the given array must be used to form the two numbers.

// Any combination of digits may be used to form the two numbers to be summed. Leading zeroes are permitted.

// If forming two numbers is impossible (i.e. when n==0) then the "sum" is the value of the only number that can be formed.

// NOTE :- After answering the question, attempt the related question in the linked resource to improve your understanding of this question . Click here

// Input Format

// Single Integer N .
// N integers seperated with single space.
// Constraints

// 1 ≤ N ≤ 35
// 0 ≤ A[i] ≤ 9
// Output Format

// Single Integer Sum.

// Sample Input 0

// 6
// 6 8 4 5 2 3
// Sample Output 0

// 604
// Explanation 0

// The minimum sum is formed by numbers 358 and 246



import java.util.*;

public class Q3 {

    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < n; i++){
            
            pq.add(scn.nextInt());
            
        }
        
        String a = "";
        
        String b = "";
        
        while(pq.size() > 0){  
            
            a += pq.remove();  
            
            if(pq.size() > 0){   
                
                b += pq.remove(); 
                
            }
        }
        
        long v1 = Long.parseLong(a); 
        
        long v2 = Long.parseLong(b); 
        
        System.out.println(v1 + v2);
        
    }
}
