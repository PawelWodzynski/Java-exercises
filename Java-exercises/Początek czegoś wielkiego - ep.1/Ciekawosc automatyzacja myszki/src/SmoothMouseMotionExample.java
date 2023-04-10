import java.awt.*;
import java.awt.event.*;

public class SmoothMouseMotionExample extends Frame implements MouseMotionListener {
    private int x = 0;
    private int y = 0;

    public SmoothMouseMotionExample() {
        super("Smooth Mouse Motion Example");

        addMouseMotionListener(this);

        setSize(300, 300);
        setVisible(true);
    }

    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mouseDragged(MouseEvent e) {}

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.RED);
        g.fillOval(x - 5, y - 5, 10, 10);
    }

    public static void main(String[] args) {
        new SmoothMouseMotionExample();
    }
}
