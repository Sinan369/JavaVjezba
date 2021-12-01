package vjezbe.loops;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers = {23,32,64,28,15,33,26,30,47,75};

        for(int number : numbers){
            if (number % 2 == 0){
                System.out.println("Parni brojevi niza su: " + number);
            }
        }
    }
}