/*
Napisz program, który wczytuje ze standardowego wejścia trzy liczby całkowite i
wypisuje na standardowym wyjściu największą z ich wartości
(pamiętaj o przypadku gdy wszystkie podane liczby lub dwie z nich są równe).
 */

import java.util.Scanner;
import static java.lang.Math.*;

public class WypisanieNajwiekszejWartosci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double liczba1;
        double liczba2;
        double liczba3;

        do {
            System.out.println("Wypisz w kolejnych linijkach 3 liczby, ktróre ja porównam i wypiszę największą z nich");
            liczba1 = input.nextDouble();
            liczba2 = input.nextDouble();
            liczba3 = input.nextDouble();

            System.out.println("Największa wartość z podanych liczb wynosi ");
        }while(true);
    }
}
