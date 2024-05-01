package Ch06.Coffee;
import java.util.Map;

public abstract class Cafe implements CoffeeShop{
    private final String name;//카페이름
    private int totalSale;//매출
    private Map<String,Integer> menus;//메뉴
    private Customer customer;
    public Cafe(String name, Map<String,Integer> menus){
        this.name = name;
        this.menus = menus;
    }

    @Override
    public CoffeeShop order(String menuName) {
        customer.money-=menus.get(menuName);
        totalSale+=menus.get(menuName);
        System.out.print(customer.CustomerName +" 님이 "+menuName+"을(를) 주문했습니다.\n");
        return this;
    }

    @Override
    public int getTotalSale() {
        return totalSale;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public CoffeeShop enter(Customer customer) {
        this.customer=customer;
        System.out.print(customer.CustomerName +" 님이 "+name+"에 입장하셨습니다.\n");
        return this;
    }

    @Override
    public CoffeeShop exit() {
        System.out.print(customer.CustomerName +" 님이 "+name+"에서 퇴장하셨습니다.\n");
        this.customer=null;
        return this;
    }
}
