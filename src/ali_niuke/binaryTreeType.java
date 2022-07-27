package ali_niuke;

import java.util.*;

public class binaryTreeType {
    static final int MOD = 1000000007;
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        long dp[][] = new long[n+1][m+1];
        Arrays.fill(dp[0],1);
        for(int i = 1; i <= n; i++){
            for(int a = 1; a <= m; a++){
                for(int k = 0; k < i; k++){
                    dp[i][a] = (dp[i][a]+dp[k][a-1]*dp[i-k-1][a-1]%MOD)%MOD;
                }
            }
        }
        System.out.println(dp[n][m]);
    }

}
