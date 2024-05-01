package exam02;

public class Ex02 {
    public static void main(String[] args) {
        int c=10;
        Calculator cal = (t,b)-> t+b+c;
//        Calculator cal = (num1, num2) -> {
//            if (num1<num2){
//                return num1;
//            }else if(num1>num2){
//                return num2;
//            }
//            return 0;
//        };
        System.out.println(cal.add(10,20));
    }
}
