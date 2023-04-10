import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> wyzwiska = new ArrayList<>();
        wyzwiska.add("Debil");    //1
        wyzwiska.add("Faja");     //2
        wyzwiska.add("Parówa");   //3



        System.out.println(wyzwiska.contains("Pierdol się"));   // metoda ''contains'' sprawdza czy w zmiennej wyzwiska znajduje się ciąg znaków pierdol sie  //// true albo false

       // System.out.println(wyzwiska.get(2));  // metoda "get" wyświetla wskazane miejsce z listy wyzwiska

        for (String wyzwisko : wyzwiska) {
            System.out.println(wyzwisko);
        }

    }
}