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

                                // taking input

// import java.util.Scanner;

// public class fibonacci {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = 0 , b=1;

//         System.out.println("The Fibonacci series" + a + " ," +b);

//         System.out.println("Enter the value of n:");
//         int n = sc.nextInt();

//         for (int i=2; i<=n; i++){
//             int next = a+b;
//             System.out.println(" " + next);
//             a=b;
//             b=next;
//         }
        
//     }
// }


                            //USING RECURISON

public class fibonacci{
    static int fib(int n){
        if (n==0) return 0;
        if (n==1) return 1;

        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(n + fib(n));
    }
    
}