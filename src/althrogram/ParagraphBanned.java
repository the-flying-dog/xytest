package althrogram;

import java.util.HashSet;
import java.util.Locale;
import java.util.*;

public class ParagraphBanned {
    public static void main(String[] args) {
        String str = "Bob hit a ball! the hit BALL flew far after it was hit?";
        String[] banned = {"hit"};
        Set<String> set = new HashSet<>();
        Map<String,Integer> map = new HashMap<>();
        for(String s : banned) {
            set.add(s);
        }
        String[] st = str.replaceAll("\\!|\\?|\\'|\\,|\\;|\\.","").toLowerCase().split(" ");
        for(String s : st){
            if(!set.contains(s)) {
                map.put(s,map.getOrDefault(s,0)+1);
            }
        }
        System.out.println(map);
        int max = 0;
        String ans = "";
        for(Map.Entry<String,Integer> entry:map.entrySet()) {
            if(entry.getValue() >= max){
                max = entry.getValue();
                ans = entry.getKey();
            }
        }
        System.out.println(ans);
    }
}
