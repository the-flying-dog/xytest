package althrogram;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        int len = cin.nextInt();
        int[][] area = new int[len][2];
        int index = 0;
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < len; i++){
            area[index][0] = cin.nextInt();
            area[index][1] = cin.nextInt();
            index++;
        }
//        while(cin.hasNext()){
//            area[index][0] = cin.nextInt();
//            area[index][1] = cin.nextInt();
//            index++;
//        }

        Arrays.sort(area, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]) return o2[1] - o1[1];
                return o1[0] - o2[0];
            }
        });
        list.add(area[0]);
        for(int i = 1; i < len; i++) {
            int temp = list.get(list.size()-1)[1];
            if(area[i][0] <= temp ){
                list.get(list.size()-1)[1] = area[i][0] - 1;
                int[] t = {temp+1,area[i][1]};
                list.add(t);
            }else{
                list.add(area[i]);
            }
        }
        String ans = reverseS(s,list);
        System.out.println(ans);
    }
    public static String reverseS(String s,List<int[]> list) {
        char[] charArrays = s.toCharArray();
        for(int i = 0; i < list.size(); i++) {
            int l = list.get(i)[0] - 1;
            int r = list.get(i)[1] - 1;
            if(l <= r){
                for(int t = l; t <= r; t++){
                    if(Character.isLowerCase(charArrays[t])) {
                        charArrays[t] = Character.toUpperCase(charArrays[t]);
                    }else{
                        charArrays[t] = Character.toLowerCase(charArrays[t]);
                    }

                }
            }
        }
        Deque<Integer> queue = new LinkedList<>();

        return new String(charArrays);
    }
}
