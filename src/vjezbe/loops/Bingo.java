package vjezbe.loops;

import javax.swing.*;

public class Bingo {
    public static void main(String[] args) {
        int[] numbers = {23,48,32,59,64,87,28,11,10,14,89,95};
        String inputNumberText = JOptionPane.showInputDialog("Unesi broj i osvoji pare!!!");
        int inputNumber=Integer.parseInt(inputNumberText);
        boolean Pronadjen = false;
        for (int number : numbers){
            if(inputNumber == number){
                Pronadjen = true;
                break;
            }
        }
        if (Pronadjen){
            JOptionPane.showMessageDialog(null, "Bingooo!!!");
        } else {
            JOptionPane.showMessageDialog(null, "Žao nam je, više sreće drugi put!");
        }

    }
}
