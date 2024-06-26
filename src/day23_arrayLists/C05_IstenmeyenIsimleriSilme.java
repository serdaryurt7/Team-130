package day23_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_IstenmeyenIsimleriSilme {
    public static void main(String[] args) {

        // Soru 3- Verilen String bir listede, istenmeyen harf içeren elementleri silip,
        // kalan kısmını list olarak bize döndüren bir method oluşturun

        List<String> isimler = new ArrayList<>();
        isimler.add("Meltem");
        isimler.add("Ramazan");
        isimler.add("Saido");
        isimler.add("Kaan");
        isimler.add("Kamil");
        isimler.add("Eren");

        String istenmeyenHarf = "e";

        System.out.println(isimler); // [Meltem, Ramazan, Saido, Kaan, Kamil, Eren]

        List<String> silinmeyecekIsimler = new ArrayList<>();

        for (int i = 0; i < isimler.size(); i++) {

            if (!isimler.get(i).contains(istenmeyenHarf)) {

                silinmeyecekIsimler.add(isimler.get(i));
            }
        }

        isimler = silinmeyecekIsimler;

        System.out.println(isimler); // [Ramazan, Saido, Kaan, Kamil]

        // başka bir listeye atamadan direk silme yapabilir miyiz ?

        istenmeyenHarf = "i";

        for (int i = 0; i < isimler.size(); i++) {

            if (isimler.get(i).contains(istenmeyenHarf)) {

                isimler.remove(isimler.get(i));
                i--; // isim silindiği için kontrole bir öncekinden başlaması için
            }

        }

        System.out.println(isimler);


    }

}
