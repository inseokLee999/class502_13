package exam04_nongenerics;

public class Ex01 {
    public static void main(String[] args) {
        Box appleBox = new Box();
        appleBox.setItem(new Apple());

        Apple apple =(Apple) appleBox.getItem();// 1.형 변환이 번거로움
        System.out.println(apple.get());

        Box grapeBox = new Box();
        grapeBox.setItem(new Grape());

        if(grapeBox.getItem() instanceof Apple) {// 2.타입안정성이 떨어지는 문제
            Grape grape = (Grape) grapeBox.getItem();
            System.out.println(grape.get());
        }
    }
}
