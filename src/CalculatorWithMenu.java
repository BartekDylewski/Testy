import java.util.Scanner;
import static java.lang.Math.*;

public class CalculatorWithMenu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int powrot = 1;
        double a = 0;
        double b = 0;
        do{

            System.out.println("\n ---MENU--- \n" +
                    "1 - dodawanie \n" +
                    "2 - odejmowanie \n" +
                    "3 - mnożenie \n" +
                    "4 - dzielenie \n" +
                    "5 - potęgowanie \n" +
                    "6 - pierwiastkowanie  a do kwadratu \n" +
                    "7 - obliczenie wartości bezwzględnej z a");

            int menuwyboru = input.nextInt(); // input wybiera opcję switcha

            if(menuwyboru>0 && menuwyboru<8){

                System.out.println("Wpisz pierwszą liczbę");
                a = input.nextDouble(); // input liczby a
                System.out.println("Wpisz drugą liczbę");
                b = input.nextDouble(); // input liczby b

                switch(menuwyboru) {
                    case 1:
                        double wynik1 = a + b;
                        System.out.print(a + "+" + b + "=" + wynik1 +"\n");
                        break;
                    case 2:
                        double wynik2 = a - b;
                        System.out.print(a + "-" + b + "=" + wynik2 +"\n");
                        break;
                    case 3:
                        double wynik3 = a * b;
                        System.out.print(a + "+" + b + "=" + wynik3 +"\n");
                        break;
                    case 4:
                        double wynik4 = a / b;
                        System.out.print(a + "+" + b + "=" + wynik4 +"\n");
                        break;
                    case 5:
                        double wynik5 = (pow(a, b));
                        System.out.print(a + "^" + b + "=" + wynik5 +"\n");
                        break;
                    case 6:
                        double wynik6 = sqrt(a);
                        System.out.print(a + "√" + "=" + wynik6 +"\n");
                        break;
                    case 7:
                        double wynik7 = abs(a);
                        System.out.print("|" +a +"| = " +wynik7 +"\n");
                }
                }else{
                    System.out.print("Przepraszam, ale nie ma takiej opcji\n");
            }
        }while(powrot == 1);
    }
}
