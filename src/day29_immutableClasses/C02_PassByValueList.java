package day29_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValueList {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        System.out.println(elemanEkle(sayilar)); // [10, 20, 30]
        System.out.println(sayilar); // [10, 20, 30]
        System.out.println(yeniListOlustur(sayilar)); // [50, 60, 70]
        System.out.println(sayilar); // [10, 20, 30]
    }

    public static List<Integer> yeniListOlustur(List<Integer> sayilar) {

        sayilar = new ArrayList<>(); // New lendiği için array değişiyor bu yüzden main method etkilenmez.
        sayilar.add(50);
        sayilar.add(60);
        sayilar.add(70);

        return sayilar;
    }

    public static List<Integer> elemanEkle(List<Integer> sayilar) {

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        System.out.println(sayilar); // [10, 20, 30]
        return sayilar;
    }

}
