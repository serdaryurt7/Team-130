package day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ElemanlariGruplama {

    public static void main(String[] args) {

        // Verilen bir int array'de, elementleri 3'erli gruplar halinde toplayıp, bu toplamları bir liste olarak yazdırın.

        int[] arr = {3, 6, 1, 9, 2, 0, 6, 3, -1, -5, 9, 11, 1, 2, 3, 5, 6, 7};

        // output ==> [10, 11, 8, 15]

        List<Integer> toplamlarListesi = new ArrayList<>();
        int toplam = 0;
        int sayac = 1;

        for (int i = 0; i < arr.length; i++) {


            if (sayac == 3) {

                toplam += arr[i];
                toplamlarListesi.add(toplam);
                toplam = 0;
                sayac = 1;

            } else {
                toplam += arr[i];
                sayac++;

            }
        }

        System.out.println(toplamlarListesi);

    }
}
