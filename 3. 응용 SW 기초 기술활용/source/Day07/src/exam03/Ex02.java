package exam03;

public class Ex02 {
    public static void main(String[] args) {
        int num1=10;
        int num2=0;
        try{
            int num3=num1/num2;//ArithmeticException //throw new Arithmetic exception
            System.out.println(num3);
        }catch(ArithmeticException e){
            //String message = e.getMessage();
            //System.out.println(message);
            e.printStackTrace();
        }
        System.out.println("Important code");
    }
}
