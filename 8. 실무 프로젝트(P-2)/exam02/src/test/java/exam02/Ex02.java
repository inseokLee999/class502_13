package exam02;

import java.io.*;
import java.net.Socket;

public class Ex02 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",9999);
        OutputStream oos = socket.getOutputStream();//연결된 서버 소켓으로 데이터 전송
        DataOutputStream dos = new DataOutputStream(oos);
        dos.writeUTF("안녕하세요 서버님!");
        InputStream in = socket.getInputStream();
        DataInputStream dis = new DataInputStream(in);
        System.out.println(dis.readUTF());
    }
}
