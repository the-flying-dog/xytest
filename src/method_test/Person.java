package method_test;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private boolean ismale;

//alt+insert自动生成setter，getter和构造函数
    public Person() {
    }

    public Person(String name, int age, boolean ismale) {
        this.name = name;
        this.age = age;
        this.ismale = ismale;
    }


    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(name+i);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0){
            this.age = age;
        }else {
            System.out.println("错误输入！！！");
        }
    }

    public String isIsmale() {
        if(ismale) return  "男";
        return  "女";
    }

    public void setIsmale(boolean ismale) {
        this.ismale = ismale;
    }

//不重写输出的是地址值
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ismale=" + ismale +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && ismale == person.ismale && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, ismale);
    }
}
