public class Main {
    public static void main(String[] args) {

        Monitor monitor = new Monitor();
        DyskHDD dysk = new DyskHDD();

        Komputer komputer = new Komputer(monitor, dysk);

//        dysk.DodajPlik(new Plik("bombka.jpg"));
//        dysk.ListaPlików();

        Pendrive pendrive=new Pendrive("Pendrive1");
        Myszka myszka = new Myszka("Mysz");

        komputer.dodajUrzadzenieUSB(pendrive);
        komputer.dodajUrzadzenieUSB(myszka);

        komputer.wyciagniecieUSB(pendrive);
        komputer.wyciagniecieUSB(myszka);


    }
}