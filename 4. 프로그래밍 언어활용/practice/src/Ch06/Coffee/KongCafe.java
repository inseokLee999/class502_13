package Ch06.Coffee;

public class KongCafe {
    String coffee;// 커피이름
    int soldCount;
    int money;//수입

    public KongCafe(String coffee) {
        this.coffee = coffee;
    }
    public void take(int money){
        this.money +=money;
        soldCount++;
    }

    @Override
    public String toString() {
        return "KongCafe{" +
                "coffee='" + coffee + '\'' +
                ", soldCount=" + soldCount +
                ", money=" + money +
                '}';
    }
}
