package vjezbe.two;

import javax.swing.*;

public class SwitchCaseZadatak4 {
    public static void main(String[] args) {
        String mjesec = JOptionPane.showInputDialog("Unesi redni broj nekog mjeseca u godini ");
        String godina = JOptionPane.showInputDialog("Unesi godinu: ");
        int brojMjeseci = Integer.parseInt(mjesec);
        int brojGodine = Integer.parseInt(godina);
        //-------------------------------------------------------------------
        int brojDanaMjeseca = 0;
        switch (brojMjeseci){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                brojDanaMjeseca = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                brojDanaMjeseca = 30;
                break;
            case 2:

                if ((brojGodine%4==0 && brojGodine%100 != 0) || (brojGodine%400 == 0)){
                    brojDanaMjeseca = 29;
                } else {
                    brojDanaMjeseca = 28;
                }
                break;
            default: JOptionPane.showMessageDialog(null, "Godina ima 12 mjeseci!!!");
        }
        if (brojDanaMjeseca!=0){
            JOptionPane.showMessageDialog(null,   brojMjeseci + ". mjesec ima " + brojDanaMjeseca + " u godini " + brojGodine + '.');
        }
    }
}
