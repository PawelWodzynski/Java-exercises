public class Main {
    public static void main(String[] args) {


        Uzytkownik pawel = new Uzytkownik(22, "Pawel");


        if (pawel.czy_moze_legalnie_kupic_alkohol()){
            System.out.println("Paweł może kupić alkohol");
        }else {
            System.out.println("Paweł nie może kupić alkoholu");
        }





    }
}