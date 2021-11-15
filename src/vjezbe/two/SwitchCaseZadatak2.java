package vjezbe.two;

import javax.swing.*;

public class SwitchCaseZadatak2 {
    public static void main(String[] args) {
        String dani = JOptionPane.showInputDialog("Unesi ime dana u sedmici na bosanskom jeziku! ");
        //---------------------------------
        switch (dani){
            case "Ponedjeljak", "ponedjeljak":
                JOptionPane.showMessageDialog(null,"Dan " + dani + " je 1. dan u sedmici.");
                break;
            case "Utorak", "utorak":
                JOptionPane.showMessageDialog(null,"Dan " + dani + " je 2. dan u sedmici.");
                break;
            case "Srijeda", "srijeda":
                JOptionPane.showMessageDialog(null,"Dan " + dani + " je 3. dan u sedmici.");
                break;
            case "Četvrtak", "četvrtak":
                JOptionPane.showMessageDialog(null,"Dan " + dani + " je 4. dan u sedmici.");
                break;
            case "Petak", "petak":
                JOptionPane.showMessageDialog(null,"Dan " + dani + " je 5. dan u sedmici.");
                break;
            case "Subota", "subota":
                JOptionPane.showMessageDialog(null,"Dan " + dani + " je 6. dan u sedmici.");
                break;
            case "Nedjelja", "nedjelja":
                JOptionPane.showMessageDialog(null,"Dan " + dani + " je 7. dan u sedmici.");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Niste ispravno unijeli ime dana pokušajte ponovo! ");
        }
    }
}
