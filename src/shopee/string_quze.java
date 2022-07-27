package shopee;

public class string_quze {
    public static void main(String[] args) {
        System.out.println(compressString("shopeew"));

    }
    public static String compressString (String param) {
        // write code here
        if(param == null||param.length()==0) return param;
        StringBuilder ans = new StringBuilder();
        int num = 1;
        ans.append(param.charAt(0));
        for(int i = 1; i < param.length(); i++){
            char c = param.charAt(i);
            if(c==param.charAt(i-1)) {
                num++;
                continue;
            }else {
                if(num != 1){
                    ans.append(num);
                }
                ans.append(c);
                num = 1;
            }
        }
        if(num != 1){
            ans.append(num);
        }
        return ans.toString();
    }
}
