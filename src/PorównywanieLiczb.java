/*
Zadanie 1.9
Pobierz w konsoli dwie liczby całkowite, następnie porównaj je i wyświetl stosowny komunikat z wynikiem.
 */

import java.util.Scanner;

public class PorównywanieLiczb {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę a.");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbę b");
        int b = scanner.nextInt();

        if(a == b)
            System.out.println("Podane liczby " +a +" są równe.");
        else if(a > b)
            System.out.println("Liczba " +a +" jest większa, niż " +b);
        else if(a < b)
            System.out.println("Liczba " +b +" jest większa, niż " +a);
    }
}
