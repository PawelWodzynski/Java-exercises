public class Pendrive implements USB_urzadzenia{
    private String nazwa;
    private boolean wypiete = false;
    public Pendrive(String nazwa){
        this.nazwa = nazwa;
    }
    @Override
    public boolean polaczenie() {
        System.out.println("Podlaczono Pendrive");
        return true;
    }

    @Override
    public boolean rozlaczenie(USB_urzadzenia usbUrzadzenia) {
        if (!wypiete){
            System.out.println("Prosze odepnij najpierw Pendrive");
            return false;
        }else {
            System.out.println("Pendrive odłączony");
            return true;
        }

    }


    public void wypiac(){
        wypiete = true;
        System.out.println("Wypinanie Pendrive");
    }

    @Override
    public String pobierzNazwe() {
        return nazwa;
    }
}
