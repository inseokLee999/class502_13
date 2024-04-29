package Ch06.Coffee;

import Ch06.Transport.Bus;
import Ch06.Transport.Subway;

public class Customer {
    public String Customername;
    public int money;

    public Customer (String Customername, int money){
        this.Customername = Customername;
        this.money = money;
    }
    public void buyStarCoffee(StarCafe starCafe){
        starCafe.take(4000);
        this.money-=4000;
    }
    public void buyKongCoffee(KongCafe kongCafe){
        kongCafe.take(4500);
        this.money-=4500;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Customername='" + Customername + '\'' +
                ", money=" + money +
                '}';
    }
}
