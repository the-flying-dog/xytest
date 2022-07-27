package tread_test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockMethodImpl implements Runnable{
    private int num = 100;
    Lock l = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            l.lock();
            if(num > 0){
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName()+"卖出第"+ num + "张票");
                    num--;
                } catch (InterruptedException e) {
                    System.out.println("睡眠错误");
                    e.printStackTrace();
                }
                finally {
                    //无论程序是否异常，都释放
                    l.unlock();
                }

            }

        }
    }

}
