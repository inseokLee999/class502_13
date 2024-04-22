package exam04;

public interface Buyer {
    void buy();

    default void order(){ //public
        System.out.println("Order by buyer!");
        privateMethod();
    }
    public static void staticMethod(){
        System.out.println("Static method!");
    }
    private void privateMethod(){
        System.out.println("Private method!");
    }
}