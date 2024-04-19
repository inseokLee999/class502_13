package exam01;

public class Board {
    private Board() {};
    private static Board instance;

    static{
        System.out.println("처음부터 실행, 객체 생성과 관련 없이");
    }
    public static Board getInstance(){
        if(instance==null) {
            instance=new Board();
        }
        return instance;
    }
}
