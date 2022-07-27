package method_test;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
//        String str = "hello";
//        int len = str.length();
//        System.out.println(len);
//        char[] charArrays = str.toCharArray();
//        System.out.println(charArrays);
//        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
//        for (int i = 0; i < bytes.length; i++) {
//            System.out.println(bytes[i]);
//        }
////        String类不可变
//        String re = str.replace("o", "hahahhah");
//        System.out.println(re);

        Scanner input = new Scanner(System.in);
        String str = input.next();

        String neStr = replaceSensitive(str);
        System.out.println(neStr);

        StringBuffer sb = new StringBuffer(str);
        sb.append("嘿嘿嘿").reverse();
        System.out.println(sb);
//
        input.close();
    }
//str.replace用来替换词汇
    public static String replaceSensitive(String str) {
        String neWord = str.replace("你大爷的", "我爱你");
        return neWord;
    }
}
