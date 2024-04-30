package Ch06.Coffee2;

import java.util.HashMap;
import java.util.Map;

public class CoffeeBean extends AbstractCoffeeShop{
    private static Map<String,Integer> menus;

    static {
        menus=new HashMap<>();
        menus.put("Americano",3800);
        menus.put("CafeLatte",4300);
        menus.put("CafeMoca",4800);
    }

    public CoffeeBean(){
        super("CoffeeBean",menus);
    }
}
