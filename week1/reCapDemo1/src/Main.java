public class Main {
    public static void main(String[] args) {
        int number1 = 14;
        int number2 = 42;
        int number3 = 124;

        int largestNumber = number1;

        if (largestNumber<number2) {
            largestNumber = number2;
        }

        if (largestNumber<number3) {
            largestNumber = number3;
        }


        System.out.println("The largest number is "+largestNumber);
    }
}