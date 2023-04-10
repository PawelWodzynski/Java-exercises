import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DyskSSD implements Dysk{

    Map<String, Plik> pliki = new HashMap<>();
    @Override
    public void DodajPlik(Plik plik) {
    pliki.put(plik.toString(), plik);

    }

    @Override
    public void ListaPlików() {

        Collection<Plik> KolekcjaPlikow =pliki.values();
        for (Plik plik : KolekcjaPlikow){
            System.out.println(plik.getNazwa());
        }
    }

    @Override
    public Plik znajdzPlik(String nazwa) {
        return pliki.get(nazwa);

    }
}
