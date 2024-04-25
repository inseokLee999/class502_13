package exam02;

public enum Transportation {
    BUS(1500){
        @Override
        public int getTotal(int person) {
            return getFare()*person;
        }
    },
    SUBWAY(1400){
        @Override
        public int getTotal(int person) {
            return getFare()*person;
        }
    },
    TAXI(4800){
        @Override
        public int getTotal(int person) {
            return getFare()*person;
        }
    };
    private final int fare;
    Transportation(int fare){
        this.fare=fare;
    }
    public int getFare(){
        return fare;
    }
    public abstract int getTotal(int person);
}
