package vjezbe;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class DrugiZadatak {
    public static void main(String[] args) {
        System.out.println("Unesite broj bodova sa testa: ");
        byte bodovi = new Scanner(System.in).nextByte();
        if(bodovi <0 || bodovi > 100){
            System.out.println("Unesite odgovarajui broj bodova minimalan je 0 maksimalan je 100");
        } else if (bodovi >=90 && bodovi <=100){
            System.out.println("Ocjena je 5");
        } else if(bodovi >=80){
            System.out.println("Ocjena je 4");
        } else if(bodovi >=70){
            System.out.println("Ocjena je 3");
        } else if(bodovi >=60) {
            System.out.println("Ocjena je 2");
        }  else if(bodovi < 60) {
            System.out.println("Nažalost pali ste, ocjena je 1 :'(");
        }
    }
}
