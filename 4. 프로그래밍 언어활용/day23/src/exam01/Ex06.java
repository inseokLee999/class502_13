package exam01;

import javax.swing.*;

public class Ex06 {
    public static void main(String[] args) throws InterruptedException{

        Thread th = new Thread(()->{
        String message = JOptionPane.showInputDialog("메세지입력");
        //블로킹
            System.out.println(message);
        });
        th.start();
        for(int i =1;i<=10;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
