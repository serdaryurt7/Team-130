package day39_exceptions;

import java.util.Scanner;

public class C05_CatchBlogundaki_e {

    public static void main(String[] args) {

        // Kullanicidan bir cumle ve bir sayi isteyin, kullanicinin verdigi sayiyi index olarak kabul edip
        // cümlede o index'teki karakteri yazdırın

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz...");

        String cumle = scanner.nextLine();

        System.out.println("Lutfen bir tamsayi giriniz...");

        int index = scanner.nextInt();

        try {
            System.out.println(cumle.charAt(index));

        } catch (StringIndexOutOfBoundsException e) {

            // System.out.println(e);
            // java.lang.StringIndexOutOfBoundsException: Index 10 out of bounds for length 5

            // System.out.println(e.getCause()); // null

            // System.out.println(e.getMessage()); // String index out of range: 9

            e.printStackTrace(); // exception oluşturunda yazdırılan tüm satırları yazdırır, ama exception kontrol altına alındığı için kod NORMAL olarak biter

            System.out.println("Girilen index cumlenin sinirlari disinda");
        }

    }

}
