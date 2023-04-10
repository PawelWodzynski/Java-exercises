import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Calendar;
import java.util.Date;

public class MouseClicker {
    public static void main(String[] args) throws AWTException, InterruptedException {
        int x = 1600;
        int y = 550;


        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 20);
        calendar.set(Calendar.MINUTE, 51);
        calendar.set(Calendar.SECOND, 0);
        Date executionTime = calendar.getTime();

        while (new Date().before(executionTime)) {
            Thread.sleep(1);
        }


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