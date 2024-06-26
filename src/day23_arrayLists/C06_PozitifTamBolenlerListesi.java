package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_PozitifTamBolenlerListesi {

    public static void main(String[] args) {

        // Soru 6- Verilen pozitif bir tamsayiyi,
        // tam bölebilen tüm pozitif tamsayıları bir liste olarak bize döndüren bir method oluşturun.

        int sayi = 20; // [1, 2, 4, 5, 10, 20]

        List<Integer> tamBolenlerListesi = new ArrayList<>();

        for (int i = 1; i <= sayi; i++) {

            if (sayi % i == 0){

                tamBolenlerListesi.add(i);

            }

        }

        System.out.println("Tam bolenler listesi : " + tamBolenlerListesi);


    }

}
