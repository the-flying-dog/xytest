package method_test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
//    为什么要使用迭代器呢，因为collection中有些类型没有索引，无法按照索引方式遍历，所以引入迭代器的概念
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");
//        Iterator<String> it = c.iterator();
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }
        IteratorW<String> i = new IteratorW<>();
        i.iteratorW(c);
//        增强for循环（必须是集合或数组）
        for (String s:c) {
            System.out.println(s);
        }
    }

}
