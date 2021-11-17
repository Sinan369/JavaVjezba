package zadaca;

public class ContinueWithLabel {
    public static void main(String[] args) {
        String recenica = "Trazim koliko se puta adi nasmijao. adi je zdista zabavan tip.";
        String rijec = "adi";
        //--------------------------------------
        char[] recenicaNiz = recenica.toCharArray();
        char[] rijecNiz = rijec.toCharArray();
        int brojac = 0; //Brojač
        int max = recenicaNiz.length - rijecNiz.length;
        boolean foundIt = false;
        //--------------------------------------
        NASA:
        for (int x = 0; x <= max; x++){
            for (int y = 0; y < rijecNiz.length; y++){
                char slovoRecenica = recenicaNiz[x+y];
                char slovoRijec = rijecNiz[y];
                if (y == rijecNiz.length - 1 && slovoRecenica == slovoRijec){ //IF petlja koja provjerava broj puta ponavljanja riječi
                    brojac++;
                }
                if (slovoRecenica != slovoRijec){
                    continue NASA;
                }
            }
            foundIt = true;
        }
        System.out.println("Riječ " + rijec + " se pominje " + brojac + " puta u rečenici " + recenica);
    }
}
