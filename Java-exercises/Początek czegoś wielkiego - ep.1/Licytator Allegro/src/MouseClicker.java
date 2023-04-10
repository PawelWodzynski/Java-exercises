import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Calendar;
import java.util.Date;

public class MouseClicker {
    public static void main(String[] args) throws AWTException, InterruptedException {
        int x = 1600; // współrzędna x
        int y = 550; // współrzędna y

        // ustawiamy godzinę wykonania kliknięcia
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 20); // godzina
        calendar.set(Calendar.MINUTE, 51); // minuta
        calendar.set(Calendar.SECOND, 0); // sekunda
        Date executionTime = calendar.getTime();

        // oczekujemy na godzinę wykonania
        while (new Date().before(executionTime)) {
            Thread.sleep(1); // czekamy sekundę
        }

        // wykonujemy kliknięcie myszy
        Robot robot = new Robot();
        robot.mouseMove(x, y);
//        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        int licytacja_x = 1600;
                int licytacja_y=620;


        robot.mouseMove(licytacja_x, licytacja_y);
//        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

    }
}