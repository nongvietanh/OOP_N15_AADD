package uet.oop.bomberman.keyhandle;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandle implements KeyListener {

        public boolean upPressed;
        public boolean downPressed;
        public boolean leftPressed;
        public boolean rightPressed;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int  code = e.getKeyCode();
        if (code == KeyEvent.VK_W) {
            upPressed = true;
        }

        if (code == KeyEvent.VK_S) {
            downPressed = true;
        }

        if (code == KeyEvent.VK_D) {
            leftPressed = true;
        }

        if (code == KeyEvent.VK_A) {
            rightPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_W) {
            upPressed = false;
        }

        if (code == KeyEvent.VK_S) {
            downPressed = false;
        }

        if (code == KeyEvent.VK_D) {
            leftPressed = false;
        }

        if (code == KeyEvent.VK_A) {
            rightPressed = false;
        }
    }
}
