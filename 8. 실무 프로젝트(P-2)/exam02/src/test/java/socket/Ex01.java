package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex01 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("서버 대기중");
        Socket socket = serverSocket.accept();//접속한 사용자 socket
        //데이터 전송 수신
        System.out.println("서버 접속 : "+ socket);
        InputStream in = socket.getInputStream();
        DataInputStream dis = new DataInputStream(in);
        System.out.println("수신 내용 : " + dis.readUTF());

        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("그래그래, 안녕! 클라이언트~");
    }
}
