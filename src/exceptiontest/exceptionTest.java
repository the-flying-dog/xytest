package exceptiontest;

import java.io.IOException;

public class exceptionTest {
    public static void main(String[] args) throws IOException {
        String a = "a.tx";
//        try {
//            readFilo(a);
//            System.out.println("我爱你");
//        } catch (IOException e) {
//            e.printStackTrace();
//            e.getMessage();
//            e.toString();
//        }
//        finally {
//            System.out.println("后续程序");
//        }
        readFilo(a);
    }
    public static void readFilo(String str) throws IOException {
        if(!str.endsWith(".txt")){
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("没问题");
    }
}
