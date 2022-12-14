package Net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(8889);
        System.out.println("服务器准备就绪");
        Socket socket = serverSocket.accept();
        System.out.println("New connection accepted " +
                socket.getInetAddress() + ":" +socket.getPort());

        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(bytes);
        System.out.println(new String(bytes,0,len));

        OutputStream os = socket.getOutputStream();
        os.write("收到谢谢".getBytes());

        socket.close();
        serverSocket.close();
    }
}
