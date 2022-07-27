package ali_niuke;
import java.util.*;
public class subSort {
    public static void main(String[] args) {
        //输入
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        String s[] = inputString.split(" ");
        int nums[] = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }
        int target = in.nextInt();
        //主体
        int len = nums.length;
        if(target>len) System.out.println(-1);
        else System.out.println(nums[len - target]);
    }
}
