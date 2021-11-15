package vjezbe.loops;

import javax.swing.*;

public class WhileLoop {
    public static void main(String[] args) {
        String number = JOptionPane.showInputDialog("Unesi broj od kojeg želiš da ti broji ");
        int result = Integer.parseInt(number);
        while (result < 10 && result > -10) {
            System.out.println("Broj: " + result++);
        }
    }
}

