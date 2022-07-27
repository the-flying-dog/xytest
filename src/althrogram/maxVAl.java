package althrogram;

import java.util.Scanner;
public class maxVAl {
    static int max = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hp = sc.nextInt();
        int num = sc.nextInt();
        int[] val = new int[num];
        int[] cast = new int[num];
        boolean[] used = new boolean[num];
        int ans = 0;
        for(int i = 0; i < num; i++){
            val[i] = sc.nextInt();
        }
        sc.nextInt();
        for(int i = 0; i < num; i++){
            cast[i] = sc.nextInt();
        }
        dfs(val,cast,used,0,hp);
        System.out.println(max);
    }
    public static void dfs(int[] val,int[] cast,boolean[] hav,int ans,int hp){
        if(hp < 0 ) {
            return;
        }
        for(int i = 0; i < val.length; i++) {
            if(!hav[i]) {
                hav[i] = true;
                dfs(val,cast,hav,ans+val[i],hp - cast[i]);
                max = max > ans ? max : ans;
                hav[i] = false;
            }
        }
    }
}
