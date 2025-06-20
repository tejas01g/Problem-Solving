// // public class BinarySearch {
// //     public int search(int[] arr, int target){
// //         int start = 0;
// //         int end = arr.length-1;
// //         while(start<=end){
// //             int mid = (start+end)/2;
// //             if(target > arr[mid]){
// //                 start = mid+1;
// //             } 
// //             else if(target<arr[mid]){
// //                 end = mid-1;
// //             }  
// //             else 
// //             return mid;
            
// //         }
// //         return -1;
// //     }
// //     public static void main(String[] args){
// //         int [] arr = {1,2,3,4,5,6,7,8};

// //         BinarySearch bs = new BinarySearch();

// //         int idx = bs.search(arr, 6);
// //         if(idx != -1){
// //             System.out.println("Target found at index " + idx);
// //         }else{
// //             System.out.println("Target not found");
// //         }
// //     }
// // }


public class BinarySearch{
    public int search(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        while(start<= end){
            int mid = start + (end - start)/2;
            if (target>arr[mid]){
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

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7};
        BinarySearch bs = new BinarySearch();
        int idx = bs.search(arr, 7);
        if(idx != -1){
            System.out.print("Target found " +idx);
        }
        else{
            System.out.println("Not found");
        }
    }
}


// Search In Rotated Sorted Array 
//array

// public class BinarySearch{
//     public int Search (int [] arr , int target){
//         int start = 0;
//         int end = arr.length-1;

//         while(start<=end){
//             int mid = start + (end-start)/2;
//             if(arr[mid] == target){
//                 return mid;
//             }
//             if(arr[start]<=arr[mid]){  //left sorted
//                 if(arr[start] <= target && target <= arr[mid]){
//                     end = mid-1;
//                 }
//                 else{
//                     start = mid+1;
//                 }}else{
//                 if(arr[mid] <= target && target <= arr[end]){
//                     start = mid+1;
//                 }
//                 else{
//                     end = mid-1;
//                 }
//             }
//             }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] arr = {3,4,5,6,7,0,1,2};
//         BinarySearch bs = new BinarySearch();
//         int idx = bs.Search(arr, 1);
//         if(idx!= -1){
//             System.out.println("Target found at index : " +idx);
//         }
//         else{
//             System.out.println("Not found");
//         }
//     }
// }
