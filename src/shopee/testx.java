package shopee;
import java.util.Scanner;
public class testx {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int k = in.nextInt();
            int m = in.nextInt();
            int[][] A = new int[n][n];
            for(int i = 0 ; i<n;i++){
                for(int j = 0; j < n; j++){
                    A[i][j] = in.nextInt();
                }
            }
            int[][] ans = multi(A,n,k);
            for(int i = 0; i < n; i++){
                for(int j = 0; j< n; j++){
                    ans[i][j] = ans[i][j] % 4;
                }
            }


        }
        public static int[][] multi(int[][] A,int n,int k){
            int[][] ans = A;
            for(int g = 0;g<k;g++){
                int[][] temp = new int[n][n];
                for(int i = 0 ; i<n;i++){
                    for(int j = 0; j < n; j++){
                        for(int x =0 ;x<n;x++){
                            temp[i][j] += ans[i][x]*A[x][j];
                        }
                    }
                }
                ans = temp;
            }

            return ans;
        }
}
