package day44_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_MapdekiIsimleriDuzenleme {

    public static void main(String[] args) {

        // 4- Ogrenci Map'indeki tüm isimleri ilk harf büyük sonraki harfler küçük,
        // tüm soyisimleri ile tamamen büyük harf yapın

        Map<Integer, String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");
        ogrenciMap.put(107, "Esra-Han-11-M-SOZ");
        ogrenciMap.put(108, "Azim-Kan-12-L-SOZ");
        ogrenciMap.put(109, "Huseyin-Fan-12-H-MF");
        ogrenciMap.put(110, "Azim-Kayisi-11-K-TM");

        // update isteniyor

        // tum key'leri alalım

        Set<Integer> keySeti = ogrenciMap.keySet();

        // bir for-each loop ile keySet'indeki tüm key'lere ait value'ları gözden geçirelim

        for (Integer eachKey : keySeti
        ) {

            // value'yu String olarak kaydedelim

            String eachValue = ogrenciMap.get(eachKey);

            // split ile value'yu array'e çevirelim

            String[] eachValueArr = eachValue.split("-");

            // array'de update yapalım
            // tüm isimleri ilk harf büyük sonraki harfler küçük,
            // tüm soyisimleri ile tamamen büyük harf yapın

            eachValueArr[0] = eachValueArr[0].substring(0, 1).toUpperCase() + // ilk harf büyük, geriye kalanlar küçük
                    eachValueArr[0].substring(1).toLowerCase();

            eachValueArr[1] = eachValueArr[1].toUpperCase(); // tüm harfleri büyük yaptı

            // array'i yeniden String value formatına sokalım

            String yeniValue = eachValueArr[0] + "-" + eachValueArr[1] + "-" + eachValueArr[2] + "-" + eachValueArr[3] + "-" + eachValueArr[4];

            // key ile yeni updated value'yu kullanarak map'i update edelim

            ogrenciMap.put(eachKey, yeniValue);
        }

        System.out.println(ogrenciMap);

    }

}
