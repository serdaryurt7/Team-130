package day45_Maps_THE_END;

import java.util.Map;
import java.util.TreeMap;

public class C06_TreeMap {

    public static void main(String[] args) {

        //Map<String, Integer> harfler = new TreeMap<>();
        TreeMap<String, Integer> harfler = new TreeMap<>();

        harfler.put("K", 20);
        harfler.put("B", 30);
        harfler.put("C", 50);
        harfler.put("Z", 80);
        harfler.put("A", 30);
        harfler.put("E", 50);
        harfler.put("U", 80);

        System.out.println(harfler); // {A=30, B=30, C=50, E=50, K=20, U=80, Z=80}

        /*
            Eğer data türü olarak Map seçilirse, diğer tüm map'lerle HashMap vs ile ortak olan özellikleri gösterir

            Data türü TreeMap seçilince, tüm map'lerde olan ortak method'ların tamamı geldiği gibi, sadece TreeMap'e özel olan bazı method'lar da gelir
         */

        System.out.println(harfler.lowerKey("K")); // E <
        System.out.println(harfler.lowerKey("T")); // K <

        System.out.println(harfler.floorKey("E")); // E <=
        System.out.println(harfler.floorKey("D")); // C <=

        System.out.println(harfler.higherKey("F")); // K >
        System.out.println(harfler.higherKey("U")); // Z >
        System.out.println(harfler.ceilingKey("C")); // C >=
        System.out.println(harfler.ceilingKey("D")); // E >=

        System.out.println(harfler.descendingMap()); // {Z=80, U=80, K=20, E=50, C=50, B=30, A=30}

        // harfler = harfler.descendingMap();
        // TreeMap HERZAMAN doğal sıralı olarak elemanlarını tutar
        // ters sıralı olan bir map, TreeMap olarak kaydedilemez

        harfler.put("M", 34);

        // tree map elemanları doğal sıralı tuttuğu için, önce M'nin nerede olması gerektiğini hesaplar, sonra put işlemini yapar

        System.out.println(harfler); // {A=30, B=30, C=50, E=50, K=20, M=34, U=80, Z=80}

        System.out.println(harfler.subMap("C", "M")); // {C=50, E=50, K=20}
        System.out.println(harfler.tailMap("K")); // {K=20, M=34, U=80, Z=80}
        System.out.println(harfler.headMap("M")); // {A=30, B=30, C=50, E=50, K=20}

        // Java'da işemler başlangıç index'leri dahil, bitiş index'leri hariç olarak yapılır
        // TreeMap bu konuda da bize bir alternatif daha sunmuş

        System.out.println(harfler.tailMap("K", false)); // {M=34, U=80, Z=80}

        System.out.println(harfler.headMap("M", true)); // {A=30, B=30, C=50, E=50, K=20, M=34}

    }

}
