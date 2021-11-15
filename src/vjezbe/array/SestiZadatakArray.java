package vjezbe.array;

import java.util.Scanner;

public class SestiZadatakArray {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        //------------InputIntNumbers------------------
        System.out.println("Unesi prvi broj! ");
        numbers[0] = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj! ");
        numbers[1] = new Scanner(System.in).nextInt();
        System.out.println("Unesi treci broj! ");
        numbers[2] = new Scanner(System.in).nextInt();
        //---------------------------------------------
        System.out.println(numbers[0] + ", " + numbers[1] + ", " + numbers[2]);

    }
}
