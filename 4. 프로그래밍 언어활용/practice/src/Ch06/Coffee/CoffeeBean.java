package Ch06.Coffee;

import java.util.HashMap;
import java.util.Map;

public class CoffeeBean extends Cafe{
    private static Map<String, Integer> menus;
    static{
        menus=new HashMap<>();
        menus.put("Americano",3800);
        menus.put("CafeLatte",4300);
        menus.put("CafeMoca",4800);
    }
    public CoffeeBean() {
        super("CoffeBean", menus);
    }
}
