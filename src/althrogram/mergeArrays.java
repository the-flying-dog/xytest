package althrogram;

import java.sql.SQLOutput;
import java.util.*;

public class mergeArrays {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int num = cin.nextInt();
        cin.nextLine();
        int[][] line = new int[num][2];
        for(int i = 0; i < num; i++) {
            String[] str = cin.nextLine().split(",");
            line[i][0] = Integer.parseInt(str[0]);
            line[i][1] = Integer.parseInt(str[1]);
        }
        Arrays.sort(line, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < line.length; i++) {
            int left = line[i][0],right = line[i][1];
            if(list.isEmpty()||list.get(list.size()-1)[1] < left){
                list.add(line[i]);
            }
            else {
                list.get(list.size()-1)[1] = Math.max(right,list.get(list.size()-1)[1]);
            }
        }
        int[][]ans = list.toArray(new int[list.size()][2]);
        for(int[] a:ans) {
            System.out.println(a[0]+","+a[1]);
        }
    }
}
