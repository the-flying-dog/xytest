package method_test;

import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {
//    快捷键psvm
    public static void main(String[] args) {
        System.out.println("Hello world!!");
        int nums = (int)Math.ceil(13.3);
        System.out.println("nums = " + nums);

//    new一个类的快捷键：Person.new
        Person student = new Person();
        student.setName("佣兵");
        student.setAge(18);
        student.setIsmale(true);
        System.out.println(student.toString());

        //System.in表示键盘输入，Scanner没有无参构造函数
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a + b);

        ArrayList<Object> arrays = new ArrayList<>();
        arrays.add(10);
        arrays.add("赵丽颖");
        arrays.add(13.3);
        System.out.println(arrays);
        for (int i = 0; i < arrays.size(); i++) {
            System.out.println(arrays.get(i));
        }
    }
}
