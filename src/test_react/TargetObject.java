package test_react;

public class TargetObject {
    private String value;
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TargetObject() {
        value = "pikacu";
        System.out.println(value);
    }

    public TargetObject(String value) {
        this.value = value;
        System.out.println(value);
    }

    public String getValue() {
        System.out.println("getValue"+value);
        return value;
    }

    public void setValue(String value) {
        System.out.println("setValue"+value);
        this.value = value;
    }
}
