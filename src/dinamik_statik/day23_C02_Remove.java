package dinamik_statik;

import java.util.ArrayList;
import java.util.List;

public class day23_C02_Remove {

    public static void main(String[] args) {

        String[] harfler = {"J", "a", "v", "l", "b", "b", "a"};

        List<String> harflerListesi = new ArrayList<>();

        for (int i = 0; i < harfler.length; i++) {

            harflerListesi.add(harfler[i]);

        }

        System.out.println(harflerListesi); // [J, a, v, l, b, b, a]

        // harfler listesinden a'yı silin

        System.out.println(harflerListesi.remove("a")); // true

        System.out.println(harflerListesi); // [J, v, l, b, b, a]

        System.out.println(harflerListesi.remove("x")); // false

        System.out.println(harflerListesi); // [J, v, l, b, b, a]


        /*
             Eğer parametre olarak bir obje yazarsak, gidip o objeye uyan elementlerden ilk bulduğunu siler.
             Delil olarakta silip silmediğini anlamamız için true / false döndürür

             Eğer remove ile index verirsek,
             o index'i bulamama ihtimali olmadığından
             gidip o index'deki elemanı siler
             ve delil olarak sildiği elemanı bize getirir
         */

        System.out.println(harflerListesi.remove(2)); // l

        System.out.println(harflerListesi); // [J, v, b, b, a]

        harflerListesi.remove("b");

        System.out.println(harflerListesi); // [J, v, b, a]

        harflerListesi.set(1, "");

        System.out.println(harflerListesi); // [J, , b, a]

        harflerListesi.remove(1);

        System.out.println(harflerListesi); // [J, b, a]

        List<String> silinenHarfler = new ArrayList<>();

        System.out.println(silinenHarfler.add(harflerListesi.remove(1))); // true

        // 1- silinen harflere yeni bir element ekledi ve true döndürdü
        // 2- harfListesi.remove(1) harf listesinden 1.index'deki b'yi sildi ve bize getirdi
        // 3- getirdiği b elementi silinen harflere eklendi

        System.out.println(silinenHarfler); // [b]
        System.out.println(harflerListesi); // [j, a]

        String silinenharf = harflerListesi.remove(0);
        silinenHarfler.add(silinenharf);


    }

}
