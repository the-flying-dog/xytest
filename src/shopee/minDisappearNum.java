package shopee;
import java.util.*;
public class minDisappearNum {
    public static void main(String[] args) {
        int[] nums = {7,8,9,11,12};
        System.out.println(firstMissingPositive(nums));

    }
    public static int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);
        int label = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i]>0){
                label = i;
                break;
            }
        }
        for(int i = label; i < nums.length; i++){
            if(nums[i]!=i-label+1){
                return i-label+1;
            }
        }
        return nums[nums.length-1] + 1;

    }
}
