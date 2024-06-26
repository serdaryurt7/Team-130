package day29_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C03_Mutable_ImmutableClasses {  //Mutable : değişken, değişebilen, // Immutable : değişmez, durağan, sabit

    public static void main(String[] args) {

        /*
            String class'ı IMMUTABLE olduğu için, method ile yapılan değişiklikler kalıcı değişiklik yapmaz.

            Ancakkk ArrayList MUTABLE olduğundan method ile yapılan değişiklikler KALICI olur.

         */

        String isim = "Ramazan";

        isim.toUpperCase();

        System.out.println(isim.replace("a", "i")); // Rimizin

        isim.concat(" Tatar");

        System.out.println(isim); // Ramazan

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10); // eklendi
        sayilar.add(20); // eklendi
        sayilar.add(30); // eklendi
        sayilar.remove(1); //  1. index, 20 silindi
        sayilar.set(1, 40); // 1. index, 40 olarak set edildi

        System.out.println(sayilar); // [10, 40]

    }

}
