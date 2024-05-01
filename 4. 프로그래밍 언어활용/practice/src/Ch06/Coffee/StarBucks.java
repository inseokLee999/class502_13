package Ch06.Coffee;

import java.util.HashMap;
import java.util.Map;

public class StarBucks extends Cafe{
    private static Map<String, Integer> menus;
    static{
        menus=new HashMap<>();
        menus.put("Americano",4000);
        menus.put("CafeLatte",4500);
        menus.put("CafeMoca",5000);
    }
    public StarBucks() {
        super("StarBucks", menus);
    }
}
