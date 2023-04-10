public class Main {
    public static void main(String[] args) {
        Garnek garnek = new Garnek();
//
//        garnek.srednica = 10;
//                garnek.wysokosc = 5;
//                        garnek.kolor= "szary";
//        System.out.println(garnek.srednica);
//        System.out.println(garnek.wysokosc);
//        System.out.println(garnek.kolor);
//
//
////        Garnek garnek = new Garnek(7, 5, "srebrny");
////
////        System.out.println(garnek.srednica);
////        System.out.println(garnek.wysokosc);
////        System.out.println(garnek.kolor);

        String wiadomosc = garnek.gotuj();
        System.out.println(wiadomosc);

        String wiadomosc2 = garnek.gotuj(true);
            System.out.println(wiadomosc2);



        int temperatura = garnek.zwrocTemperatureGotowaniaWody();
            System.out.println(temperatura);

            garnek.gotujBezInformacji();

    }
}