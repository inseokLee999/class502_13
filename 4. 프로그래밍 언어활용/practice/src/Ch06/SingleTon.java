package Ch06;

public class SingleTon {
    private SingleTon(){}
    private static SingleTon instance = new SingleTon();
    public static SingleTon getInstance(){
        if(instance == null){
            instance = new SingleTon();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        SingleTon singleTon1 = singleTon.getInstance();
        System.out.println(singleTon==singleTon1);
    }
}
