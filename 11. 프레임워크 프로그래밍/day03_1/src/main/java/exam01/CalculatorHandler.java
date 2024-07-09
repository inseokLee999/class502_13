package exam01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CalculatorHandler implements InvocationHandler {

    private Object obj;

    public CalculatorHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass());//Calculator interface를 proxy 로 만들어 놓는다.
        long stime = System.nanoTime();//공통 기능
        try {
            Object result = method.invoke(obj, args);//Calculator factorial 호출 / 핵심기능을 대신 수행
            return result;
        } finally {
            long etime = System.nanoTime();
            System.out.printf("걸린 시간 : %d%n", etime - stime); //공통기능
        }
    }
}
