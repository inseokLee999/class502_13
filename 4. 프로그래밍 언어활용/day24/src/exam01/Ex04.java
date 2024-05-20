package exam01;

public class Ex04 {
    public static void main(String[] args) throws InterruptedException{
        Runnable r1 = ()->{
            for(int i=0;i<300;i++){
                System.out.print("-");
                for(long j = 0;j<10000000l;j++);
            }
        };
        Runnable r2 = ()->{
            for(int i=0;i<300;i++){
                System.out.print("=");
                for(long j = 0;j<10000000l;j++);
            }
        };
        Thread th1 = new Thread(r1);
        Thread th2 = new Thread(r2);
        th1.setPriority(Thread.MAX_PRIORITY);
        th2.setPriority(Thread.MIN_PRIORITY);
        System.out.printf("th1 : %d, tht2 : %d%n",th1.getPriority(),th2.getPriority());
        th1.start();//th1 thread
        th2.start();//th2 thread
        th1.join();
        th2.join();
        System.out.println("작업종료");//main
    }
}
