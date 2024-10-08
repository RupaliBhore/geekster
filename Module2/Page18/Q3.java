// Print Binary
// Given a number N. The task is to generate and print all binary numbers with decimal values from 1 to N. (Note : Use the queue for implementation.)

// NOTE :- After answering the question, attempt the related question in the linked resource to improve your understanding of this question .Click here

// Input Format

// Single Integer N.

// Constraints

// 1 <= N <= 1000

// Output Format

// Binary representaion of 1 to N seperated by single spaces.

// Sample Input 0

// 4
// Sample Output 0

// 1 10 11 100
// Explanation 0

// 1(Decimal) => 1(Binary)
// 2(Decimal) => 10(Binary)
// 3(Decimal) => 11(Binary)
// 4(Decimal) => 100(Binary)


import java.util .*;
    public class Q3 {
        public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Queue<String> qu = new LinkedList<>();
        qu.add("1");
        //algo -- remove / print / add 2 more } n times
        for (int i = 0; i < n; i++) {
        String rem = qu.remove();
        System.out.print(rem + " ");
        qu.add(rem +"0");
        qu.add(rem + "1");
        }}}
//class discussed