public class fibonacci {
    public static void main(String[] args) {
        int a = 0 , b=1 , n= 10;

        for (int i=2; i<=n; i++){
            int next = a+b;
            System.out.println(next);
            a=b;
            b=next;
        }
        
    }
}
