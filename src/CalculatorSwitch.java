import java.util.Scanner;
import static java.lang.Math.*;

public class CalculatorSwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("MENU: \n" +
                "1 - dodawanie \n" +
                "2 - odejmowanie \n" +
                "3 - mnożenie \n" +
                "4 - dzielenie \n" +
                "5 - potęgowanie\n" +
                "6 - pierwiastkowanie do kwadratu");


        int menuwyboru = input.nextInt();


        System.out.println("Wpisz pierwszą liczbę");
        double a = input.nextDouble();
        System.out.println("Wpisz drugą liczbę");
        double b = input.nextDouble();

        switch(menuwyboru) {
            case 1:
                double wynik1 = a + b;
                System.out.print(a +"+" +b +"=" +wynik1);
                break;
            case 2:
                double wynik2 = a - b;
                System.out.print(a +"-" +b +"=" +wynik2);
                break;
            case 3:
                double wynik3 = a * b;
                System.out.print(a +"+" +b +"=" +wynik3);
                break;
            case 4:
                double wynik4 = a / b;
                System.out.print(a +"+" +b +"=" +wynik4);
                break;
            case 5:
                double wynik5 = (pow(a, b));
                System.out.print(a +"^" +b +"=" +wynik5);
                break;
            case 6:
                double wynik6 = sqrt(a);
                System.out.print(a +"√" +"=" +wynik6);
                break;

            default:

        }
    }
}
