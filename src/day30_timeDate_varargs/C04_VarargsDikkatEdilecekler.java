package day30_timeDate_varargs;

public class C04_VarargsDikkatEdilecekler {

    public static void main(String[] args) {

        // argument olarak verilen sayılardan ilki hariç,
        // geriye kalanları toplayıp, bulunan toplamı ilk sayı ile çarpıp
        // sonucu yazdıran bir method oluşturun

        // input = 0,2,3,4,1  output ==> 0 *10 = 0
        // input = 1,2,3  output ==> 1*5 = 5

        islemYap(0, 2, 3, 4, 1); // 0 * 10 = 0
        islemYap(1, 2, 3); // 1 * 5 = 5
        islemYap(2, 3, 4, 5, 6, 7, 8, 9); // 2 * 42 = 84
        islemYap(5); // 5 * 0 = 0
        // Varargs çok elemanı sorun etmediği gibi hiç eleman verilmemesini de sorun etmez

        // islemYap(); CTE array boş kalabilir fakat baştaki parametre boş kalmaz.


    }

    public static void islemYap(int ilkSayi, int... geriyeKalanlar) {


        int toplam = 0;

        for (int each : geriyeKalanlar
        ) {
            toplam += each;
        }

        System.out.println(toplam * ilkSayi);

    }

}
