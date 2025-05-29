import java.util.Arrays;

public class twosum {
    public static int[] twosum (int[] nums, int target){
        for (int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int nums[] = {2,4,5,3,6,7,9};
        int target= 8;
        int [] result = twosum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}

