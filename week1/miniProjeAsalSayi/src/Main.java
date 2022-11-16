public class Main {
    public static void main(String[] args) {
        int number = 23;
        //int remainder = number % 2;
        //System.out.println(remainder);
        boolean isprime = true;

        if (number < 1) {
            System.out.println("Geçersiz sayı.");
            return;
        }

        if (number == 1) {
            System.out.println("Sayı asal değildir.");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isprime = false;
            }
        }
        if (isprime) {
            System.out.println(number + " Sayısı asaldır.");
        } else {
            System.out.println(number + "Sayısı asal değildir.");
        }

    }

}
