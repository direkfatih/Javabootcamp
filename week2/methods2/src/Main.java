public class Main {

    public static void main(String[] args) {
        String message = "Bugün hava çok güzel";
        String newMessage = givecity();
        System.out.println(newMessage);
        int number = total(15,7);
        System.out.println(number);
        int total = total2(2,3,4,7,9,12);
        System.out.println(total);

    }

    public static void add(){
        System.out.println("Eklendi");
    }

    public static void delete(){
        System.out.println("Silindi");
    }

    public static void update(){
        System.out.println("Güncellendi");
    }

    public static int total(int number1,int number2){
        return number1+number2;
    }

    public static int total2(int... numbers){
        int total = 0;
        for (int number:numbers){
            total += number;
        }
        return total;
    }

    public static String givecity(){
        return "Ankara";
    }
}