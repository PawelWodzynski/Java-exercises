import java.util.ArrayList;
import java.util.List;

public class Komputer {
    private Monitor monitor;
    private Dysk dysk;
    private Sluchawki sluchawki;


    List<USB_urzadzenia> urzadzeniaUSB = new ArrayList<>();


    public Komputer(Monitor monitor, Dysk dysk){

        this.monitor = monitor;
        this.dysk = dysk;
    }


    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Dysk getDysk() {
        return dysk;
    }

    public void setDysk(Dysk dysk) {
        this.dysk = dysk;
    }

    public Sluchawki getSluchawki() {
        return sluchawki;
    }

    public void setSluchawki(Sluchawki sluchawki) {
        this.sluchawki = sluchawki;
    }


    public List<USB_urzadzenia> getUrzadzeniaUSB() {
        return urzadzeniaUSB;
    }

    public void dodajUrzadzenieUSB(USB_urzadzenia usbUrzadzenia){
        boolean jestPolaczenie = usbUrzadzenia.polaczenie();
        if (jestPolaczenie){
            urzadzeniaUSB.add(usbUrzadzenia);
        }
    }

    public void wyciagniecieUSB(USB_urzadzenia usbUrzadzenia){
        boolean jestRozlaczone = usbUrzadzenia.rozlaczenie(usbUrzadzenia);

        if (!jestRozlaczone){
            usbUrzadzenia.rozlaczenie(usbUrzadzenia);
        }

        usbUrzadzenia.rozlaczenie(usbUrzadzenia);

    }





}
