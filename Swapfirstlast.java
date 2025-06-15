public class Swapfirstlast {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int temp = arr[1];
        arr[1] = arr.length-1;
        arr[arr.length-1] = temp;
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
