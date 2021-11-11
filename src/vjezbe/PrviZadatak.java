package vjezbe;

import java.util.Scanner;

public class PrviZadatak {
    public static void main(String[] args) {
        System.out.println("Unesite Vaše godine ili godište: ");
        int god = new Scanner(System.in).nextInt();
        int rez;
        rez = 2021 - god;
        if (rez <=300){
            System.out.println("Vi imate " + rez + " godina.");
        } else {
            System.out.println("Vi ste rođeni " + rez + ". godine.");
        }
    }
}
