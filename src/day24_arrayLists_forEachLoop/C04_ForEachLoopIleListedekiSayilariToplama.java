package day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_ForEachLoopIleListedekiSayilariToplama {

    public static void main(String[] args) {

        /*
            For-each loop, birden çok element barındıran yapılar için kullanılır.

            For-each loop'un görevi, verdiğimiz çok eleman barındıran yapıdaki TÜM ELEMENTLERI bize getirmektedir.

            Bu işlem için for-each loop'a 3 bilgi gereklidir
            1- Bize getireceği elementlerin data türü
            2- loop içinde bu elementlere vereceğimiz isim (bizim oğlanın adı)
            3- bu elementleri nereden alıp bize getireceği

            for-each loop index kullanmadığı için elementleri sıralı getirme mecburiyeti yoktur
            Genellikle sıralı getirir, ama sıralı getireceği varsayılarak işlem YAPILMAZ
         */

        Integer[] arr = {3, 5, 1, 2, 6, 4, 5, 1, 7, 8, 4, 2, 5, 6};

        List<Integer> sayilar = new ArrayList<>();

        // index kullanmadan arr' deki tüm elementleri, sayılar listesine kopyalayın


        for (Integer each : arr
        ) {
            sayilar.add(each);

        }

        System.out.println("Sayilar listesi : " + sayilar); // Sayilar listesi : [3, 5, 1, 2, 6, 4, 5, 1, 7, 8, 4, 2, 5, 6]

        // index kullanmadan, sayılar listesindeki, tüm elementlerin toplamını yazdırın

        int toplam = 0;

        for (Integer each : sayilar
        ) {

            toplam += each;

        }

        System.out.println("Sayilar listesindeki elementlerin toplami : " + toplam);

    }

}
