public class Uzytkownik {
    private int wiek;
    private String imie;

    public Uzytkownik(int wiek, String imie) {
        this.wiek = wiek;
        this.imie = imie;
    }

    public int getWiek(){
        return wiek;
    }

    public String getImie(){
        return imie;
    }

    public void setWiek(int wiek){
        if (wiek > 0){
            this.wiek=wiek;
        }else {
            throw new RuntimeException("Wiek musi być większy od 0");
        }
    }

    public boolean czy_moze_legalnie_kupic_alkohol(){
        if (wiek >= 18){
            return true;
        }else {
            return false;
        }
    }

    public void setImie(String imie){
        this.imie=imie;
    }





}


