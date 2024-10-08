// // Phone Directory By Name



//You are required to create a Phone Directory consisting of Name and corresponding Phone Number.

// Take an integer N as input and Continue the process untill Case 4 is not achieved.

// If N==1, take Name and Phone Number as input from user and add it to the Phone Directory.
// If N==2, take a Name as input from the user and print corresponding Phone Number, if the Name is not found print -1.
// If N==3, take a Name as input from the user and delete it from the Phone Directory.
// If N==4, Close the Directory(Exit the program).
// Note: Take Phone Number as String input.

// Input Format

// Integer N.
// String Name and Phone Number.
// Constraints

// 1<=N<=4
// 1<=word.length()<=10^3
// Phone_Number.length()==10
// Output Format

// As described in Problem Statement
// Sample Input 0

// 1
// Geekster
// 9876543210
// 1
// Geeku
// 0123456789
// 2
// Geeku
// 2
// Geekster
// 3
// Geeku
// 2
// Geeku
// 2
// Geekster
// 4
// Sample Output 0

// 0123456789
// 9876543210
// -1
// 9876543210
// Submissions: 27
// Max Score: 10
// Difficulty: Medium
// Rate This Challenge:

    

import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        
        
        HashMap< String, String> phoneDirectory = new HashMap<>();
        
        while(true){
            
            int n = cin.nextInt();
            if(n == 1){
                String name = cin.next();
                String phoneNo = cin.next();
                phoneDirectory.put(name, phoneNo);
            }else if( n == 2){
                String name = cin.next();
                if(phoneDirectory.containsKey(name)){
                   System.out.println(phoneDirectory.get(name)); 
                }else {
                    System.out.println(-1);
                }
            }else if(n==3){
                String name = cin.next();
                phoneDirectory.remove(name);
            }else if(n==4){
                break;
            }else{
                System.out.println("Invalid input");
            }
        }
    }
}
//Finded