import java.awt.Robot;
import java.awt.event.InputEvent;

public class Main {
    public static void main(String[] args) throws Exception {
        int x = 1600; // położenie X na ekranie           CENA
        int y = 550; // położenie Y na ekranie

        Robot robot = new Robot();
//
        robot.delay(350);
        robot.mouseMove(x, y); // przesunięcie kursora myszy na pozycję (x, y)
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // symulacja wciśnięcia lewego przycisku myszy
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // symulacja zwolnienia lewego przycisku myszy

        int z = 1600;
        int p = 620;

        robot.delay(350);
        robot.mouseMove(z, p);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//
//        int g = 710;
//        int h = 70;
//
//        robot.delay(350);
//        robot.mouseMove(g, h);
//        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//
//        int t = 800;
//        int j = 70;
//
//        robot.delay(350);
//        robot.mouseMove(t, j);
//        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//
//        robot.delay(350);
//        robot.mouseMove(x, y); // przesunięcie kursora myszy na pozycję (x, y)
//        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // symulacja wciśnięcia lewego przycisku myszy
//        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // symulacja zwolnienia lewego przycisku myszy





    }
}