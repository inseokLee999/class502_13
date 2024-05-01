package Ch06.Coffee;

public class Customer {
    public String CustomerName;
    public int money;

    public Customer (String CustomerName, int money){
        this.CustomerName = CustomerName;
        this.money = money;
    }
    @Override
    public String toString() {
        return CustomerName + "의 남은 돈 "+money+"입니다\n";
    }
}
