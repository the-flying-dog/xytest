package ali_niuke;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class two_array {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        for(int i = 0; i < T; i++) {
            int n = cin.nextInt();
            int[][] nt = new int[n][2];
            for(int a = 0; a < n; a++){
                nt[a][0] = cin.nextInt();
            }
            for(int b = 0; b < n; b++){
                nt[b][1] = cin.nextInt();
            }

            int ans = 0;
            //排序
            Arrays.sort(nt, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if(o1[0]==o2[0]) return o2[1] - o1[1];
                    return o1[0] - o2[0];
                }
            });
            for(int c = 0; c < n-1; c++){
                if(nt[c][1]>=nt[c+1][1]) ans++;
            }

            //输出每组结果
            System.out.println(n-ans);
        }


    }
}
