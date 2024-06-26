package day13_forLoop;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {

        // Soru 3- Kullanıcıdan başlangıç ve bitiş değeri olarak pozitif sayılar alın,
        //         sınırlar dahil olarak aralarındaki tüm sayıların toplamını yazdırın.
        //         Bitiş değeri başlangıç değerinden küçük olsa da program çalışsın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis degeri icin pozitif tamsayilar giriniz");
        int baslangicDegeri = scanner.nextInt();
        int bitisDegeri = scanner.nextInt();

        int toplam = 0;

        if (baslangicDegeri < bitisDegeri) {

            for (int i = baslangicDegeri; i <= bitisDegeri; i++) {
                toplam += i;
            }
        } else {


            for (int i = bitisDegeri; i <= baslangicDegeri; i++) {
                toplam += i;
            }
        }
        System.out.println("Sayilarin toplami: " + toplam);
    }
}
