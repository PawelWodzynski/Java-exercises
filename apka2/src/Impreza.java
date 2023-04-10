import com.sun.jdi.IntegerValue;

import java.util.*;

public class Impreza{
    private List<Goście> goście = new ArrayList<>();
    private Set<String> potrawa = new HashSet<>();
    private Map<Integer , Goście> NumerDoGościa = new HashMap<>();

    Scanner skanowanie = new Scanner(System.in);
    public void dodajGościa(){
        System.out.println("Podaj Imię Gościa");
        String imie = skanowanie.nextLine();

        System.out.println("Podaj preferowany posiłek");
        String potrawaDlaGościa = skanowanie.nextLine();

        System.out.println("Podaj numer telefonu");
        int numerTelefonu = Integer.valueOf(skanowanie.nextLine());

        System.out.println("Czy jest wege?     (TAK/NIE)");
        String czyJestWegeString = skanowanie.nextLine();

        boolean jestWege;

        if (czyJestWegeString.equals("TAK")){
            jestWege = true;
        }else {
            jestWege = false;
        }


        Goście gość = new Goście(imie , potrawaDlaGościa , numerTelefonu , jestWege);
        potrawa.add(potrawaDlaGościa);
        NumerDoGościa.put(NumerDoGościa.size(), gość);
        goście.add(gość);
    }

    public void PokażPotrawy(){
        for (String potrawy : potrawa){
            System.out.println(potrawy);
        }
    }

    public void PokażGościaPoNumerzeTelefonu(){
            Integer NumerTelefonu = Integer.valueOf(skanowanie.nextLine());
            Goście goście = NumerDoGościa.get(NumerTelefonu);
            goście.pokażGości();
    }

    public void wyświetlGościa(){
        for (Goście gość : goście){
            gość.pokażGości();
        }

    }
}
