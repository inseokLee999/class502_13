package exam06;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class A extends MouseAdapter { // MouseListener 인터페이스 기본 클래스

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
    }
}
