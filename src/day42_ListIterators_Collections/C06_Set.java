package day42_ListIterators_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_Set {
    public static void main(String[] args) {

        // set'in 2 özelliği mutlaka bilinmeli
        // 1- her elemandan sadece 1 tane olabilir,
        //    var olan elementi yeniden eklemek isterseniz, eskiyi siler, aynı elementin yenisini kaydeder
        // 2- index desteklemez

        int[] arr = {4, 5, 8, 7, 6, 5, 4, 3, 2, 35, 6, 7, 3, 61, 2, 9, 8, 1};

        // verilen array'i unique elementlerden oluşan tekrarsız bir array haline getirin

        Set<Integer> uniqueSet = new HashSet<>();

        // bir loop ile array'deki tüm sayıları uniqueSet' e ekleyelim

        for (int each : arr
        ) {

            uniqueSet.add(each);
        }

        System.out.println(uniqueSet); // [1, 2, 3, 35, 4, 5, 6, 7, 8, 9, 61]

        // Bizim unique sayilarla elde ettiğimiz set
        // şimdi bu set'teki elementleri, kendi arr'mize atamalıyız

        arr = new int[uniqueSet.size()]; // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        int index = 0;
        for (Integer each : uniqueSet
        ) {

            arr[index] = each;
            index++;
        }

        System.out.println("Array'in son hali : " + Arrays.toString(arr));


    }
}
