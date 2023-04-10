import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> posilki = new HashSet<>();     // w HashSet nie możliwe są duplikaty

        posilki.add("Zupa");
        posilki.add("Cziken");
        posilki.add("Twoja stara z rożna");

       // System.out.println(posilki);   // wyświetli w ten sposób posiłki - [Twoja stara z rożna, Zupa, Cziken]

        for ( String posilek : posilki) {
            System.out.println(posilek);           // for wyświetli je pod sobą
        }

    }
}