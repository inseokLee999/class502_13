package exam01;

import javax.swing.*;

public class Ex05 {
    public static void main(String[] args) throws InterruptedException {
        String message = JOptionPane.showInputDialog("메세지입력");
        for(int i = 1;i<=10;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
