import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int ZgadywanyNumer = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        boolean DoOdgadniecia = false;
        while (!DoOdgadniecia){
            System.out.println(" Podaj Liczbę");
            int WybranyNumer = scanner.nextInt();


            if (WybranyNumer < ZgadywanyNumer){
                System.out.println("Liczba jest za mała");
            } else if (WybranyNumer > ZgadywanyNumer) {
                System.out.println("Liczba jest za duża");
                
            }else {
                System.out.println("Gratuluję, odgadłeś liczbę!");
                DoOdgadniecia= true;   // zatrzymanie pętli
            }
        }


    }
}