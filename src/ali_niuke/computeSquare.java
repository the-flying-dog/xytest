package ali_niuke;
import java.util.*;

public class computeSquare {
    //科学技术法
    static final int MOD = 1000000007;
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        for(int i = 0; i < T; i++){
            int A = cin.nextInt();
            int B = cin.nextInt();
            int n = cin.nextInt();
            //斐波那契数列
            long ans = 0;
            Long d0 = 2L;
            Long d1 = (long)A;
            if(n == 0) ans = d0;
            else if(n == 1) ans = d1;
            else {
                for(int a = 2; a <= n; a++){
                    //防止溢出
                    ans = ((A*d1)%MOD - (B*d0)%MOD + MOD)%MOD;
                    d0 = d1;
                    d1 = ans;
                }
            }
            System.out.println(ans);
        }
    }
}
