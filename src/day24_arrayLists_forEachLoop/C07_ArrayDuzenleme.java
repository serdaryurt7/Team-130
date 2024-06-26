package day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C07_ArrayDuzenleme {

    public static void main(String[] args) {

        // Soru 3- Verilen String bir list'deki her bir elementi kontrol edip,
        // -- Kelimenin uzunluğu çift sayı ise ilk yarısını,
        // -- Kelimenin uzunluğu tek sayı ise ortadaki harf dahil ikinci yarısını,
        // -- yeni bir listeye ekleyip yazdırın.

        List<String> isimler = new ArrayList<>();

        isimler.add("Kaan");
        isimler.add("Sedat");
        isimler.add("Asli");
        isimler.add("Yakup");
        isimler.add("Saido");
        isimler.add("Sabri");

        List<String> yeniList = new ArrayList<>();

        for (String each : isimler
        ) {

            if (each.length() % 2 == 0) { // cift sayi

                yeniList.add(each.substring(0, each.length() / 2));

            } else { // tek sayi

                yeniList.add(each.substring(each.length() / 2));

            }

        }

        System.out.println(yeniList);

    }
}
