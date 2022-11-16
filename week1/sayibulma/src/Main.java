public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,5,7,9,0};
        int search = 21;
        boolean isthere= false;

        for (int number : numbers){
            if (number == search){
                isthere = true;
                break;
            }
        }

        if (isthere){
            System.out.println("Sayı mevcuttur.");
        }else {
            System.out.println("Sayı mevcut değildir.");
        }

    }
}