package tread_test;

public class RunnableImple implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "创建线程");
    }
}
