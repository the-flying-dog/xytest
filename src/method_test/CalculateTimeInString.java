package method_test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculateTimeInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        String str = "";
        if(input.hasNext()){
            str = input.next();
        }
        char[] arrays = str.toCharArray();
        for(char c:arrays){
            if(!map.containsKey(c)){
                map.put(c,1);
            } else {
                map.put(c,map.get(c)+1);
            }
        }
        System.out.println(map);
        System.out.println("使用KeySet方法");
        for(Character key:map.keySet()){
            System.out.println(key + "是" + map.get(key) + "次");
        }

    }
}
