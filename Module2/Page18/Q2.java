// Queue Syntax Learning

// 1 Declare an Empty queue s.
// 2 Take Single Integer T as input.
// 3 For next T Lines format (case, x(optional))
// case 1. Print the size of the queue in a separate line.
// case 2. Remove an element from the queue. If the queue is empty then print -1 in a separate line.
// case 3. Add Integer x to the queue s.
// case 4. Print an element at the front of the queue. If queue is empty print -1 in a separate line.
// Output Format

// According to case Print the information explained, if its not possible then -1.
// Sample Input 0

// 5
// 1
// 2
// 3 9
// 4
// 1
// Sample Output 0

// 0
// -1
// 9
// 1
// Explanation 0

// Q = [ ], size = 0
// Q = [ ], can't remove so invalid move -1
// Q = [ ] =>  Q = [9]
// Q = [9] so Q.top() = 9
// Q = [9] so Q.size() = 1




import java.util .*;

     public class Q2 {
          public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int t = scn.nextInt();
            Queue<Integer> qu = new LinkedList<>();
            
              for (int i = 0; i < t; i++){
               int cNu = scn.nextInt();
               if (cNu == 1){
                System.out.println(qu.size());
               }else if(cNu == 2){
                   if(qu.size() == 0){
               System.out.println(-1);
                }else{
                    qu.remove();
                   }
               }else if(cNu == 3){
            int x = scn.nextInt();
               qu. add(x);
            }else{
            if(qu.size() == 0){
            System.out.println(-1);
            }else{
            System.out.println(qu.peek());
            }
            }
            }
                }
            }
//class discussed