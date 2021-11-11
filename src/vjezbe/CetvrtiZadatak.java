package vjezbe;

import java.util.Scanner;

public class CetvrtiZadatak {
    public static void main(String[] args) {
        System.out.println("Unesi broj dana u sedmici: ");
        int dan = new Scanner(System.in).nextInt();
        switch (dan) {
            case 1:
                System.out.println("Ponedeljak");
                break;
            case 2:
                System.out.println("Utorak");
                break;
            case 3:
                System.out.println("Srijeda");
                break;
            case 4:
                System.out.println("Četvrtak");
                break;
            case 5:
                System.out.println("Petak");
                break;
            case 6:
                System.out.println("Subota");
                break;
            case 7:
                System.out.println("Nedjelja");
                break;
        }
        if (dan <=0 || dan > 7) {
            System.out.println("Ti ne znaš koliko dana sedmica ima!!! :P");
        }
    }
}
