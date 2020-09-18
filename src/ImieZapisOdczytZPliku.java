/*
Zadanie 1.8
Napisz program, w którym wprowadzisz w konsoli swoje imię,
następnie zapiszesz je do pliku.
Odczytaj je z powrotem z pliku i bez użycia dodatkowej zmiennej wyświetl na ekranie.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ImieZapisOdczytZPliku {
    public static void main(String[] args) throws FileNotFoundException{

        Scanner input = new Scanner(System.in); // input z konsoli
        System.out.println("Podaj swoje Imię");
        String imie = input.nextLine(); // zapis imienia do zmiennej "imie"

        PrintWriter zapis = new PrintWriter("imie.txt"); // zapisywanie do pliku "imie.txt"
        zapis.print(imie); // zapisanie zmiennej imie do pliku "imie.txt"
        zapis.close();

        Scanner odczyt = new Scanner(new File("imie.txt")); // odczytywanie pierwszej linijki z pliku "imie.txt"
        System.out.println(odczyt.nextLine()); // wypisanie pierwszej linijki z pliku "imie.txt"

    }
}
