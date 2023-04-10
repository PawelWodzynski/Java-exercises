import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        for ( int i = 0; i < 3; i++) {
            System.out.println("  ");
        }

        System.out.println("Wstaw w odpowienie zmienne (X,Y) liczby które chcesz dzielić:   ");
        System.out.println("X : Y = W tym miejscu będzie twój wynik");
        System.out.println("    ");
        System.out.println("X:");
        Scanner ZmiennaX = new Scanner(System.in);
        int X;
        X = ZmiennaX.nextInt();
        System.out.println("    ");
        System.out.println("Y: ");
        Scanner ZmiennaY = new Scanner(System.in);
        int Y;
        Y = ZmiennaY.nextInt();
        System.out.println("Wynik dzielenia:   " + X +" : " + Y + " = " + X / Y);
        System.out.println("Reszta z dzielenia       = " + X % Y);


    }


}