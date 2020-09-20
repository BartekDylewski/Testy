/*
Napisz program, który w zależności od wyboru użytkownika wczytuje ze standardowego wejścia wymiary:
kwadratu, prostokąta lub trójkąta i wypisuje na standardowym wyjściu
pole figury o wczytanych wymiarach.
 */

import java.util.Scanner;
import static java.lang.Math.*;

public class PoleFigury {
    public static void main(String[] args) {

        int powrot=1;
        double a;
        double b;
        double h;
        double result;

        do {
            Scanner input = new Scanner(System.in);

            System.out.println("\nMENU\n" +
                    "1 - Pole kwadratu\n" +
                    "2 - Pole prostokąta\n" +
                    "3 - Pole trójkąta\n" +
                    "4 - Pole trapezu\n");

            int menuwyboru = input.nextInt();

            if(menuwyboru == 1){
                System.out.println("Podaj długość boku a.");
                a = input.nextDouble();
                result = pow(a,2);
                System.out.println("Pole twojego kwadratu wynosi " +result);
            }else if(menuwyboru == 2){
                System.out.println("Podaj długość boku a.");
                a = input.nextDouble();
                System.out.println("Podaj długość boku b.");
                b = input.nextDouble();
                result = a * b;
                System.out.println("Pole twojego prostokąta wynosi " +result);
            }else if(menuwyboru == 3){
                System.out.println("Podaj długość boku a, od którego wychodzi wysokość h.");
                a = input.nextDouble();
                System.out.println("Podaj długość wysokości h, która jest prostopadła do boku a");
                h = input.nextDouble();
                result = (a * h)/2;
                System.out.println("Pole twojego trójkąta wynosi " +result);
            }else if(menuwyboru == 4){
                System.out.println("Podaj długość boku a.");
                a = input.nextDouble();
                System.out.println("Podaj długość boku b");
                b = input.nextDouble();
                System.out.println("Podaj długość wysokości h");
                h = input.nextDouble();
                result = ((a + b)*h)/2;
                System.out.println("Pole twojego trapezu wynosi " +result);
            }
        }while(powrot==1);
    }
}
/*
else{
        System.out.println("Przepraszam, ale nie znam takiej komendy.");
        }
 */