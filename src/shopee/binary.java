package shopee;
import java.util.*;

public class binary {
        public static void main(String[] args) {
//            Scanner cin = new Scanner(System.in);
//            ArrayList<Integer> list = new ArrayList<>();
//            ArrayList<Integer> ans = new ArrayList<>();
//           while(cin.hasNext()) {
//                list.add(cin.nextInt());
//            }
//           int[] a = new int[list.size()];
//            for (int i = 0; i < list.size(); i++) {
//                a[i] = list.get(i);
//            }
            ArrayList<Integer> ans = new ArrayList<>();
            int[] a = {1,2,3};
            binaryTree(ans,a,0,a.length-1);
            for (int i = 0; i < ans.size(); i++) {
                System.out.println(ans.get(i));
            }
        }
        public static void binaryTree (ArrayList<Integer> ans, int[] a, int start, int end) {
            if(start > end) return;
            if(start == end) {
                ans.add(a[start]);
                return;
            }
            int boader = a[start];
            int n = end;
            for(int i = start; i <= end; i++) {
                if(a[i] > boader){
                    n = i - 1;
                    break;
                }
            }
            binaryTree(ans,a,start+1,n);
            binaryTree(ans,a,n+1,end);
            StringBuilder str = new StringBuilder("aafagag");
            //str.;
            String s = new String("sgagag");
            //s.;
            ArrayList<Integer> arrays = new ArrayList<>();
            //arrays.

        }





}
