// // HW_Print Z,z,X,x,V,v till A,a. using loop.
// Write a program to print Z,z,X,x,V,v,T,t,R,r,..............uptil A,a.

// Input Format

// No input

// Constraints

// NA

// Output Format

// Print the series in a single line as given below.

// Z z Y y X x W w V v U u T t S s R r Q q P p O o N n M m L l K k J j I i H h G g F f E e D d C c B b A a

// Sample Output 0

// Z z Y y X x W w V v U u T t S s R r Q q P p O o N n M m L l K k J j I i H h G g F f E e D d C c B b A a 

public class Q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          char uppercase = 'Z';
        char lowercase = 'z';
        
        // Loop from Z to A
        for (int i = 0; i < 26; i++) {
            // Print the uppercase letter followed by a space
            System.out.print(uppercase + " ");
            // Print the lowercase letter followed by a space
            System.out.print(lowercase + " ");
            
            // Move to the next uppercase and lowercase letters
            uppercase--;
            lowercase--;
        }
    
    }
}