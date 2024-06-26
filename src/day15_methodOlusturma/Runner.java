package day15_methodOlusturma;

import day16_methodOlusturma_methodOverloading.C01_voidMethodOlusturma;

public class Runner {
    public static void main(String[] args) {

        C02_AsalSayiMethodu.asalSayiMi(61); // Verilen sayi asal
        C02_AsalSayiMethodu.asalSayiMi(83); // Verilen sayi asal

        System.out.println(C03_TamBolenlerSayisi.pozitifTamBolenSayisi(234564)); // 24

        System.out.println(C03_TamBolenlerSayisi.pozitifTamBolenSayisi(61)); // 2

        C01_voidMethodOlusturma.kisiBilgileriYazdir("sahil","baylarli","8901345687649872");

    }
}
