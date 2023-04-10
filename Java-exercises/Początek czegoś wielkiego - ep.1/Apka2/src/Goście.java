public class Goście {
    private String imie;
    private String potrawaDlaGoscia;
    private int numerTelefonu;
    private boolean czyJestWege;

    public Goście(String imie, String potrawaDlaGoscia, int numerTelefonu, boolean czyJestWege) {
        this.imie = imie;
        this.potrawaDlaGoscia = potrawaDlaGoscia;
        this.numerTelefonu = numerTelefonu;
        this.czyJestWege = czyJestWege;
    }

    public String getImie() {
        return imie;
    }

    public String getPotrawaDlaGoscia() {
        return potrawaDlaGoscia;
    }

    public int getNumerTelefonu() {
        return numerTelefonu;
    }

    public boolean getCzyJestWege() {
        return czyJestWege;
    }

    public void pokażGości(){
        System.out.println("Imię:  " + imie);
        System.out.println("Preferowana potrawa:  " + potrawaDlaGoscia);
        System.out.println("Numer telefonu:  " + numerTelefonu);
        String JestWege = czyJestWege ? "tak" : "nie";
        System.out.println("Czy jest Wege:  " + JestWege );
    }
}
