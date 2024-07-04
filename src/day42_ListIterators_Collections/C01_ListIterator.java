package day42_ListIterators_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_ListIterator {

    public static void main(String[] args) {

        // ListIterator interface'i Iterator interface'inin child'ıdır.
        // dalayısıyla Iterator' a göre daha gazla method'a sahiptir.

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(7);
        sayilar.add(3);

        System.out.println(sayilar); // [5, 1, 7, 3]

        // listedeki tüm sayıları, index kullanmadan 2 arttırın

        ListIterator lit = sayilar.listIterator();

        while (lit.hasNext()) {

            Integer sayi = (Integer) lit.next(); // bir yana geçip, üzerinden geçtiği elementi bize getirir

            lit.set(sayi + 2);

        }

        System.out.println(sayilar); // [7, 3, 9, 5]

        // Iterator'da takip etmemiz gereken en önemli konu,
        // iterator'ı nerede bıraktığımızdır
        // örneğin bu soruda iterator 34.satır itibari ile en sonda

        // listedeki elementleri, index kullanmadan, sondan başa doğru yazdırın

        while (lit.hasPrevious()) {

            System.out.print(lit.previous() + " ");
        }

        System.out.println("");

        // index kullanmadan bir kere daha sondan başa tüm elementleri yazdırın.
        // şuanda iterator en başta, tekrar sona başa gelebilmesi için, önce iterator'ı sona yollamalıyız

        while (lit.hasNext()) { // bu loop iterator'ı sona yollar

            lit.next();

        }

        while (lit.hasPrevious()) {

            System.out.print(lit.previous() + " ");
        }

        System.out.println("");

        // tüm elementleri gözden geçirip, 5'ten büyük olanları silin

        System.out.println(sayilar); // [7, 3, 9, 5]

        // ilk düşüneceğimiz iterator nerede ?
        // iterator'ın yerinden emin değilsek, yeniden değer atayabiliriz

        lit = sayilar.listIterator(); // iterator'ı en başa koyar

        while (lit.hasNext()) {

            if ((Integer) lit.next() > 5) {

                lit.remove();
            }

        }
        sayilar.set(1, -4);
        System.out.println(sayilar); // [3, -4]

        // listedeki sayıları kontrol edip, 0'dan büyük olanlara 7 ekleyin

        lit = sayilar.listIterator();

        while (lit.hasNext()) {

            Integer sayi = (Integer) lit.next();

            if (sayi > 0) {
                lit.set(sayi + 7);

            }

        }

        System.out.println(sayilar);

    }

}
