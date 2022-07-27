package shopee;

public class replaceNum {
    public static void main(String[] args) {
        String s = "abvhjb123ddd";
        System.out.println(replaceStr(s));

    }
    public static String replaceStr (String s) {
        // write code here
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                int a = ans.length();
                if(a >= 3){
                    if(ans.substring(a-3,a).equals("num"))
                    continue;
                }
                    ans.append("num");

            }else {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}
