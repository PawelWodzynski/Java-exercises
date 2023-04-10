import static jdk.jfr.consumer.EventStream.openFile;

public class Main {
    public static void main(String[] args) {
        String command = "open";
        switch (command){
            case "open":
                System.out.println("sklep otwarty");
                break;
            case"close":
                System.out.println("sklep zamknięty");
                break;
        }
    }

    private static void openFile() {
    }
}