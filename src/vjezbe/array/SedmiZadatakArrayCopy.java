package vjezbe.array;

public class SedmiZadatakArrayCopy {
    public static void main(String[] args) {
        char[] letters = {'a', 'k', 'o', 'r', 's', 'i', 'n', 'a', 'n', 'e', 'z', 'b'};
        char[] wordFromArray = new char[6];
        System.arraycopy(letters, 4, wordFromArray,0, wordFromArray.length);
        String word = new String(wordFromArray);
        System.out.println("Hej " + word);

    }
}
