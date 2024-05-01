package Ch06.Coffee;

public interface CoffeeShop {
    CoffeeShop order(String menuName);
    CoffeeShop enter(Customer customer);
    CoffeeShop exit();
    int getTotalSale();
    String getName();
    public static void showSaleSummary(CoffeeShop shop){
        System.out.printf("%s 의 총 매출액은 %d 원 입니다.%n",shop.getName(),shop.getTotalSale());
    }
}
