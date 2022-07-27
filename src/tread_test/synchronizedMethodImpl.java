package tread_test;

public class synchronizedMethodImpl implements Runnable{
    private int num = 100;
    Object o = new Object();
    @Override
    public void run() {
        while (true){
            method();
        }
    }

    public void method(){
        synchronized (o){
            if(num > 0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("睡眠错误");
                    e.printStackTrace();
                }
                System.out.println("卖出第"+ num + "张票");
                num--;
            }
        }
    }
}
