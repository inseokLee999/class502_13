package exam02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex01 {
    public static void main(String[] args) {
        java.lang.String str="ABC";
        Class cls=Book.class;
        System.out.println("Fields");
        Field[] fields=cls.getFields();
        for(Field field: fields){
            System.out.println(field);
        }
        System.out.println("methods");
        Method[] methods= cls.getMethods();
        for(Method method:methods){
            System.out.println(method);
        }
        System.out.println("Constructors---");
        Constructor[] constructors=cls.getConstructors();
        for(Constructor constructor:constructors){
            System.out.println(constructor);
        }
    }
}
