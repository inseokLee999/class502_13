package Ch06.Transport;

public class Bus {
    int busNumber;// 버스 번호
    int passengerCount;//승객 수
    int money;//수입

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }
    public void take(int money){
        this.money +=money;
        passengerCount++;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busNumber=" + busNumber +
                ", passengerCount=" + passengerCount +
                ", money=" + money +
                '}';
    }
}
