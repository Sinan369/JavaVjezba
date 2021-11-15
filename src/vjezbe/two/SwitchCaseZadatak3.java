package vjezbe.two;

import javax.swing.*;

public class SwitchCaseZadatak3 {
    public static void main(String[] args) {
        String dayNumber = JOptionPane.showInputDialog("Unesi broj dana u sedmici! ");
        int day = Integer.parseInt(dayNumber);
        String imeDana = null;
        //--------------------------------------
        switch (day){
            case 1:
                imeDana = "Ponedjelak";
                break;
            case 2:
                imeDana = "Utorak";
                break;
            case 3:
                imeDana = "Srijeda";
                break;
            case 4:
                imeDana = "Četvrtak";
                break;
            case 5:
                imeDana = "Petak";
                break;
            case 6:
                imeDana = "Subota";
                break;
            case 7:
                imeDana = "Nedjelja";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nauči koliko sedmica ima dana!!!");
        }
        if (imeDana != null){
            JOptionPane.showMessageDialog(null, "Dan je: " + imeDana);
        }
    }
}
