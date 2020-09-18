import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź liczbę a");
        double a = scanner.nextDouble();

        System.out.println("Wprowadź liczbę b");
        double b = scanner.nextDouble();

        System.out.println("Wynik dodawania liczb a oraz b wynosi " +(a+b));
        System.out.println("Wynik odejmowania liczb a oraz b wynosi " +(a-b));
        System.out.println("Wynik mnożenia liczb a oraz b wynosi " +(a*b));
        System.out.println("Wynik dzielenia liczb a oraz b wynosi " +(a/b));
    }

}
