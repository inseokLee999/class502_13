package Ch06.Coffee2;

public class Person {
    private String name;//사람이름
    private int money;//소지금
    private String menu;//원하는 메뉴

    public Person(String name,int money){
        this.name = name;
        this.money = money;
    }
    public String getName(){
        return name;
    }
    public int getMoney(){
        return money;
    }
    public void setMoney(int money){
        this.money=money;
    }
    public String getMenu(){
        return menu;
    }
    public void setMenu(String menu){
        this.menu=menu;
    }
    public String toString(){
        return String.format("%s 님의 남은 금액은 %d %n",name,money);
    }
}
