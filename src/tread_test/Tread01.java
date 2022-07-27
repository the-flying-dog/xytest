package tread_test;

public class Tread01 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("线程" + i);
        }
    }
}
