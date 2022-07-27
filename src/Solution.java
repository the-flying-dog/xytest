import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        //找重复数字
//        int[] nums = {2, 3, 1, 0, 2, 5, 3};
//        int result = findRepeatNumber(nums);
//        System.out.println(result);
        //二维数组找数字
        int[][] matrix = {{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
//        int [][] matrix = {};
        int target = 20 ;
        System.out.println(findNumberIn2DArray(matrix,target));
    }
    public static int findRepeatNumber0(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n:nums){
            if(!map.containsKey(n))
                map.put(n,1);
            else return n;
        }
        return -1;
    }

    public static int findRepeatNumber(int[] nums) {
       for(int i=0;i<nums.length;i++){
           if(nums[i]==i) continue;
           if(nums[nums[i]]==nums[i]) return nums[i];
           int temp = nums[i];
           nums[i] = nums[temp];
           nums[temp] = temp;
       }
       return -1;
    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix[0].length;
        int n = matrix.length;
        int a = 0,b=matrix[0].length-1;
        while(a<n&&b>=0) {
            if(matrix[a][b] < target) a++;
            else if(matrix[a][b] > target) b--;
            else return true;
        }
        return false;
    }
}
