public class BinarySearch {
    public int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(target > arr[mid]){
                start = mid+1;
            } 
            else if(target<arr[mid]){
                end = mid-1;
            }  
            else 
            return mid;
            
        }
        return -1;
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,8};

        BinarySearch bs = new BinarySearch();

        int idx = bs.search(arr, 6);
        if(idx != -1){
            System.out.println("Target found at index " + idx);
        }else{
            System.out.println("Target not found");
        }
    }
}
