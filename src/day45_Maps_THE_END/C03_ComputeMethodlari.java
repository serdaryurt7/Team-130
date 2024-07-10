package day45_Maps_THE_END;

import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.Map;

public class C03_ComputeMethodlari {

    public static void main(String[] args) {

        Map<String, Integer> harfler = new HashMap<>();

        harfler.put("K", 20);
        harfler.put("B", 30);
        harfler.put("C", 50);
        harfler.put("Z", 80);

        System.out.println(harfler); // {B=30, C=50, Z=80, K=20}

        // K'nin değerini 2 katına çıkarın
        int eskiDeger = harfler.get("K"); // 20
        harfler.put("K", 2 * eskiDeger);

        System.out.println(harfler); // {B=30, C=50, Z=80, K=40}

        // Eğer map' de A yoksa value = 44 olarak A ekleyin

        if (!(harfler.containsKey("A"))) {

            harfler.put("A", 44);
        }
        System.out.println(harfler); // {A=44, B=30, C=50, Z=80, K=40}

        // Eğer Z içeriyorsa value'sunu 10 arttırın

        if (harfler.containsKey("Z")) {
            eskiDeger = harfler.get("Z");
            harfler.put("Z", eskiDeger + 10);
        }
        System.out.println(harfler); // {A=44, B=30, C=50, Z=90, K=40}

        // B'nin value'sunu 20 arttırın

        harfler.compute("B", (k, v) -> v + 20);

        System.out.println(harfler); // {A=44, B=50, C=50, Z=90, K=40}

        // C'nin değerinin 3 katının 10 eksiğini yapın

        harfler.compute("C", (a, b) -> (b * 3) - 10);

        System.out.println(harfler); // {A=44, B=50, C=140, Z=90, K=40}

        // D'nin değerini 5 arttır

        // harfler.compute("D", (k, v) -> v + 5); // olmayan bir element kullanılırsa : NullPointerException

        // Eğer key olarak D varsa değerini 5 artır

        System.out.println(harfler.computeIfPresent("D", (k, v) -> v + 5)); // null

        System.out.println(harfler); // {A=44, B=50, C=140, Z=90, K=40}

        // Eğer key olarak B varsa değerini 5 artır

        harfler.computeIfPresent("B", (k, v) -> v + 5);

        System.out.println(harfler); // {A=44, B=55, C=140, Z=90, K=40}

        // Eğer map'de T yoksa value = 20 olarak T ekleyin

        harfler.computeIfAbsent("T", v -> 20);

        System.out.println(harfler); // {A=44, B=55, C=140, T=20, Z=90, K=40}
    }


}
