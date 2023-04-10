import java.util.InputMismatchException;
import java.util.Scanner;

public class SprawdzanieBadan {
    Scanner skanowanie = new Scanner(System.in);
    public void badania() {
        System.out.println("\n\u001B[4m\u001B[32mDr.Etker\u001B[0m\u001B[0m");
        String wstęp = "Znajdujesz się teraz w dziale sprawdzania badań. \nPytania odnośnie twoich wyników będe zadawane w takiej samej kolejności jak masz je na swojej karcie wyników. \nWybierz odpowiednią pozycje która zgadza się z twoimi wynikami. \nWyjątkiem jest pierwsze pytanie na które odpowiadasz zgodnie ze stanem teraźniejszym.";
        for( int i = 0; i<wstęp.length(); i++){
            System.out.print(wstęp.charAt(i));
            try{
                Thread.sleep(30); //milis 30
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        ///////Wygląd moczu///////
        System.out.println("\n\u001B[4m\u001B[32mDr.Etker\u001B[0m\u001B[0m\nJaki jest wygląd twojego moczu? \n1. Klarowny \n2. Lekko Mętny \n3. Pienisty");

        boolean WygladMoczu = true;
        int WyborWygladMocz = 0;
        int ZlyWyborWygladMocz= 3;

        while (WygladMoczu){
            String WejscieWygladMoczu = skanowanie.nextLine();
            try{
                WyborWygladMocz = Integer.parseInt(String.valueOf(WejscieWygladMoczu));
            }catch (NumberFormatException e){
                System.out.println("\u001B[31mMusisz wprowadzić numer od 1 do 3!!!\u001B[0m");
                continue;
            }
               if (WyborWygladMocz > ZlyWyborWygladMocz){
                   System.out.println("\u001B[31mMusisz wprowadzić numer od 1 do 3!!!\u001B[0m");
               }else {
                   System.out.println("\033[33mWybrano liczbe\033[0m " + WyborWygladMocz);
                   WygladMoczu = false;
               }
        }




        /////// Kolor moczu///////
        System.out.println("\n\u001B[4m\u001B[32mDr.Etker\u001B[0m\u001B[0m \nJaki jest twój kolor moczu? \n1. Jasnożółty \n2. Słomkowy \n3. Ciemnożółty \n4. Czerwony \n5. Bezbarwny");

        boolean KolorMocz = true;
        int WyborKolorMocz =0;
        int ZlyWyborKolorMocz = 5;

        while(KolorMocz) {

                String WejscieKolorMocz = skanowanie.nextLine();
                try {
                    WyborKolorMocz = Integer.parseInt(String.valueOf(WejscieKolorMocz));
                } catch (NumberFormatException e) {
                    System.out.println("\u001B[31mMusisz wprowadzić numer od 1 do 5!!!\u001B[0m");
                    continue;
                }

                if(WyborKolorMocz > ZlyWyborKolorMocz){
                    System.out.println("\u001B[31mMusisz wprowadzić numer od 1 do 5!!!\u001B[0m");
            }else{
                    System.out.println("\033[33mWybrano liczbe\033[0m " + WyborKolorMocz);
                    KolorMocz = false;
            }
        }

        ///////pH Mocz///////

        double pHmoczu;
        System.out.println("\n\u001B[4m\u001B[32mDr.Etker\u001B[0m\u001B[0m \nJakie jest pH twojego moczu?");


        do {
            System.out.println("\u001B[31mWpisz ręcznie uwzględniając przecinek po między liczbami!!!\u001B[0m\n\u001B[1m\u001B[31mPrzykład: 4,6\u001B[0m\u001B[0m");
                 while (!skanowanie.hasNextDouble()){
                System.out.println("\u001B[31mNie wprowadzono liczby po przecinku!!!\u001B[0m");
                skanowanie.next();
           }

            pHmoczu = skanowanie.nextDouble();

        }while(pHmoczu == (long)pHmoczu);

        System.out.println("\033[33mWprowadzono\033[0m " + pHmoczu);

        ///////Gęstość Moczu///////


        System.out.println("\n\u001B[4m\u001B[32mDr.Etker\u001B[0m\u001B[0m \nJaka jest gęstość twojego moczu? \nUwzględnij to z dokładnością trzech miejsc po przecinku\n\u001B[1m\u001B[31mPrzykład:\n1,005\n1,030\u001B[0m\u001B[0m ");


        double GestoscMoczu;


        do {
            System.out.println("\u001B[31mWpisz ręcznie uwzględniając przecinek po między liczbami!!!\u001B[0m\n\u001B[1m\u001B[31mPrzykład: 1,025\u001B[0m\u001B[0m");
            while (!skanowanie.hasNextDouble()) {
                System.out.println("\u001B[31mNie wprowadzono liczby po przecinku!!!\u001B[0m");
                skanowanie.next();
            }

            GestoscMoczu = skanowanie.nextDouble();

        } while (GestoscMoczu == (long)GestoscMoczu);

        System.out.println("\033[33mWprowadzono\033[0m " + GestoscMoczu);


        ///////Białko///////

        System.out.println("\n\u001B[4m\u001B[32mDr.Etker\u001B[0m\u001B[0m\nPodaj ilość białka w moczu\n\u001B[31mPrzykład:\u001B[0m\n Jeśli ilość jest podana w mg/dl wprowadź:\n\u001B[31m0,04\n0,12\u001B[0m\n Jeśli jest to ilość podana w g/dl wprowadź:\n\u001B[31m1,5\u001B[0m");

        double BialkoMoczu;

        do {
            System.out.println("\u001B[31mWpisz ręcznie uwzględniając przecinek po między liczbami!!!\u001B[0m");
            while (!skanowanie.hasNextDouble()){
                System.out.println("\u001B[31mNie wprowadzono liczby po przecinku!!!\u001B[0m");
                skanowanie.next();
            }

            BialkoMoczu = skanowanie.nextDouble();

        }while(BialkoMoczu == (long)BialkoMoczu);

        System.out.println("\033[33mWprowadzono\033[0m " + BialkoMoczu);

        ///////Glukoza///////
        System.out.println("\n\u001B[4m\u001B[32mDr.Etker\u001B[0m\u001B[0m\n Podaj ilość glukozy w moczu w mg/dl\n\u001B[31mPrzykład:\u001B[0m\n\u001B[31m0,10\u001B[0m\n\u001B[31m0,180\u001B[0m");

        double GlukozaMocz;

        do {
            System.out.println("\u001B[31mWpisz ręcznie uwzględniając przecinek po między liczbami!!!\u001B[0m");
            while (!skanowanie.hasNextDouble()){
                System.out.println("\u001B[31mNie wprowadzono liczby po przecinku!!!\u001B[0m");
                skanowanie.next();
            }

            GlukozaMocz = skanowanie.nextDouble();

        }while(GlukozaMocz == (long)GlukozaMocz);

        System.out.println("\033[33mWprowadzono\033[0m " + GlukozaMocz);

        ///////Ketony///////
        System.out.println("\n\u001B[4m\u001B[32mDr.Etker\u001B[0m\u001B[0m\nCzy w twoim moczu występują ketony?\nWprowadź odpowiednią opcje\n1. Powyżej 10mg/dl\n2. Poniżej 10mg/dl\n3. Brak");

        boolean PetlaSwitchKetony = true;
        int wyborKetony =0;
        int Ketony = 0;

        while(PetlaSwitchKetony) {



            String wejscieKetony = skanowanie.nextLine();
            try {
                wyborKetony = Integer.parseInt(String.valueOf(wejscieKetony));    // konwertuje wartość na liczbę jeśli konwersja się nie powiedzie czyli użytkownik wprowadzi literę  łapiemy wyjątek NumberFormatException i wyświetlamy komunikat o błędzie. W przeciwnym razie używamy instrukcji switch, aby wykonać odpowiednie działanie na podstawie wybranego numeru.
            }catch (NumberFormatException e){                        //Jeśli wartość String nie reprezentuje poprawnej liczby całkowitej, metoda wrzuci wyjątek NumberFormatException.
                System.out.println("\u001B[31mMusisz wprowadzić numer!!!\u001B[0m");
                continue;
            }

            switch (wyborKetony) {
                case 1 -> {PetlaSwitchKetony = false;
                    Ketony = 1;
                    System.out.println("\033[33mKetony powyżej 10mg/dl\033[0m");
                }
                case 2 -> {PetlaSwitchKetony = false;
                    Ketony = 2;
                    System.out.println("\033[33mKetony poniżej 10mg/dl\033[0m");
                }
                case 3 -> {PetlaSwitchKetony = false;
                    Ketony = 3;
                    System.out.println("\033[33mBrak ketonów\033[0m");
                }
                default -> {
                    System.out.println("\u001B[31mNie znaleziono takiej opcji. \nSpróbuj ponownie.\u001B[0m");
                }
            }
        }

        ///////Urobilinogen///////

        System.out.println("\n\u001B[4m\u001B[32mDr.Etker\u001B[0m\u001B[0m\nCzy w twoim moczu występuje Urobilinogen?\nWybierz odpowiednią pozycje\n1. Poniżej 10mg/dl\n2. Powyżej 10mg/dl\n3. Brak");

        boolean PetlaUrobilinogen = true;
        int WyborUrobilinogen = 0;
        int Urobilinogen = 0;

        while (PetlaUrobilinogen){



            String WejscieUrobilinogen = skanowanie.nextLine();
            try{
                WyborUrobilinogen = Integer.parseInt(String.valueOf(WejscieUrobilinogen));
            }catch (NumberFormatException e){
                System.out.println("\u001B[31mMusisz wprowadzić numer!!!\u001B[0m");
                continue;
            }


            switch (WyborUrobilinogen){
                case 1 -> {PetlaUrobilinogen = false;
                    Urobilinogen = 1;
                    System.out.println("\033[33mUrobilinogen poniżej 10mg/dl\033[0m");
                }
                case 2 ->{PetlaUrobilinogen = false;
                    Urobilinogen = 2;
                    System.out.println("\033[33mUrobilinogen powyżej 10mg/dl\033[0m");
                }
                    case 3 ->{PetlaUrobilinogen = false;
                        Urobilinogen = 3;
                        System.out.println("\033[33mBrak Urobilinogenu\033[0m");
                    }default -> {
                    System.out.println("\u001B[31mNie znaleziono takiej opcji. \nSpróbuj ponownie.\u001B[0m");
                }
            }
        }

        ///////Nitryty///////

        System.out.println("\n\u001B[4m\u001B[32mDr.Etker\u001B[0m\u001B[0m\nCzy w twoim moczu wykryto Nityryty?\n1. Tak, pozytywne\n2. Nie, negatywne ");

        boolean PetlaNitryty = true;
        int WyborNitryty = 0;
        int Nitryty = 0;

        while (PetlaNitryty){

            String WejscieNitryty = skanowanie.nextLine();
            try {
                WyborNitryty = Integer.parseInt(String.valueOf(WejscieNitryty));
            }catch (NumberFormatException e){
                System.out.println("\u001B[31mMusisz wprowadzić numer!!!\u001B[0m");
                continue;
            }
            switch (WyborNitryty){
                case 1 ->{PetlaNitryty = false;
                Nitryty = 1;
                    System.out.println("\033[33mNitryty pozytywne\033[0m");
                }
                    case 2 ->{PetlaNitryty = false;
                Nitryty = 2;
                        System.out.println("\033[33mNitryty negatywne\033[0m");
                }default -> {
                    System.out.println("\u001B[31mNie znaleziono takiej opcji. \nSpróbuj ponownie.\u001B[0m");}
            }
        }

        ///////Leukocyty///////

        System.out.println("\n\u001B[4m\u001B[32mDr.Etker\u001B[0m\u001B[0m\nPodaj jaka ilość Leukocytów występuje w twoim moczu\n1. 0-5 leukocytów na pole widzenia\n2. 6-10 leukocytów na pole widzenia\n3. 11-20 leukocytów na pole widzenia\n4. Ponad 20 leukocytów na pole widzenia");

        boolean PetlaLeukocyty = true;
        int WyborLeukocyty = 0;
        int Leukocyty = 0;

        while (PetlaLeukocyty){


            String WejscieLeukocyty = skanowanie.nextLine();
            try{
                WyborLeukocyty = Integer.parseInt(String.valueOf(WejscieLeukocyty));
            }catch(NumberFormatException e){
                System.out.println("\u001B[31mMusisz wprowadzić numer!!!\u001B[0m");
                continue;
            }

            switch (WyborLeukocyty){

                case 1 ->{PetlaLeukocyty=false;
                    System.out.println("\033[33m0-5 Leukocytów na pole widzenia\033[0m");
                    Leukocyty =1;
                }
                    case 2 ->{PetlaLeukocyty=false;
                        System.out.println("\033[33m6-10 Leukocytów na pole widzenia\033[0m");
                        Leukocyty=2;
                }
                        case 3 ->{PetlaLeukocyty=false;
                            System.out.println("\033[33m11-20 Leukocytów na pole widzenia\033[0m");
                            Leukocyty=3;
                }
                            case 4 ->{PetlaLeukocyty=false;
                                System.out.println("\033[33mPonad 20 Leukocytów na pole widzenia\0330m");
                                Leukocyty=4;
                }default -> {
                    System.out.println("\u001B[31mNie znaleziono takiej opcji. \nSpróbuj ponownie.\u001B[0m");
                }

            }


        }
        ///////Erytrocyty///////
        System.out.println("\n\u001B[4m\u001B[32mDr.Etker\u001B[0m\u001B[0m\nPodaj jaka ilośc Erytrocytów występuje w twoim moczu\n1. 0-2 erytrocytów na pole widzenia|0-5 erytrocytów na pole widzenia w przypadku kobiet\n2. 3-10 erytrocytów na pole widzenia|6-10 w przypadku kobiet\n3. 11-20 erytroctów na pole widzenia\n4. Ponad 20 erytrocytów na pole widzenia");

        boolean PetlaErytrocyty=true;
        int WyborErytrocyty=0;
        int Erytrocyty=0;
        while (PetlaErytrocyty){


            String WejscieErytrocyty = skanowanie.nextLine();
            try{
                WyborErytrocyty = Integer.parseInt(String.valueOf(WejscieErytrocyty));
            }catch (NumberFormatException e){
                System.out.println("\u001B[31mMusisz wprowadzić numer!!!\u001B[0m");
                continue;
            }

            switch (WyborErytrocyty){
                case 1 ->{PetlaErytrocyty=false;
                    System.out.println("\033[33m0-2 erytrocytów na pole widzenia|0-5 erytrocytów na pole widzenia w przypadku kobiet\033[0m");
                    Erytrocyty = 1;
                }
                    case 2 ->{PetlaErytrocyty=false;
                        System.out.println("\033[33m3-10 erytrocytów na pole widzenia|6-10 w przypadku kobiet\0330m");
                        Erytrocyty = 2;
                    }
                        case 3 ->{PetlaErytrocyty=false;
                            System.out.println("\033[33m11-20 erytroctów na pole widzenia\0330m");
                            Erytrocyty = 3;
                        }
                            case 4 ->{PetlaErytrocyty=false;
                                System.out.println("\033[33mPonad 20 erytrocytów na pole widzenia\033[0m");
                                Erytrocyty =4;
                            }default -> {
                    System.out.println("\u001B[31mNie znaleziono takiej opcji. \nSpróbuj ponownie.\u001B[0m");}
            }

        }

        /////// Podsumowanie ///////

        //System.out.println("\n\u001B[1m\u001B[4m\u001B[32mWynik badań\u001B[0m\u001B[0m\u001B[0m\nDobry wynik będzie przedstawiony kolorem \u001B[32mZIELONYM\u001B[0m\nNatomiast kiedy wynik wykroczy lekko poza normę zostanie oznaczony kolorem \033[33mŻÓŁTYM\033[0m\nKiedy wynik badań będzie skrajnie wykraczał poza normę zostanie on oznaczony kolorem \u001B[31mCZERWONYM\u001B[0m");

        String podsumowanie = "\n\u001B[1m\u001B[4m\u001B[32mWynik badań\u001B[0m\u001B[0m\u001B[0m\nDobry wynik będzie przedstawiony kolorem \u001B[32mZIELONYM\u001B[0m\nNatomiast kiedy wynik wykroczy lekko poza normę zostanie oznaczony kolorem \033[33mŻÓŁTYM\033[0m\nKiedy wynik badań będzie skrajnie wykraczał poza normę zostanie on oznaczony kolorem \u001B[31mCZERWONYM\u001B[0m\nKażdy wynik który wykracza poza normę powinien być jak najszybiej skonsultowany z lekażem!";

        for (int i = 0; i < podsumowanie.length(); i++){
            System.out.print(podsumowanie.charAt(i));
            try{
                Thread.sleep(30);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }



        //Wygląd Moczu//
       if (WyborWygladMocz == 1){
           System.out.println("\n\n\u001B[32mWygląd moczu: Klarowny\u001B[0m");
           } else if (WyborWygladMocz == 2) {
           System.out.println("\n\n\033[33mWygląd moczu: Lekko mętny\033[0m");
       } else if (WyborWygladMocz == 3) {
           System.out.println("\n\n\u001B[31mWygląd moczu: Pienisty\u001B[0m");
       }

       //Kolor moczu//
       if (WyborKolorMocz== 1){
           System.out.println("\u001B[32mKolor moczu: jasnożółty\u001B[0m");
       } else if (WyborKolorMocz==2) {
           System.out.println("\033[33mKolor moczu: słomkowy\033[0m");
       } else if (WyborKolorMocz==3) {
           System.out.println("\033[33mKolor moczu: Ciemno żółty\033[0m");
       } else if (WyborKolorMocz==4) {
           System.out.println("\u001B[31mKolor moczu: Czerwony\u001B[0m");
       } else if (WyborKolorMocz==5) {
           System.out.println("\033[33mKolor moczu: Bezbarwny\033[0m");
       }
       //pH mocz//
        double pHzaMalo = 4.6;
        double pHzaDuzo=8.0;


        if (pHmoczu < pHzaMalo){
            System.out.println("\u001B[31mpH moczu: " + pHmoczu + " ZA MAŁE pH NORMA 4,6 - 8,0\u001B[0m");
        } else if (pHmoczu > pHzaDuzo) {
            System.out.println("\u001B[31mpH moczu: " + pHmoczu + " ZA DUŻE pH NORMA 4,6-8,0\u001B[0m");
        }else {
            System.out.println("\u001B[32mpH moczu " + pHmoczu + " pH moczu w normie, norma 4,6-8,0\u001B[0m");
        }

        // Gęstość moczu //
        double ZaMalaGestosc = 1.005;
        double ZaDuzaGestosc = 1.030;

        if (GestoscMoczu < ZaMalaGestosc){
            System.out.println("\u001B[31mGestość moczu: " + GestoscMoczu + " ZA MAŁA\u001B[0m");
        }else if (GestoscMoczu > 1.030){
            System.out.println("\u001B[31mGestość moczu " + GestoscMoczu + " ZA DUŻa\u001B[0m");
        }else {
            System.out.println("\u001B[32mGestość moczu " + GestoscMoczu + " W NORMIE\u001B[0m");
        }

        // Białko moczu //
        double BialkoWnormie = 0.10;

        if (BialkoMoczu<= BialkoWnormie){
            System.out.println("\u001B[32mBiałko w moczu: "+BialkoMoczu+" W NORMIE\u001B[32m");
        } else if (BialkoMoczu > BialkoWnormie) {
            System.out.println("\u001B[31mBiałko w moczu: " +BialkoMoczu+ " ZA DUŻE\u001B[0m");
        }

        //Glukoza w moczu//
        double GlukozaMoczNorma = 0;

        if (GlukozaMocz > GlukozaMoczNorma){
            System.out.println("\u001B[31mGlukoza w moczu: " +GlukozaMocz+ " POZA NORMA norma 0mg\u001B[0m");
        }else{
            System.out.println("\u001B[32mGlukoza w moczu: " + GlukozaMocz+ " W normie\u001B[0m");
        }

        //Ketony//
        if (wyborKetony == 1){
            System.out.println("\u001B[31mKetony w moczu powyżej normy!!!\u001B[0m");
        } else if (wyborKetony == 2) {
            System.out.println("\033[33mKetony w moczu powyżej normy\033[0m");
        } else if (wyborKetony == 3) {
            System.out.println("\u001B[32mBrak ketonów w moczu\u001B[0m");
        }

        //Urobilinogen//
        if(WyborUrobilinogen == 1){
            System.out.println("\033[33mUrobilinogen w moczu powyżej normy NORMA 1mg\033[33m");
        } else if (WyborUrobilinogen == 2) {
            System.out.println("\u001B[31mUrolibinogen w moczu powyżej normy!!!! NORMA 1mg\u001B[0m");
        } else if (WyborUrobilinogen == 3) {
            System.out.println("\u001B[32mBrak Urolibinogenu w moczu\u001B[0m");
        }
        //Nitryty//
        if (WyborNitryty >1){
            System.out.println("\u001B[32mBrak Nitrytów w moczu\u001B[0m");
        } else if (WyborNitryty < 2) {
            System.out.println("\u001B[31mNitryty w moczu\u001B[0m");
        }

        // Leukocyty //
        if (WyborLeukocyty == 1){
            System.out.println("\u001B[32mLeukocyty 5 komurek na pole widzenia\u001B[0m");
        } else if (WyborLeukocyty == 2) {
            System.out.println("\u001B[31mLeukocyty 6-10 komurek na pole widzenia\u001B[0m");
        } else if (WyborLeukocyty == 3) {
            System.out.println("\u001B[31mLeukocycy 11-20 komurek na pole widzenia\u001B[0m");
        } else if (WyborLeukocyty == 4) {
            System.out.println("\u001B[31mLeukocyty ponad 20 komurek na pole widzenia\u001B[0m");
        }

        //Erytrocyty//
        if (WyborErytrocyty ==1){
            System.out.println("\u001B[32m0-2 erytrocytów na pole widzenia|0-5 erytrocytów na pole widzenia w przypadku kobiet\u001B[0m");
        } else if (WyborErytrocyty ==2) {
            System.out.println("\033[33m3-10 erytrocytów na pole widzenia|6-10 w przypadku kobiet\033[0m");
        } else if (WyborErytrocyty == 3) {
            System.out.println("\u001B[31m11-20 erytroctów na pole widzenia\u001B[0m");
        } else if (WyborErytrocyty == 4) {
            System.out.println("\u001B[31mPonad 20 erytrocytów na pole widzenia\u001B[0m");
        }


    }
}
