package exam01;

public class Outer {
    public Calculator cal = new Calculator() {
        @Override
        public int add(int num1, int num2) {
            return num1+num2;
        }
    };
    Calculator method(final int num3){
        return new Calculator(){
            public int add(int num1, int num2){
                return num1+num2+num3;
            };
        };

    }

/*
    void method(){
        class Inner{
            void method(){
                System.out.println("지역 내부 클래스!");
            }
        }
        Inner in= new Inner();
        in.method();
    }
*/
}
