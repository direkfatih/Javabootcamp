import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        System.out.println(message);

        System.out.println("Eleman sayısı: " + message.length());
        System.out.println("5. Eleman : " + message.charAt(4));
        System.out.println(message.concat(" Yaşasın!"));
        System.out.println(message.startsWith("B"));       //startswith = B ile başlıyo mu?
        System.out.println(message.endsWith("."));         //endswith = (.) ile bitiyo mu?
        char[] characters = new char[5];
        message.getChars(0,5,characters,0);
        System.out.println(characters);
        System.out.println(message.indexOf('a'));    //indexof =  Verdiğimiz karakterin kaçıncı eleman olduğunu bulur. İlk bulduğu değerde aramayı bitirir.
        System.out.println(message.lastIndexOf("e")); //lastIndexof = Aramaya sondan başlar. ama index numarasını baştan sayarak verir.

        String newmessage = message.replace(' ','-');
        System.out.println(newmessage);
        System.out.println(message.substring(2,5));               //substring = Bir metnin içerisinden parça almak için kullanılır.

        for (String word : message.split(" ")){   //split = Verdiğimiz değere göre ayırma işlemi gerçekleştirir. Ve her kelimeyi alt alta, tek tek yazar.
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());        // toLowerCase = tüm harfleri küçük harf yapar.
        System.out.println(message.toUpperCase());        // toUpperCase = tüm harfleri büyük harf yapar.
        System.out.println(message.trim());               // trim = metnin başındaki ve sonundaki boşlukları atar.


    }
}