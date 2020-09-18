/*
Zadanie 1.10
Napisz program, który pobierze od użytkownika imię i przechowa je w zmiennej.
Następnie stwórz kilka warunków z różnymi imionami. Jeśli któreś z imion będzie pasowało wyświetl "Cześć jakieś_imię"
, gdy program nie znajdzie imienia wyświetl "Przykro mi, ale Cię nie znam".
 */

import java.util.Scanner;

public class RozpoznawanieImion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj swoje imię.");
        String imie = input.nextLine();

            if(imie.equals("Filip")) {
                System.out.println("Cześć " +imie +"!");
            }
            else if(imie.equals("Aga")) {
                System.out.println("Hej " +imie +"!");
            }
            else if(imie.equals("Szymon")) {
                System.out.println("Witam " +imie +"!");
            }
            else if(imie.equals("Bartek")) {
                System.out.println(" Ooo " +imie +" siemano!");
            }
            else {
                System.out.println("Sorry, ale Cię nie rozpoznaję :C");
            }



    }
}
