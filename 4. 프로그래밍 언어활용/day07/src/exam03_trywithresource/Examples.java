package exam03_trywithresource;

class MyResource implements AutoCloseable {
    public void close() throws Exception {
        System.out.println("Closing resource");
    }
}

public class Examples {
    public static void main(String[] args) {
        try (MyResource resource = new MyResource()) {
            // 자원 사용
            System.out.println("Using resource");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
