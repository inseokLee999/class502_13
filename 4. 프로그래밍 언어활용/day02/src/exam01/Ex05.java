package exam01;

import java.lang.reflect.Method;

public class Ex05 {
    public static void main(String[] args) {
        Class cls=Student.class;
        System.out.println(cls);
        Method[] methods=cls.getMethods();
        for(Method method:methods){
            System.out.println(method);
        }
    }
}
