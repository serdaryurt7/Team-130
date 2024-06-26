package day19_arrays;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        int[] sayilar = {3, -5, 4, 6, -2, 9, 1};

        String[] isimler = {"ali", "veli", "saido", "sahil", "ali", "saido", "mehmet"};

        // sayilar array'indeki tüm sayıları 3 arttırıp, kaydedin

        sayilar = C02_ArrayinElemanlariniArtirma.elemanlariArtir(sayilar, 3);

        System.out.println(Arrays.toString(sayilar));

        // sayilar array'inin yeni halinde pozitif elementlerinin toplamını yazdırın

        System.out.println("Pozitif elementlerin toplami : " + C03_pozitifSayilariToplama.pozitifElemanlariTopla(sayilar));

        // isimler array'inde mehmet ismi kaç kere kullanılmış, yazdırın

        C04_KullanimAdediniBulma.elemanArama(isimler, "mehmet");

        // isimler array'inde ali ismi kaç kere kullanılmış, yazdırın

        C04_KullanimAdediniBulma.elemanArama(isimler, "ali");

    }
}
