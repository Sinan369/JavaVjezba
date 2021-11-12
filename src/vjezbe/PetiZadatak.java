package vjezbe;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PetiZadatak {
    public static void main(String[] args) {
        System.out.println("Naučite engleski uz nas, :D");
        System.out.println("Unesite Vaše ime: ");
        String name = new Scanner(System.in).next();
        System.out.println("Koliko imate godina? ");
        int year = new Scanner(System.in).nextInt();
        //--------------------------------------------
        if (year >= 1 && year < 130) {
            System.out.println("My name is " + name + " I am " + year + " years old.");
        }
        if (year < 1 || year >= 130) {
            System.out.println("Invalid input!!!");
        } else if (year >=18) {
            System.out.println("-----------------------");
            System.out.println("You are an adult!");
            System.out.println("-----------------------");
        } else if (year < 18) {
            System.out.println("-----------------------");
            System.out.println("You are a minor!");
            System.out.println("-----------------------");
        }
    }
}
