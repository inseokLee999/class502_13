package Day06.exam03;

public interface Seller {
    void sell();

    default void order(){
        System.out.println("Order by seller!");
    }
}
