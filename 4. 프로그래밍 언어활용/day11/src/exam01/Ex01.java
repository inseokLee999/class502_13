package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();//<Apple>안의 Apple은 생략 가능
        appleBox.setItem(new Apple());
        // appleBox.setItem(new Grape()); //타입 안정성 확보
        Apple apple = appleBox.getItem();
        System.out.println(appleBox);//appleBox.toString()
    }
}
