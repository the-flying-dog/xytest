package IO_test;

import java.io.*;

public class FileStreamCopyTest {
    public static void main(String[] args) throws IOException {
        File test = new File("C:\\Users\\天上乱飞的狗\\Desktop\\你好.docx");
//        两种不同的构造方式
        FileInputStream inputStream = new FileInputStream(test);
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\天上乱飞的狗\\Desktop\\复制.docx",true);
        byte[] readBuffer = new byte[1024];
        int len = 0;
        while((len=inputStream.read(readBuffer))!=-1){
//            避免最后一次读取出现大量空白
            System.out.println(new String(readBuffer,0,len));
            outputStream.write(readBuffer,0,len);
        }
//        先关写再关读
        outputStream.close();
        inputStream.close();

    }

}
