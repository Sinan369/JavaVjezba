package vjezbe;

import java.util.Scanner;

public class MikiZadatak {
    public static void main(String[] args) {
        System.out.println("Unesi vaše ime: ");
        String ime = new Scanner(System.in).next();
        System.out.println("Koliko imaš godina? ");
        int god = new Scanner(System.in).nextInt();
        System.out.println("My name is " + ime + " I am " + god + " Years old.");
        if (god <= 13){
            System.out.println("Dobrodošli na Imvu :D");
        } else {
            System.out.println("Dobrodošli na Kik :P");
        }
    }
}
