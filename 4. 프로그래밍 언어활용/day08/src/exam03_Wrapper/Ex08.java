package exam03_Wrapper;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex08 {
    public static void main(String[] args) {
        Class cls1=Person.class;
        Field[] fields= cls1.getFields();
        Method[] methods=cls1.getMethods();
        Constructor[] constructors=cls1.getConstructors();
        System.out.println("----------Fields----------");
        for(Field field:fields){
            System.out.println(field);
        }
        System.out.println("----------Methods----------");
        for(Method method:methods){
            System.out.println(method);
        }
        System.out.println("----------Constructors----------");
        for(Constructor constructor:constructors){
            System.out.println(constructor);
        }

        Person person = new Person();
        Class cls2= person.getClass();// 클래스 내부에서 사용할 목적
    }
}
