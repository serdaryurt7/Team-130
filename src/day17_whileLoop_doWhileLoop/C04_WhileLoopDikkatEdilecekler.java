package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C04_WhileLoopDikkatEdilecekler {
    public static void main(String[] args) {

        // 1- While parantezinde kontrol ettiğimiz değişken, loop içerisinde değiştirilmezse sonsuz loop oluşur.

        int sayi = 5;
        int sayac = 0;

        while (sayi <= 10) {

            sayac++;
            System.out.println(sayac + "  ");
            sayi++;
        }

        // 2- Eğer loop oluşturulmadan önce, ihtiyaç duyduğumuz variable'ları biz oluşturuyorsak,
        //    loop'un ilk defa çalışmasını ve kullanıcıdan değerler almasını ENGELLEMEYECEK bir değer atamaya dikkat etmeliyiz.

        //    kullanıcıdan sayılar isteyin verilen sayılar pozitif olduğu müddetçe, sayıları toplayalım ve negatif sayı girildiğinda topllamı yazdıralım

        sayi = 20;
        int toplam = 0;

        Scanner scanner = new Scanner(System.in);

        while (sayi > 0) {

            System.out.println("Lutfen toplanmak uzere pozitif tam sayilar girin");
            sayi = scanner.nextInt();
            toplam += sayi;

            if (sayi > 0) toplam += sayi;

        }

        System.out.println(toplam);

        // 3- Eğer loop parantezinde yazdığımız değişken için loop içerisinde kullanıcıdan değer alıyorsak
        //    aldığımız değerin, loop'u bitirme özelliği OLMAYAN bir değer olduğundan emin olduktan sonra işlemimizi yapmalıyız
        //    36. satırda olduğu gibi


    }
}
