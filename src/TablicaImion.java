import java.util.Scanner;

public class TablicaImion {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String[] imiona = new String[5];

            System.out.println("Podaj pierwsze imie.");
            imiona[0] = scanner.nextLine();

            System.out.println("Podaj drugie imie.");
            imiona[1] = scanner.nextLine();

            System.out.println("Podaj trzecie imie.");
            imiona[2] = scanner.nextLine();

            System.out.println("Podaj czwarte imie.");
            imiona[3] = scanner.nextLine();

            System.out.println("Podaj piąte imie.");
            imiona[4] = scanner.nextLine();

/*
        // alternatywny sposób odczytu danych poprzez pętle "for" (nie dziala)

            int licznik = 0;
            for(; licznik<5; licznik++)
                System.out.println("Podaj imie użytkownika nr " +(licznik+1) );
                imiona[licznik] = scanner.nextLine();
*/
        System.out.println("Witajcie nowi użytkownicy!"
                +" "+imiona[0] +", "+imiona[1] +", "+imiona[2] +", "+imiona[3] +", "+imiona[4] +"!");
    }
}
