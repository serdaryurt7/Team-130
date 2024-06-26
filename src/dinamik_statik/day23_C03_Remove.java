package dinamik_statik;

import java.util.ArrayList;
import java.util.List;

public class day23_C03_Remove {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);
        sayilar.add(0);

        System.out.println(sayilar); // [3, 5, 2, 0]

          /*
            remove 2 şekilde yapılabilir
            remove(index)
            remove(object)

            sayilar(0) eleman 0 mi yoksa index 0 mı ?

            Java'da herşey nettir
            eğer listemiz Integer'lardan oluşuyorsa
            Java parametre olarak yazdığımız int sayiyi direk index kabul eder

            Eğer element olarak herhangi bir sayıyı silmek isterseniz,
            önce bir Object olarak o sayıyı tanımlamalı
            sonra silmelisiniz
         */

        System.out.println(sayilar.remove(1)); // 5
        // 1.index'deki sayıyı siler ve delil olarak sildiği elemanı getirir

        System.out.println(sayilar); // [3, 2, 0]

        // eleman olarak varsa 8'i silmesini istiyorum

        Object silinecekEleman = 8;

        System.out.println(sayilar.remove(silinecekEleman)); // false

        System.out.println(sayilar); // [3, 2, 0]


        silinecekEleman = 3;

        System.out.println(sayilar.remove(silinecekEleman)); // true

        System.out.println(sayilar); // [2, 0]

    }
}
