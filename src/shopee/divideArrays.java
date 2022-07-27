package shopee;

public class divideArrays {
    public static void main(String[] args) {
        int[] ans = {};
        int k = 3;
        int sum = 0;
        int max = 0;
        boolean[] used = new boolean[ans.length];
        for(int i = 0; i < ans.length; i++) {
            sum += ans[i];
            max = (max>ans[i]) ? max : ans[i];
        }
        int target = sum / k;
        if(sum % k != 0 || max > target) {
            System.out.println(false);
        }
        else {
            System.out.println(dfs(ans,k,target,0,0,used));
        }

    }
    public static boolean dfs(int[] num,int k,int target,int cur,int start,boolean[] used) {
        if(k == 0) return true;
        if(cur == target) return dfs(num,k-1,target,0,0,used);
        for(int i = 0; i < num.length; i++) {
            if(!used[i] && cur + num[i] <= target) {
                used[i] = true;
                if(dfs(num,k,target,cur+num[i],start+1,used)) {
                    return true;
                }
                used[i] = false;
            }
        }
        return false;
    }
}
