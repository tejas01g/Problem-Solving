// public class fibonacci {
//     public static void main(String[] args) {
//         int a = 0 , b=1 , n= 10;

//         for (int i=2; i<=n; i++){     
//             int next = a+b;
//             System.out.println(next);
//             a=b;
//             b=next;
//         }
        
//     }
// }

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0 , b=1;

        System.out.println("The Fibonacci series" + a + " ," +b);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        for (int i=2; i<=n; i++){
            int next = a+b;
            System.out.println(" " + next);
            a=b;
            b=next;
        }
        
    }
}
