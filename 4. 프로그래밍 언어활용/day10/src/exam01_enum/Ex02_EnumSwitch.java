package exam01_enum;

public class Ex02_EnumSwitch {
    public static void main(String[] args) {
        Transportation trans = Transportation.BUS;
        Enum<Transportation> trans2 = trans;
        System.out.println(trans instanceof Enum<?>);
        switch(trans){
            case BUS:
                System.out.println("버스");
                break;
            case METRO:
                System.out.println("지하철");
                break;
            case WALK:
                System.out.println("도보");
                break;
        }
    }
}
