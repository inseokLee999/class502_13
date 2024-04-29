package Ch06.Coffee;

public class StarCafe {
    String coffee;// 커피이름
    int soldCount;
    int money;

    public StarCafe(String coffee){
        this.coffee=coffee;
    }
    public void take(int money){
        this.money+=money;
        soldCount++;
    }
    public String toString() {
        return "StarCafe{" +
                "coffee='" + coffee + '\'' +
                ", soldCount=" + soldCount +
                ", money=" + money +
                '}';
    }
}
