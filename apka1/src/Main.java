import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner zmienna = new Scanner(System.in);



        boolean czyKontynuować = true;

                while(czyKontynuować) {
                    System.out.println("wybierz opcje");
                    System.out.println("1. Wyświetl Gości");
                    System.out.println("2. Dodaj Gościa");
                    System.out.println("3. Wyświetl Potrawy");
                    System.out.println("4. Znajdź po numerze telefonu");
                    System.out.println("5. Wyjście");


                    int wybor = zmienna.nextInt();

                    switch (wybor) {
                        case 1 -> czyKontynuować = false;
                        case 2 -> czyKontynuować = false;
                        case 3 -> czyKontynuować = false;
                        case 4 -> czyKontynuować = false;
                        case 5 -> czyKontynuować = false;
                    }
                }



//                    Tak wygląda stara konstrukcja switch przed javą 12 ||
//                                                                       \/
//                    switch (wybor) {
//                        case 1:
//                            System.out.println("Wybrano 1");
//                            break;
//
//                        case 2:
//                            System.out.println("Wybrano 2");
//                            break;
//
//                        case 3:
//                            System.out.println("Wybrano 3");
//                            break;
//
//                        case 4:
//                            System.out.println("Wybrano 4");
//                            break;
//
//                        case 5:
//                            System.out.println("Wybrano wyjście");
//                            czyKontynuować = false;
//                            break;
//
//
//                            default:
//                            System.out.println("Nie znaleziono takiej opcji");
//                    }
//                }


}