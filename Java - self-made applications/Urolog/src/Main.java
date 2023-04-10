import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /////////////   PRZYWITANIE  /////////////
        System.out.println("\n \u001B[1m\u001B[31mUrologApp.exe\u001B[0m\u001B[0m \n");
        String przywitanie = "\u001B[4m\u001B[32mDr.Etker\u001B[0m\u001B[0m \n Witaj w naszej aplikacji urologicznej! \n Cieszymy się, że zdecydowałeś się skorzystać z naszego narzędzia, które pomoże Ci dbać o zdrowie Twojego układu moczowego.\n Nasza prosta aplikacja urologiczna umożliwi Ci śledzenie wielu ważnych parametrów zdrowotnych. \n Przypomni o ważnych terminach badań urologicznych i dostarczy przydatnych wskazówek dotyczących diety i stylu życia. \n Dzięki temu będziesz miał większą kontrolę nad swoim zdrowiem, a my z przyjemnością pomożemy Ci w tym procesie. ";
        for (int i = 0; i < przywitanie.length(); i++){
            System.out.print(przywitanie.charAt(i));
            try{
                Thread.sleep(1 ); //milis 30
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        /////////////   PYTANIE O IMIE  /////////////


            Scanner skanowanie = new Scanner(System.in);
            System.out.println("\n\u001B[4m\u001B[32mDr.Etker\u001B[0m\u001B[0m \n Jak się nazywasz?");
            String ImieUzytkownika = skanowanie.nextLine();

            System.out.println("\n\u001B[4m\u001B[32mDr.Etker\u001B[0m\u001B[0m");

            String WybierzSwojProblem = "Dobrze " + ImieUzytkownika + ",wybierz z listy odpowiednią pozycje w której chcesz byśmi tobie pomogli";
            for (int i = 0; i < WybierzSwojProblem.length(); i++) {
                System.out.print(WybierzSwojProblem.charAt(i));
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


            int FacetCzyKobieta = 1;    // 1= Facet | 2=kobieta

            if (ImieUzytkownika.endsWith("a")) {
                FacetCzyKobieta = 2;
            }








        /////////////  LISTA POZYCJI  /////////////
        System.out.println("\n1. Sprawdź czy masz dobry wynik badań labolatoryjnych moczu.\n2. Nie trzymanie moczu \n3. Częste oddawanie moczu. " +
                "\n4. Krwiomocz. \n5. Bóle w dolnej części brzucha. \n6. Ból lub pieczenie podczas oddawania moczu. \n7. Cykliczne badania urlogiczne. \n8. Znajdź swój wynik badań po numerze. \n9. WYJŚCIE");

        /////////////  SWITCH  /////////////

        boolean PetlaSwitch = true;
        int wybor= 0;



        SprawdzanieBadan sprawdzanieBadan = new SprawdzanieBadan();




        while(PetlaSwitch) {


            String wejscie = skanowanie.nextLine();
            try {
                wybor = Integer.parseInt(String.valueOf(wejscie));    // konwertuje wartość na liczbę jeśli konwersja się nie powiedzie czyli użytkownik wprowadzi literę  łapiemy wyjątek NumberFormatException i wyświetlamy komunikat o błędzie. W przeciwnym razie używamy instrukcji switch, aby wykonać odpowiednie działanie na podstawie wybranego numeru.
            }catch (NumberFormatException e){                        //Jeśli wartość String nie reprezentuje poprawnej liczby całkowitej, metoda wrzuci wyjątek NumberFormatException.
                System.out.println("\u001B[31mMusisz wprowadzić numer!!!\u001B[0m");
                continue;
            }




            switch (wybor) {
                case 1 -> {PetlaSwitch = false;
                    sprawdzanieBadan.badania();

                }
                case 2 -> {PetlaSwitch = false;
                }
                case 3 -> {PetlaSwitch = false;
                }
                case 4 -> {PetlaSwitch = false;
                }
                case 5 -> {PetlaSwitch = false;
                }
                case 6 -> {PetlaSwitch = false;
                }
                case 7 -> {PetlaSwitch = false;
                }
                case 8 -> {
                    System.out.println("To jest cięzkie do zrealizowania dlatego będe nad tym pracował, aplikacja lekarza który może wrzucić dane z pobrania moczu");
                }
                case 9 -> {
                    System.out.println("WYBRANO WYJŚCIE");
                    PetlaSwitch = false;
                }
                default -> {
                    System.out.println("\u001B[31mNie znaleziono takiej opcji. \nSpróbuj ponownie.\u001B[0m");
                }
            }
        }
//dodać do case 8 : Wprowadź cyfrę 1 jeśli nie wiesz gdzie znaleźć swój numer na karcie wyników badań ``` stworzyć apke która będzie tworzyć karte wyniku badań
// stworzyć aplikacje do wprowadzania wyników badań



    }
}