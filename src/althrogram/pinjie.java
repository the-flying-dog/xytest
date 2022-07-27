package althrogram;

import java.util.Scanner;
public class pinjie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = Integer.parseInt(in.nextLine());
        String str = in.nextLine();
        String[] sArray = str.split(",");
        int[] nums = new int[len];
        for(int i = 0; i < len; i++){
            nums[i] = Integer.parseInt(sArray[i]);
        }
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for(int num:nums) {
            if(num%2 == 0){
                a.append(num+",");
            }
            else {
                b.append(num+",");
            }
        }
        StringBuilder ans = a.append(b);
        String re = ans.toString();
        System.out.println(re.substring(0,re.length()-1));
    }
}
