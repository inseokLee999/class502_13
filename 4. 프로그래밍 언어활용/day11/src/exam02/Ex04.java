package exam02;

public class Ex04 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());

        Juicer.make2(appleBox);//Apple, Fruit, Object

//        FruitBox<Grape> grapeBox = new FruitBox<>();
        FruitBox<Fruit> grapeBox = new FruitBox<Fruit>();
        grapeBox.add(new Grape()); // grape는 fruit이 될 수 있기 때문에 Fruit fruit = new Grape();

        Juicer.make2(grapeBox);
    }
}
