package dinamik_statik;

import java.util.ArrayList;
import java.util.List;

public class day23_C06_PozitifTamBolenlerListesi {

    public static void main(String[] args) {

        // Soru 6- Verilen pozitif bir tamsayiyi,
        // tam bölebilen tüm pozitif tamsayıları bir liste olarak bize döndüren bir method oluşturun.

        int sayi = 200; // [1, 2, 4, 5, 10, 20]

        List<Integer> pozitifTamSayilarListesi = new ArrayList<>();

        for (int i = 1; i <= sayi; i++) {

            if (sayi % i == 0) {

                pozitifTamSayilarListesi.add(i);

            }

        }

        System.out.println(pozitifTamSayilarListesi);

    }
}
