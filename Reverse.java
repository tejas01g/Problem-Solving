// public class Reverse {
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6};

//         System.out.println("Before reversal:");
//         for(int i : arr){
//             System.out.print(i+" ");
//         }
//         System.out.println();

//         for (int i= 0)
//     }
// }

public class Reverse {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        
        for (int i= arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}