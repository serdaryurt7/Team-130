package day45_Maps_THE_END;

import java.util.HashMap;
import java.util.Map;

public class C02_MapMethodlari {

    public static void main(String[] args) {

        // Soru : Verilen bir array'de kullanılan harfleri ve kaçar defa kullanıldığını yazdırın
        //
        // Input : {a,b,c,d,e,c,d,b,e,a,c,b,d,a}
        // output :     a kullanimi : 3 adet  a=3
        //              b kullanimi : 3 adet  b=3
        //              c kullanimi : 3 adet  c=3
        //              d kullanimi : 3 adet  d=3
        //              e kullanimi : 2 adet  e=2

        String[] harfler = {"a", "b", "c", "d", "e", "c", "d", "b", "e", "a", "c", "b", "d", "a"};

        // bir map oluşturalım, key harfler, value ise kullanım adedi olsun

        Map<String, Integer> harfKullanimMapi = new HashMap<>();

        for (String each : harfler
        ) {

            if (harfKullanimMapi.containsKey(each)) { // gelen harf map'de var
                int harfinEskiKullanimSayisi = harfKullanimMapi.get(each);
                harfKullanimMapi.put(each, harfinEskiKullanimSayisi + 1);

            } else { // gelen harf map'de yok

                harfKullanimMapi.put(each, 1); // map'de yoktu biz ekledik
            }
        }

        System.out.println(harfKullanimMapi);

    }

}
