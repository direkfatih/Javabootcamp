public class Main {
    public static void main(String[] args) {

        // A E I İ O Ö U Ü
        char letter = 'Ü';

        switch (letter) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
        }

    }
}