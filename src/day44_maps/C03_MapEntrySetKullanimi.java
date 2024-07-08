package day44_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_MapEntrySetKullanimi {

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

        // ogrenciMap'indeki tüm key'leri yazdirin

        System.out.println(ogrenciMap.keySet());

        // ogrenciMap'indeki tüm value'ları yazdırın

        System.out.println(ogrenciMap.values());

        System.out.println("==========");

        System.out.println(ogrenciMap);

        // bu iki method ile key ve value'lere ayrı ayrı erişebilirim
        // java key ve value'lara beraber erişebilmemiz için, alternatif bir yöntem olarak EntrySet<> oluşturmuştur

        Set<Map.Entry<Integer, String>> ogrenciEntrySeti = ogrenciMap.entrySet();

        System.out.println("==========");

        System.out.println(ogrenciEntrySeti);

        // KeySet kullanmak yerine EntrySet kullanmanın 2 avantajı vardır
        // 1- önce key'e gidip oradan value'ye ulaşmak yerine
        //    entry'den hem key'e hem value' ye ulaşabiliriz
        // 2- entry.setValue() ile direk map'i update edebilirsiniz

        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySeti
        ) {

            String[] eachValueArr = eachEntry.getValue().split("-");

            String mevcutSinif = eachValueArr[2];

            if (mevcutSinif.equals("12") || mevcutSinif.equalsIgnoreCase("Mezun")) {
                eachValueArr[2] = "Mezun";


            } else {
                eachValueArr[2] = Integer.parseInt(mevcutSinif) + 1 + "";
            }

            eachEntry.setValue(eachValueArr[0] + "-" + eachValueArr[1] + "-" + eachValueArr[2] + "-" + eachValueArr[3] + "-" + eachValueArr[4]);

        }

        System.out.println(ogrenciMap);

    }

}
