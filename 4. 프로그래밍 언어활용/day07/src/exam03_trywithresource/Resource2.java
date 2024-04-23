package exam03_trywithresource;

public class Resource2 implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Close resource");
    }
}
