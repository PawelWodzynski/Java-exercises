import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DyskHDD implements Dysk {

    List<Plik> pliki = new ArrayList<>();
    @Override
    public void DodajPlik(Plik plik) {
        pliki.add(plik);
    }

    @Override
    public void ListaPlików() {
     for (Plik plik : pliki){
         System.out.println(plik.getNazwa());
     }


    }

    @Override
    public Plik znajdzPlik(String nazwa) {

        Optional<Plik> znajdzPlik = pliki.stream()
                .filter(plik -> plik.getNazwa().equals(nazwa))
                .findFirst();
        return znajdzPlik.orElseThrow();
    }
}
