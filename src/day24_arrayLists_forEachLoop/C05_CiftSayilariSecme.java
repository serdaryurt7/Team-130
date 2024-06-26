package day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_CiftSayilariSecme {

    public static void main(String[] args) {

        // Verilen int bir array'den çift sayıları alıp, ayrı bir array olarak kaydedin

        int[] arr = {3, 5, 1, 7, 9, 0, 4, 2, 6, 7, 8, 1, 5, 8, 7, 6};

        /*
            istenen elementleri bir array olarak istediği için iki şekilde yapabiliriz

            1- önce kaç tane çift sayı olduğunu bulur,
            sayıya göre bir array oluşturup çift sayıları oluşturulan yeni array'e kopyalarız

            2- arraydeki tüm elementleri gözden geçirip, çift olanları bir listeye atarız
            listenin uzunluğuna göre yeni array oluşturup, listedeki elementleri yeni array'e kopyalarız
         */

        List<Integer> ciftSayilarListesi = new ArrayList<>();

        for (Integer each : arr
        ) {
            if (each % 2 == 0) {

                ciftSayilarListesi.add(each);


            }
        }

        System.out.println(ciftSayilarListesi); // [0, 4, 2, 6, 8, 8, 6]

        int[] ciftSayilarArrayi = new int[ciftSayilarListesi.size()];

        /*

        Mantıklı olan yöntem for loop ile elementleri ciftSayilarArrayi'ine kopyalamaktır.

        for (int i = 0; i < ciftSayilarArrayi.length; i++) {

            ciftSayilarArrayi[i] = ciftSayilarListesi.get(i);

        }


         */


        // for-each loop ile yapmak istersek

        int index = 0;

        for (int each : ciftSayilarListesi
        ) {

            ciftSayilarArrayi[index] = ciftSayilarListesi.get(index);
            index++;

        }

        System.out.println("Cift sayilar array'i : " + Arrays.toString(ciftSayilarArrayi));

    }
}
