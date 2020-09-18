import java.util.Scanner;

public class Powitanie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String firstName = scan.nextLine();
        System.out.println("Witaj, "+ firstName +"!");
    }
}
