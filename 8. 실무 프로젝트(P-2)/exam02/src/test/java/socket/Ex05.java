package socket;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Ex05 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",9999);
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        Data data = new Data();
        data.setFrom("클라이언트2");
        data.setTo("클라이언트1");
        data.setMessage("메세지");

        oos.writeObject(data);
    }
}
