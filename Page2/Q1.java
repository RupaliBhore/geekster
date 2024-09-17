// Fahrenheit and Celsius

// You will be given Fahrenheit as input that should be stored in a double variable and print your answer in Celsius of data-type double.

// Input Format

// In each test case, you will get Fahrenheit as input.

// Constraints

// Fahrenheit will be given as a double data-type.

// Output Format

// For each test-case, you have to print Celsius in the double format.

// Sample Input 0

// 32.0
// Sample Output 0

// 0.0


import java.util.*;

public class Q1 {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        
     
        double fahrenheit = scn.nextDouble();
        
       
        double celsius = (fahrenheit - 32) * 5 / 9;
        
    
        System.out.println( celsius);
        
    }
}