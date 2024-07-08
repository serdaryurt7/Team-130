package day43_maps;

import java.util.HashMap;
import java.util.Map;

public class C05_IstenenOgrencininSoyisminiUpdateEtme {

    public static void main(String[] args) {

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

        // 110 numaralı öğrencinin soyismini mismis yapın

        ogrenciMap.put(103, "Ali-Han-12-M-MF");

        System.out.println(ogrenciMap.get(103)); // Ali-Han-12-M-MF
        // eğer bir map'de varolan key ile yeni bir element eklerseniz
        // o key'e ait eski value'yu siler, yeni value'yu kabul eder

        // soruyu manuel olarak yapacak olsaydık
        // ogrenciMap.put(110, "Azim-Mismis-11-K-TM");

        /*
            Update işlemlerini dinamik olarak yapabilmek için,
            önce değiştirmek istediğimiz bilgiye ulaşmalıyız
            bunu önceki sorularda yaptığımız gibi, önce value'ye ulaşıp,
            value'yu split edip istediğimiz bilgiye ulaşabiliriz
         */

        // 1- istenen öğrencinin value'sune ulaşıp kaydedin

        String value110 = ogrenciMap.get(110); // Azim-Kayisi-11-K-TM

        // 2- value110' da istediğimiz bilgiye ulaşabilmek için split yapıp kaydedin

        String[] value110Arr = value110.split("-"); // [Azim, Kayisi, 11, K, TM]

        // 3- şimdi istenen değişikliği array'de yapın

        value110Arr[1] = "Mismis"; // [Azim, Mismis, 11, K, TM]

        // istenen değişikliği array'de yaptıktan sonra, map'i güncelleyebilmek için
        // array'i yeniden String value formuna dönüştürmeliyiz
        // Azim-Mismis-11-K-TM

        // 4- değişen array'i yeniden value Formatine getir

        String yeniValue = value110Arr[0] + "-" + value110Arr[1] + "-" + value110Arr[2] + "-" + value110Arr[3] + "-" + value110Arr[4]; // Azim-Mismis-11-K-TM

        // 5- map'i güncelle

        ogrenciMap.put(110, yeniValue);

        System.out.println(ogrenciMap);

    }
}
