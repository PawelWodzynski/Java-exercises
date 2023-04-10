public class Garnek {

    int srednica;
    int wysokosc;
    String kolor;


    public Garnek(){

    }
    public Garnek(int srednica, int wysokosc, String kolor){
       this.srednica = srednica;
       this.wysokosc = wysokosc;
       this.kolor = kolor;

    }

    public String gotuj(){
        return "Gotowanie w trakcie";

    }

    public String gotuj(boolean czyDodalismySol){
        if (czyDodalismySol){
            return "gotowanie z solą";
        }else {
            return "gotowanie bez soli";
        }
    }

    public void gotujBezInformacji(){

        wlaczGarnet();
        gotujPrzez30min();
        wylaczGarnek();

    }

    public void wlaczGarnet(){
        System.out.println("włączanie garnka");
    }

    public void gotujPrzez30min(){
        System.out.println("Gotuj przez 30 minut");
    }

    public void wylaczGarnek(){
        System.out.println("Wyłącznie garnka");
    }

    public int zwrocTemperatureGotowaniaWody(){
        return 100;
    }

}
