package exam02_ErrorException;

public class Ex01 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 2;
            int result = num1 / num2;

            String str=null;
            System.out.println(str.toUpperCase());//NullPointerException
            System.out.println(result);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }catch(NullPointerException e){
            e.printStackTrace();
        }
        System.out.println("Important Code");
    }
}
