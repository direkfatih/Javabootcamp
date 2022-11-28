public class Main {

    public static void main(String[] args) {
        searchNumber();

    }

    public static void searchNumber()

    {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int search = 7;
        boolean isthere = false;

        for (int number : numbers) {
            if (number == search) {
                isthere = true;
                break;
            }
        }

        if (isthere) {
            giveMessage("Sayı mevcuttur: "+ search);
        } else {
            giveMessage("Sayı mevcut değildir: "+ search);
        }
    }
    public static void giveMessage(String message){
        System.out.println(message);
    }
}
