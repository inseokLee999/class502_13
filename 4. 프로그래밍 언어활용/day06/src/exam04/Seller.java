package exam04;

public interface Seller {
    void sell();

    default void order(){
        System.out.println("Order by seller!");
    }
}