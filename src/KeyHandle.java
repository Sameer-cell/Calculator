import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandle implements KeyListener {

    Gui gui;

    public KeyHandle(Gui gui){
        this.gui=gui;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        if( e.getKeyCode()==KeyEvent.VK_ENTER){
            gui.lEqual.doClick();
        }
        if( e.getKeyCode()==KeyEvent.VK_ADD){
            gui.lAdd.doClick();
        }
        if( e.getKeyCode()==KeyEvent.VK_SUBTRACT){
            gui.lSub.doClick();
        }
        if( e.getKeyCode()==KeyEvent.VK_MULTIPLY){
            gui.lMultiply.doClick();
        }
        if( e.getKeyCode()==KeyEvent.VK_DIVIDE){
            gui.lDivide.doClick();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

}
