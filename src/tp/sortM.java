package tp;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class sortM {
        public static void main(String[] args) {
            int[] ans = {4,3,2,1};
            sortM(ans);
            for(int a:ans){
                System.out.println(a);
            }
            String s = "123456789";





        }
        public static void sortM(int[] num){
            for(int i = 0;i<num.length;i++){
                for(int j = num.length-1;j>i;j--){
                    if(num[j]<num[j-1]) {
                        int temp = num[j];
                        num[j] = num[j - 1];
                        num[j - 1] = temp;
                    }
                }
            }
        }
}
