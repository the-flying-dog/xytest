package method_test;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
//        test1();
//        test2();
//        testMap();
        personMap();

    }
    public static void test1() {
        Collection<String> arrays = new ArrayList<>();
        Collection<String> hashSet = new HashSet<>();

        hashSet.add("大娃");
        hashSet.add("二娃");
//        set中不能有重复元素
        hashSet.add(("二娃"));

//    add方法用来给集合添加元素，返回一个Boolean值
        arrays.add("大娃");
        arrays.add("二娃");
        System.out.println();
        System.out.println(arrays.contains("大娃"));
        arrays.remove("大娃");
        System.out.println(arrays.contains("大娃"));
        System.out.println(arrays.isEmpty());
        arrays.clear();
        System.out.println(arrays.isEmpty());

        System.out.println(arrays);

        arrays.add("大娃");
        arrays.add("二娃");
//        必须返回object类型
        Object[] arr = arrays.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        System.out.println(arrays);
    }

    public static void test2(){
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    public static void testMap() {
        System.out.println("遍历map方法测试");
        Scanner input = new Scanner(System.in);
        String method="";
        System.out.println("请输入想要的方法：1 keyset 2 entry");
        if(input.hasNext()){
            method = input.next();
        }
        Map<String,Integer> map = new HashMap<>();
        map.put("甘雨",18);
        map.put("菲谢尔",16);
        map.put("胡桃",21);
        map.put("琴",22);
        map.put("温迪",100);
        System.out.println(map);
        if(method.equals("1") ){
            mapT1(map);
        }else {
            mapT2(map);
        }

    }

    public static void mapT1(Map<String,Integer> map) {
        System.out.println("使用entry内部类");
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey() + entry.getValue() + "岁");
        }
    }

    public static void mapT2(Map<String,Integer> map) {
        System.out.println("使用KeySet方法");
        for(String key:map.keySet()){
            System.out.println(key + map.get(key) + "岁");
        }
    }

    public static void personMap() {
        System.out.println("使用LinkedHashMao使map有序，存的顺序和取的顺序相同");
        Map<Person,String> map = new LinkedHashMap<>();
        System.out.println("使用自定义类作为map的key需要重写类中的equals和hashCode");
        map.put(new Person("甘雨",18,false),"璃月七星的总秘书");
        map.put(new Person("胡桃",21,false),"往生堂堂主");
        map.put(new Person("菲谢尔",16,false),"中二少女");
        map.put(new Person("凝光",27,false),"璃月七星之天权星");
        map.put(new Person("甘雨",18,false),"超级狙击手");
        System.out.println(map);
        System.out.println("使用entry内部类");
        for(Person key:map.keySet()){
            System.out.println(key.getName() + "今年" + key.getAge() + key.isIsmale() + "是" +  map.get(key));
        }
    }

}
