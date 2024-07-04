package day41_exceptions_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(7);
        sayilar.add(3);

        System.out.println(sayilar); // [5, 1, 7, 3]

        // Index kullanmadan listedeki sayilari 2'ser arttırın

        for (Integer each : sayilar
        ) {
            each = each + 2;
            System.out.print(each + " ");

        }

        System.out.println("");

        System.out.println(sayilar); // [5, 1, 7, 3]

        // Java'da çoklu obje bulunduran her yapı index'i desteklemez
        // Index olmadan da bazı işlemleri yapabilmek için Java Iterator interface'ini oluşturmuştur.

        // Iterator kullanarak sayılar listesindeki tüm sayıları toplayın

        Integer toplam = 0;

        Iterator iterator = sayilar.iterator();

        System.out.println(iterator.hasNext()); // true
        // yanında eleman varsa true, yoksa false döndürür


        toplam += (Integer) iterator.next();
        // iterator'ı yanındaki sayıdan sonraya geçirir ve geçtiği sayıyı bize döndürür
        toplam += (Integer) iterator.next();

        toplam += (Integer) iterator.next();

        toplam += (Integer) iterator.next();

        System.out.println(toplam); // 16

        // iterator ile çalışırken dikkat etmemiz gereken en önemli konu, iterator'ı nerede bıraktığımızdır.
        // bu soru için düşünürsek 51. satırda iterator en sona gitti
        // bir kere daha next() kullanırsak

        // System.out.println(iterator.next()); // NoSuchElementException

        // bu durumda iterator'a yeniden sıfırdan başlayarak değer ataması yapmak lazım
        iterator = sayilar.iterator();

        // Listedeki tüm sayıları iterator ile silin

        while (iterator.hasNext()) { // iterator'ın yanında eleman olduğu sürece true döner, böylece while loop çalışmaya devam eder

            iterator.next();

            iterator.remove();


        }

        System.out.println(sayilar); // []

    }

}
