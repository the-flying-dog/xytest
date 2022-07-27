package IO_test;

import java.io.*;
import java.util.ArrayList;

public class serTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> array = new ArrayList<>();
        array.add(new Person("甘雨",18));
        array.add(new Person("胡桃",16));
        array.add(new Person("刻晴",22));
        array.add(new Person("凝光",23));
        //序列化
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("liyue.txt"));
        os.writeObject(array);
        //反序列化
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("liyue.txt"));
        Object o=is.readObject();
        ArrayList<Person> s = (ArrayList<Person>) o;
        for(Person a:s){
            System.out.println(a);
        }
        is.close();
        os.close();
    }
}
