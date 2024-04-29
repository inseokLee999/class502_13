package Ch06.Coffee;
public class TakeCoffee {
    public static void main(String[] args) {
        Customer Kim = new Customer("김씨",10000);
        Customer Lee = new Customer("이씨",10000);

        StarCafe starCafe = new StarCafe("Americano");
        KongCafe kongCafe = new KongCafe("Latte");
        Kim.buyStarCoffee(starCafe);
        Lee.buyKongCoffee(kongCafe);
        System.out.println(Kim);
        System.out.println(Lee);
        System.out.println(starCafe);
        System.out.println(kongCafe);
    }
}
