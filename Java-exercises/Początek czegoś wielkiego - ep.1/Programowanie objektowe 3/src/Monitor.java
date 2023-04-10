public class Monitor {

    private int szerokosc = 1920;
    private int wysokosc = 1080;

    public void Niska_Rozdzielczosc(){
        szerokosc = 800;
        wysokosc = 600;
    }

    public void Wysoka_Rozdzielczosc(){
        szerokosc = 1920;
        wysokosc = 1080;
    }

    public String Pobierz_Rozdzielczosc(){
        return szerokosc + "x" + wysokosc;
    }





}
