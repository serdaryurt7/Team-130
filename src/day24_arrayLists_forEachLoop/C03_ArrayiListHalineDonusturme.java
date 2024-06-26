package day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArrayiListHalineDonusturme {

    public static void main(String[] args) {

        Integer[] sayilarArray = {1, 2, 3, 6, 7, 4, 3, 5};

        /*
         *       Bir array'i list haline çevirmek için en güvenilir yöntem
         *       bir loop ile  tüm elementleri list' e kopyalamaktır.
         *
         *       Aslında daha kısa bir yolu vardır ama iki büyük yan etkisi olduğundan
         *       bunlara dikkat etmek gerekir.
         *
         *      1- Oluşturduğumuz liste Arrays class' i ile oluşturulduğundan, ekleme çıkarma gibi
         *      listenin uzunluğunu değiştirecek işlemlere IZIN VERMEZ.
         *
         *      2 - Array ve bu array'den oluşturulan List, birbiri ile bağımlı kalır.
         *      Birinde sonradan yapılan değişiklikler, otomatik olarak diğerine de işlenir.
         *
         * */

        List<Integer> sayilarListesi = Arrays.asList(sayilarArray);

        System.out.println("Sayilar Listesi : " + sayilarListesi);
        // Sayilar Listesi : [1, 2, 3, 6, 7, 4, 3, 5]

        // sayilarListesi.add(9); // UnsupportedOperationException

        // Listeden 7' yi silin

        Object silinecekElement = 7;

        // sayilarListesi.remove(silinecekElement); // UnsupportedOperationException: remove


        System.out.println("Sayilar listesi : " + sayilarListesi);
        System.out.println("Sayilar array'i : " + Arrays.toString(sayilarArray));

        // array'in 2.index'indeki sayıyı 10 yapın

        sayilarArray[2] = 10;

        System.out.println("Array update'i sonrasi Sayilar listesi : " + sayilarListesi);
        System.out.println("Array update'i sonrasi Sayilar array'i : " + Arrays.toString(sayilarArray));


        List<Integer> fiyatList = new ArrayList<>();
        fiyatList.add(10);
        fiyatList.add(20);
        fiyatList.add(30);

        Integer[] kontrolArrayi = {10, 20, 30};

        // fiyat listesinin, kontrol listesi olarak verilen array ile aynı olduğunu test edin

        List<Integer> kontrolListesi = Arrays.asList(kontrolArrayi);

        if (fiyatList.equals(kontrolListesi)) {

            System.out.println("test PASSED");

        } else {
            System.out.println("test FAILED");
        }


    }

}
