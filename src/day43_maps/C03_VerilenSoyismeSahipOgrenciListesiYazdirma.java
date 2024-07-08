package day43_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_VerilenSoyismeSahipOgrenciListesiYazdirma {

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ayse-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");
        ogrenciMap.put(107, "Esra-Han-11-M-SOZ");
        ogrenciMap.put(108, "Azim-Kan-12-L-SOZ");
        ogrenciMap.put(109, "Huseyin-Fan-12-H-MF");
        ogrenciMap.put(110, "Azim-Kayisi-11-K-TM");

        String istenenSoyisim = "CEM";
        // istenen soyisme sahip öğrencilerin, numara, isim ve bölümlerini yazdırın

        // 1- keySet'i oluşturalım

        Set<Integer> keySeti = ogrenciMap.keySet(); // [101, 102, 103, 104, 105, 106, 107, 108, 109, 110]

        // 2- keySet'indeki her bir key'in value'sune ulaşmak için bir for-each loop kullanalım

        for (Integer eachKey : keySeti
        ) {

            // 3- foreach loop'un getirdiği key'e ait value'yu kaydedelim

            String valueEach = ogrenciMap.get(eachKey); // Esra-Han-11-M-SOZ

            // 4- istenen bilgiye ulaşmak için, split yapıp array'e kaydedelim

            String[] valueEachArr = valueEach.split("-"); // [Esra, Han, 11, M, SOZ]

            // 5- istenen bilgiyi yazdıralım
            // istenen soyisme sahip öğrencilerin, numara, isim ve bölümlerini yazdırın

            if (valueEachArr[1].equalsIgnoreCase(istenenSoyisim)) {

                System.out.println(eachKey + " " + valueEachArr[0] + " " + valueEachArr[4]);

            }


        }


    }

}
