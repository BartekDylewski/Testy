import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("========== Kamień, papier, nożyce ==========");
        do {
            System.out.println("\nWybierz : kamien, papier, lub nozyce.");
            String wybor = input.nextLine();

            Random random = new Random();
            int odp = random.nextInt(3);
            odp++;
            String odpowiedz = "";
            if (odp == 1) {                    // 1 = kamien
                odpowiedz = "kamień";
            } else if (odp == 2) {             // 2 = papier
                odpowiedz = "papier";
            } else if (odp == 3) {             // 3 = nozyce
                odpowiedz = "noźyce";
            }

            System.out.println("Wybrałeś " + wybor + "!");

            System.out.println("Przeciwnik wybrał " + odpowiedz + "!");

            if (wybor.equals("kamien") && odp == 1) {
                System.out.println("Remis!");
            } else if (wybor.equals("kamien") && odp == 2) {
                System.out.println("Przegrałeś/aś!");
            } else if (wybor.equals("kamien") && odp == 3) {
                System.out.println("Wygrałeś/aś!");

            } else if (wybor.equals("papier") && odp == 1) {
                System.out.println("Wygrałeś/aś!");
            } else if (wybor.equals("papier") && odp == 2) {
                System.out.println("Remis!");
            } else if (wybor.equals("papier") && odp == 3) {
                System.out.println("Przegrałeś/aś!");

            } else if (wybor.equals("nozyce") && odp == 1) {
                System.out.println("Przegrałeś/aś!");
            } else if (wybor.equals("nozyce") && odp == 2) {
                System.out.println("Wygrałeś/aś!");
            } else if (wybor.equals("nozyce") && odp == 3) {
                System.out.println("Remis!");
            }
        }while(true);
    }
}
