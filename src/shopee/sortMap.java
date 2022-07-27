package shopee;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class sortMap {
    public static void main(String[] args) {
        StringBuilder indexNode = new StringBuilder();
        Map<String,Integer> map = new HashMap<>();
        map.put("woaini",19);
        map.put("woxi",18);
        map.put("wohuan",16);
        map.put("woni",1);

        Iterator iterator = sortMap(map).keySet().iterator();
        while(iterator.hasNext()){
            indexNode.append(iterator.next());
            indexNode.append("\r\n");
        }
        System.out.println(indexNode);

    }

    public static Map<String,Integer> sortMap(Map<String,Integer> oldMap) {
        ArrayList<Map.Entry<String,Integer>> list = new ArrayList<>(oldMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }});
        Map<String,Integer> newMap = new LinkedHashMap<String,Integer>();
        for(int i = 0; i < list.size(); i++) {
            newMap.put(list.get(i).getKey(),list.get(i).getValue());
        }
        return newMap;
    }

}
