package exam04;

public class Ex01 {
    public static void main(String[] args) {
        Order order=new Order();
        order.buy();
        order.sell();
        Buyer.staticMethod();
        Seller seller=order;
        seller.sell();
        System.out.println(seller instanceof Order);

        Buyer buyer=order;
        buyer.buy();
        System.out.println(buyer instanceof Order);
    }
}