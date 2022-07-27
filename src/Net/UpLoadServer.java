package Net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class UpLoadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8880);
        System.out.println("服务器准备就绪");
        while(true){
            Socket socket = serverSocket.accept();
            System.out.println("New connection accepted " +
                    socket.getInetAddress() + ":" +socket.getPort());
            InputStream is = socket.getInputStream();

            int len = 0;
            byte[] bytes = new byte[1024];

            len = is.read(bytes);
            System.out.println(bytes);
            System.out.println(new String(bytes,0,len));

            File file = new File("C:\\Users\\天上乱飞的狗\\Desktop\\新建文件夹");
            if(!file.exists()){
                file.mkdirs();
            }
            FileOutputStream fos = new FileOutputStream(file +"\\"+System.currentTimeMillis()+new Random().nextInt(9999)+".docx");
            len = 0;
//        byte[] bytes = new byte[1024];
            while ((len = is.read(bytes)) != -1){
                fos.write(bytes,0,len);
            }
            System.out.println("完成");

            OutputStream os = socket.getOutputStream();
            os.write("上传成功".getBytes());

            fos.close();
            socket.close();
//            serverSocket.close();

//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        InputStream is = socket.getInputStream();
//
//                        int len = 0;
//                        byte[] bytes = new byte[1024];
//
//                        len = is.read(bytes);
//                        System.out.println(bytes);
//                        System.out.println(new String(bytes,0,len));
//
//                        File file = new File("C:\\Users\\天上乱飞的狗\\Desktop\\新建文件夹");
//                        if(!file.exists()){
//                            file.mkdirs();
//                        }
//                        FileOutputStream fos = new FileOutputStream(file +"\\"+System.currentTimeMillis()+new Random().nextInt(9999)+".docx");
//                        len = 0;
////        byte[] bytes = new byte[1024];
//                        while ((len = is.read(bytes)) != -1){
//                            fos.write(bytes,0,len);
//                        }
//                        System.out.println("完成");
//
//                        OutputStream os = socket.getOutputStream();
//                        os.write("上传成功".getBytes());
//
//                        fos.close();
//                        socket.close();
////            serverSocket.close();
//                    }catch (IOException e){
//                        System.out.println(e);
//                    }
//                }
//            }).start();


        }


    }
}
