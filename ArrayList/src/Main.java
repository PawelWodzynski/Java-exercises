import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> zwierzeta = new ArrayList<>();
        zwierzeta.add("Sarna");    //1
        zwierzeta.add("Jeleń");     //2
        zwierzeta.add("Dzik");   //3



        System.out.println(zwierzeta.contains("Słoń"));   // metoda ''contains'' sprawdza czy w zmiennej zwierzeta znajduje się ciąg znaków Słoń  //// true albo false

       // System.out.println(zwierzeta.get(2));  // metoda "get" wyświetla wskazane miejsce z listy wyzwiska

        for (String zwierze : zwierzeta) {
            System.out.println(zwierze);
        }

    }
}