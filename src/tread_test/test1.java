package tread_test;

public class test1 {
    public static void main(String[] args) {

//        Tread01 n = new Tread01();
//        n.start();
//        Method1 m = new Method1();
//        m.start();
////        Person p1 = new Person("甘雨",18,false);
////        p1.run();
//        for (int i = 0; i < 20; i++) {
//            System.out.println(i);
//        }
//
////        Runnable r = new synchronizedMethodImpl();
//        Runnable r = new LockMethodImpl();
//        new Thread(r).start();
//        new Thread(r).start();
//        new Thread(r).start();


        RunnableImple run = new RunnableImple();
        Thread t = new Thread(run);
        t.start();

    }
}
