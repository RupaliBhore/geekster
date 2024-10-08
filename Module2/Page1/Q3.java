// // GKSTR43 Insertion Sort       // Find current position for current number

// Take an array of size N as input.

// Sort the array using insertion sort.

// Note: Don't use inbuilt sort function.

// Input Format

// An integer N, which is the size of the array.

// N integers, depicting the elements of the array.

// Constraints

// 0 <= arr.length <= 10^4

// -1*10^5 <= arr[i] <= 10^5
// Output Format

// Return A sorted array of size N.

// Sample Input 0

// 5
// 9 4 3 8 7
// Sample Output 0

// 3 4 7 8 9


// Asked

// import java.util.*;

// public class Q3 {

//     public static void main(String[] args) {
//      Scanner scanner = new Scanner(System.in);

        
//         int N = scanner.nextInt();

      
//         int[] arr = new int[N];
//         for (int i = 0; i < N; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         insertionSort(arr);

        
//         for (int i = 0; i < N; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void insertionSort(int[] arr) {
//         int n = arr.length;
//         for (int i = 1; i < n; i++) {
//             int key = arr[i];
//             int j = i - 1;
            
//             while (j >= 0 && arr[j] > key) {
//                 arr[j + 1] = arr[j];
//                 j = j - 1;
//             }
//             arr[j + 1] = key;
//         }
//     }
// }

// Discussed



// import java.util.*;

// public class Q3 {

//     public static void main(String[] args) {
//      Scanner scanner = new Scanner(System.in);
  
//         int n = scanner.nextInt();   
//         int[] A = new int[n];

//         for (int i = 0; i < n; i++) {
//             A[i] = scanner.nextInt();
//         }                                                   //9 4 3 8 7          
//         //inserton sort logic
//     for (int i = 0; i < n; i++) {                           // 9 4 3 8 7  //9
//         for (int j = i; j >= 1 ; j--) {                     // 9 4 3 8 7    
//            if(A[j] < A[j-1]){           // 9 < 8                                   
//             int tmp =A[j];
//             A[j] = A[j-1];
//             A[j-1] = tmp ;
//            }else{
//                 break;
//            }
//         }
//         }   
//         for (int i = 0; i < n; i++) {
//             System.out.print(A[i] + " ");
//         }
//     }
// }






import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}