package exam03;

public class Ex03 {
    public static void main(String[] args) {
        Human human = new Human();
        human.move();

        Animal animal=new Animal();
        animal.move();

        Tiger tiger=new Tiger();
        tiger.move();

        FrozenCat frozenCat=new FrozenCat();
        frozenCat.move();
    }
}
