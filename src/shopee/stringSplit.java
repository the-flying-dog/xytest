package shopee;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class stringSplit {
    public static void main(String[] args){
        String order = "32W20D20A";
        int[] ans = GetEndPoint(order);
        System.out.println("[");
        for(int a:ans){
            System.out.println(a + ",");
        }
    }

    public static int[] GetEndPoint (String order) {
        // write code here
        order.toUpperCase();
        int[] ans = {0,0};
        int len = order.length();
        StringBuilder step = new StringBuilder();
        for(int i = 0; i < len ; i++) {
            char c = order.charAt(i);
            if(c >= '0' && c <= '9') step.append(c);
            else {
                int s = 0;
                if(step.length()==0) s = 1;
                else s = Integer.parseInt(step.toString());
                System.out.println("数字为："+s);
                if(c == 'W') ans[1] = ans[1] + s;
                else if(c == 'S') ans[1] = ans[1] - s;
                else if(c == 'A') ans[0] = ans[0] - s;
                else if(c == 'D') ans[0] = ans[0] + s;
                step.delete(0,step.length());
            }
        }
        return ans;
    }

}
