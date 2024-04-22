package exam03;

public class Ex03 {
    public static void main(String[] args) {
        //NPE Null Pointer Exception 비어있는곳에 접근
        try {
            int num1 = 10;
            int num2 = 0;
            int num3 = num1 / num2;
            System.out.println(num3);

            String str = null;
            str.toUpperCase();
            System.out.println(str.toUpperCase());//NullPointerException
        }
        catch (ArithmeticException | NullPointerException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Important Code");
    }
}
