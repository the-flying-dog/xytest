package shopee;
import java.util.*;

public class string_expends {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        StringBuilder ans=new StringBuilder("");
        String sb = cin.next();
        computeString(ans,sb,0,1);
        System.out.println(ans);

    }
    public static int computeString (StringBuilder ans, String sb, int index, int k ) {
        String n = "";
        int nextK = 0;
        StringBuilder sb1 = new StringBuilder("");
        while(index < sb.length()) {
            char c = sb.charAt(index);
            if (c == ']') {
                StringBuilder sb2 = new StringBuilder(sb1);
                for(int i = 0; i < k-1; i++) {
                    sb1.append(sb2);
                }
                ans.append(sb1);
                return index;
            } else if (c == '[') {
                //返回处理]后的index
                index = computeString(sb1, sb, index + 1, nextK);
            } else if (Character.isDigit(c)) {
                n += c;
            } else if (c == '*') {
                nextK = Integer.parseInt(n);
                n = "";
            }else {
                sb1.append(c);
            }
            index++;
        }
        ans.append(sb1);
        return index;
    }
}
