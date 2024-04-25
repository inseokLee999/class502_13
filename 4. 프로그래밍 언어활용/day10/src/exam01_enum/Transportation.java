package exam01_enum;

public enum Transportation {
    BUS(1500),
    METRO(1400),
    WALK(0),
    TAXI(4800);
    private final int fare;
    Transportation(int fare) {
        this.fare = fare;
    }
    public int getFare(){
        return fare;
    }
    //public abstract int getTotal(int person);
}
