import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner skanowanie = new Scanner(System.in);


                boolean czyKontynuować = true;

                Impreza impreza = new Impreza();

                while(czyKontynuować){

                    System.out.println("     ");//puste pole
                    System.out.println("WYBIERZ OPCJĘ");
                    System.out.println("     ");// puste pole


                    System.out.println("1. Wyświetl Gości");
                    System.out.println("2. Dodaj Gościa");
                    System.out.println("3. Wyświetl Portawy");
                    System.out.println("4. Znajdź Po Numerze Telefonu");
                    System.out.println("5. WYJDŹ");

                    int wybór = skanowanie.nextInt();
                    switch (wybór){
                        case 1 ->
                            impreza.wyświetlGościa();


                        case 2 ->
                            impreza.dodajGościa();



                        case 3 ->
                            impreza.PokażPotrawy();


                        case 4 ->
                            impreza.PokażGościaPoNumerzeTelefonu();


                        case 5 ->{
                            System.out.println(" Wybrano wyjście");
                        czyKontynuować = false;}

                        default -> {
                            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                            System.out.println("!!!!!!WYBRANO NIE WŁAŚCIWĄ OPCJE!!!!!!!");
                            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        }


                    }

                }



    }
}