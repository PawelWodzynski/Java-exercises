public class Myszka implements USB_urzadzenia {

    private String nazwa;
    public Myszka(String nazwa){
        this.nazwa = nazwa;
    }
    @Override
    public boolean polaczenie() {
        System.out.println("Myszka Podlaczona");
    return true;
    }

    @Override
    public boolean rozlaczenie(USB_urzadzenia usbUrzadzenia) {
        System.out.println("Myszka Rozlaczona");
        return true;
    }

    @Override
    public String pobierzNazwe() {
        return null;
    }
}
