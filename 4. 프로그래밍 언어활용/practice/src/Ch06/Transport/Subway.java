package Ch06.Transport;

public class Subway {
    String lineNumber;// 노선 번호
    int passengerCount;
    int money;

    public Subway(String lineNumber){
        this.lineNumber=lineNumber;
    }
    public void take(int money){
        this.money+=money;
        passengerCount++;
    }

    @Override
    public String toString() {
        return "Subway{" +
                "lineNumber='" + lineNumber + '\'' +
                ", passengerCount=" + passengerCount +
                ", money=" + money +
                '}';
    }
}
