package interface_test;

public class KeyBoard implements USB{
    @Override
    public void open() {
        System.out.println("使用键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void type(){
        System.out.println("键盘打字");
    }
}
