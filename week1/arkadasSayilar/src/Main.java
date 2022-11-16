public class Main {
    public static void main(String[] args) {
        //220-284

        int number1 =  220;
        int number2 = 284;

        int total = 0;
        int total1=  0;

        for (int i=1 ; i<number1; i++){
            if (number1 % i ==0){
                total = total +i;
            }
        }

        for (int i=1 ; i<number2; i++){
            if (number2 % i ==0){
                total1 = total1 +i;
            }
        }
        System.out.println(total);
        System.out.println(total1);

        if (total == number2) {
            if (total1 == number1)
            System.out.println("1. ve 2. sayı arkadaş sayılardır.");
        }else{
            System.out.println("1. ve 2. sayı arkadaş sayı değillerdir.");
        }


       /* if (number1==total1 && number2==total){
            System.out.println("1. ve 2. sayı arkadaş sayılardır.");
        }*/

    }
}