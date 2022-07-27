package method_test;

import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {
        int[] arrays = new int[3];
        for (int i = 0; i < 3; i++) {
            arrays[i] = i;
        }
        reverseArrays(arrays);

    }
    public static void reverseArrays(int[] arrays) {
        int a = 0;
        int b = arrays.length - 1;
        System.out.println("原数组为：");
        /*for (int i = 0; i <= b; i++) {
            System.out.println("arrays" + i + " = " + arrays[i]);
        }*/
        System.out.println(Arrays.toString(arrays));
        int temp = 0;
        System.out.println("=========开始反转========");
        for (;a < b;a++,b--) {
            temp = arrays[a];
            arrays[a] = arrays[b];
            arrays[b] = temp;
        }
        System.out.println("反转完成");
        System.out.println(Arrays.toString(arrays));
    }
}
