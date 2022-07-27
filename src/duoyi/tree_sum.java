package duoyi;
import java.io.*;
import java.util.*;
public class tree_sum {
    /*
    首先对数组进行排序，能够为去重操作带来遍历同时可以为后续循环中降低复杂度，
    首先进行第一次剪枝，通过判断nums[0]与0的关系可以减少无用的查找
    进入第一层循环中为避免重复，需要判断从序号为1的节点开始是否与前面的节点相同
    进入第二层循环采用双指针的方法可以有效地降低复杂度，左右指针从数组剩下的部分的两端开始寻找符合条件的数加入链表中
     */
    public static void main(String[] args) {
        //输入
        int[] nums = {-1, 0, 1, 2, -1, -4};
        //排序
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        if(nums[0] <= 0) {
            for(int i = 0; i < len; i++) {
                if(i > 0 && nums[i] == nums[i-1]) continue;
                int l = i + 1;
                int r = len - 1;
                int target = 0 - nums[i];
                while(l < r) {
                    int sum = nums[l] + nums[r];
                    if(sum < target) {
                        l++;
                    }else if(sum > target){
                        r--;
                    }else {
                        ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                        while(l<r&&nums[l]==nums[l+1]) l++;
                        while(l<r&&nums[r]==nums[r-1]) r--;
                        r--;
                        l++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
