package Ch11;

import java.lang.reflect.Method;

public class Ex03 {
    public static void main(String[] args) {
        String s = new String();
        Class c = s.getClass();
        System.out.println(c);

        Class c2 = String.class;
        System.out.println(c2);
        Method[] methods = c.getMethods();
        for(Method m : methods){
            System.out.println(m);
        }
    }
}
