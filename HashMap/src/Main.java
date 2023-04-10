import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String,String> NazwaPosilku = new HashMap<>();  // tutaj tez nie ma duplikatow put.("kamil" "parówa")   zastapi banana na parówe
        NazwaPosilku.put("Kamil","Banan");       // w nawiasie wstawiamy co ma być za stringa w HashMap  Kamil-String1   Banan-String2

      //  System.out.println(NazwaPosilku.get("Kamil"));          // wyświetli mi co kamil chce zjeśc

        Set<String> klucze = NazwaPosilku.keySet();
        for (String klucz : klucze){
            System.out.println(klucz);                  // klucze to jest String1 w tym przypadku kamil      String2 to są wartości

            //wartości : interfejs collection

            Collection<String> wartosci = NazwaPosilku.values();
            for(String wartosc : wartosci){
                System.out.println(wartosc);
            }


        }
    }
}

