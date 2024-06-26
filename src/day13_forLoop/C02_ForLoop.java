package day13_forLoop;

public class C02_ForLoop {
    public static void main(String[] args) {

        // 60 ve 23 dahil olmak üzere, 7 ile bölünebilen sayıları 60 tan geriye doğru yazdırın.

        for (int i = 60; i >= 23; i--) {
            if (i % 7 == 0) {
                System.out.println(i + " ");
            }
        }

        // 3 basamaklı pozitif tüm sayıları toplayıp, sonucu yazdırın
        int toplam = 0;

        for (int i = 100; i <= 999; i++) {
            toplam += i;
        }
        System.out.println("Sayilarin toplami : " + toplam);

        // -1000 ile +1000 arasındaki tüm tamsayıları toplayın

        toplam = 0;

        for (int i = -1000; i <= 1000; i++) {
            toplam += i;
        }
        System.out.println("-1000 ve 1000 arasındaki sayilarin toplami : " + toplam);

    }
}
