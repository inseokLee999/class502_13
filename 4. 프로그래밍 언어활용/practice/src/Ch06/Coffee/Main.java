package Ch06.Coffee;

public class Main {
    public static void main(String[] args) {
        Customer Kim = new Customer("김씨",10000);
        Customer Lee = new Customer("이씨",10000);

        CoffeeBean coffeeBean = new CoffeeBean();
        StarBucks starBucks = new StarBucks();
        try {
            starBucks.enter(Kim).order("Americano").exit();
            coffeeBean.enter(Lee).order("CafeLatte").exit();
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        System.out.print(Kim);
        System.out.print(Lee);

        CoffeeShop.showSaleSummary(coffeeBean);
        CoffeeShop.showSaleSummary(starBucks);
    }
}
