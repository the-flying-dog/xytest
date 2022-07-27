package Net;

import java.io.*;
import java.net.Socket;

public class UpLoadClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\天上乱飞的狗\\Desktop\\新建文件夹\\你是一个大猪头，呸！.docx");

        Socket socket = new Socket("127.0.0.1",8880);

        OutputStream os = socket.getOutputStream();
        os.write("你好服务器".getBytes());

        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1){
            os.write(bytes,0,len);
        }

        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        while ((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }

        fis.close();
        socket.close();
    }
}
