package day13_forLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

        // Soru 3- Kullanıcıdan başlangıç ve bitiş değeri olarak pozitif sayılar alın,
        //         sınırlar dahil olarak aralarındaki tüm sayıların toplamını yazdırın.
        //         Bitiş değeri başlangıç değerinden küçükse, uyarı yazdırıp işlemi sonlandırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis degeri icin pozitif tamsayilar giriniz");
        int baslangicDegeri = scanner.nextInt();
        int bitisDegeri = scanner.nextInt();

        int toplam = 0;

        if (baslangicDegeri > bitisDegeri) {
            System.out.println("Bitis degeri baslangic degerinden kucuk olamaz");
        } else {


            for (int i = baslangicDegeri; i <= bitisDegeri; i++) {
                toplam += i;
            }
            System.out.println("Sayilarin toplami: " + toplam);
        }

    }
}
