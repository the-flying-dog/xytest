package shopee;

import java.util.Arrays;
import java.util.Collections;

public class sortf {
    public static void main(String[] args) {
        int[] arrs = {1,2,3,4};
        System.out.println(maxIntValue(arrs));

    }
    public static int maxIntValue (int[] arrs) {
        // write code here
        Arrays.sort(arrs);
        StringBuilder str = new StringBuilder();
        int len = arrs.length;
        for(int i = len - 1; i >= 0; i--) {
            str.append(arrs[i]);
        }
        return Integer.parseInt(str.toString());
    }
}
