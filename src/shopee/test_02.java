package shopee;

import java.util.ArrayList;
import java.util.Arrays;

public class test_02 {
    public static void main(String[] args) {
        long[] nums = {2,3,-2,4,-1};
        System.out.println(GetSubArrayMaxProduct(nums));

    }
    public static long GetSubArrayMaxProduct(long[] nums) {
        // write code here
       long[] ans = new long[nums.length];
       ans[0] = nums[0];

       for(int i = 1; i<nums.length;i++) {
           ans[i] = nums[i] * ans[i-1];
       }
       long max = findMax(ans);
       for(int a = 0; a < nums.length;a++){
           for(int b = a +1; b < ans.length;b++) {
               ans[b] = ans[b] / nums[a];
           }
           max=Math.max(max,findMax(ans));
       }
       return max;
    }
    public static long findMax(long[] ans) {
        long max = 0;
        for(long a:ans) {
            max = Math.max(a,max);
        }
        return max;
    }
}
