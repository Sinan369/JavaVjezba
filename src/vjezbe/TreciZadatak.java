package vjezbe;

import java.util.Scanner;

public class TreciZadatak {
    public static void main(String[] args) {
        System.out.println("Unesi broj manji ili veći od nule: ");
        int a = new Scanner(System.in).nextInt();
        if (a < 0 || a > 0) {
            if (a < 0) {
                int b = a + (-(a));
                System.out.println("Vaš broj je iz NEGATIVNOG obrađen u neutralan broj: " + b);
            } else {
                int b = a - a;
                System.out.println("Vaš broj je iz POZITIVNOG obrađen u neutralan broj: " + b);
            }
        } else {
            System.out.println("Unijeli ste 0 ne možete dobiti rezultat! ");
        }
    }
}
