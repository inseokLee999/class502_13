package exam01;

public class Ex06 {
    public static void main(String[] args) throws InterruptedException{
        Thread th = new Thread(()->{
            Thread th2 = Thread.currentThread();
            int num = 0;
            while (!th2.isInterrupted()){
                System.out.println(num++);
                for(long j = 0; j< 1000000000L; j++){}
            }
        });
        th.start();

        Thread.sleep(3000);
        th.interrupt();//isInterrupted()->true
    }
}
