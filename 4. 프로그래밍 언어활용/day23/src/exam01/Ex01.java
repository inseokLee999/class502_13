package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Runnable r = ()->{
            for(int i=0;i<5;i++){
                System.out.println("쓰레드2-"+i);
                for(long j = 0;j<1000000000L;j++);
            }
        };
        Ex01_01 th1 = new Ex01_01();
        Thread th2 = new Thread(r);
        th1.run();
        th2.run();
        th1.start();//호출스택 생성 + run() 메서드 실행
        System.out.println("작업종료");
    }
}
class Ex01_01 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("스레드1-"+i);
        }
    }
}
