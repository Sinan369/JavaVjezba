package vjezbe.two;

import javax.swing.*;


public class SwitchCaseZadatak {
    public static void main(String[] args) {
        String dayNumber = JOptionPane.showInputDialog("Unesi broj dana u sedmici! ");
        int day = Integer.parseInt(dayNumber);
        //--------------------------------------
        switch (day){
            case 1:
                JOptionPane.showMessageDialog(null, "Ponedjeljak");
            case 2:
                JOptionPane.showMessageDialog(null, "Utorak");
            case 3:
                JOptionPane.showMessageDialog(null, "Srijeda");
            case 4:
                JOptionPane.showMessageDialog(null, "Četvrtak");
            case 5:
                JOptionPane.showMessageDialog(null, "Petak");
            case 6:
                JOptionPane.showMessageDialog(null, "Subota");
            case 7:
                JOptionPane.showMessageDialog(null, "Nedjelja");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nauči koliko sedmica ima dana!!!");
        }

    }
}
