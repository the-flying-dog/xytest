package interface_test;

public class InnerInterfaceTest {
    public static void main(String[] args) {
        InnerInterface test = new InnerInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类的用法：");
                System.out.println("当接口实现类或者子类只出现一次时，可以使用匿名内部类省去多写一个实现类并实现接口的过程");
            }
        };
        test.method();
    }
}
