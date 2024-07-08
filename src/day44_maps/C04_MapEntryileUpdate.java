package day44_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C04_MapEntryileUpdate {

    public static void main(String[] args) {

        // Öğrenci map'inde verilen sinifdaki (örneğin 10) herkesin sınıfını verilen yeni sınıf (örneğin 11) yapın

        String eskiSinif = "10";
        String yeniSinif = "11";

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

        Set<Map.Entry<Integer, String>> ogrenciEntrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySeti
        ) {

            String[] eachValueArr = eachEntry.getValue().split("-");

            if (eachValueArr[2].equals(eskiSinif)) {
                eachValueArr[2] = yeniSinif;
            }

            // entrySeti'nde yapılan value ataması otomatik olarak map'e de işleniyor
            eachEntry.setValue(eachValueArr[0] + "-" + eachValueArr[1] + "-" + eachValueArr[2] + "-" + eachValueArr[3] + "-" + eachValueArr[4]);

        }


    }

}
