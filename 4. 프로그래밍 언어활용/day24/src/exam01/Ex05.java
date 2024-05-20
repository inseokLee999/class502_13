package exam01;

public class Ex05 {
    private static boolean autoSave = false;

    public static void main(String[] args) {
        Thread th = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                }

                if (autoSave) {
                    System.out.println("저장!");
                }

            }
        });
        th.setDaemon(true);//현재 작업중인 스레드가 종료 되면 th 도 함께 종료
        th.start();
        for (int i = 0; i <= 10; i++) {
            Thread th2 = Thread.currentThread();
            System.out.println(th2.getName() + "-" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            if (i == 3) autoSave = true;
        }
    }
}
