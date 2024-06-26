package dinamik_statik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day22_C05_ArraydenTekrarEdenleriSilme {

    public static void main(String[] args) {

        // verilen bir array'de tekrar eden elementleri silip, array'i her elementin sadece 1 kere kullanıldığı hale getirin

        int[] arr = {3, 6, 1, 4, 7, 3, 9, 4, 2, 3, 6, 1, 4, 3, 5, 3, 1, 4};

        List<Integer> tekrarsizList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!tekrarsizList.contains(arr[i])) {

                tekrarsizList.add(arr[i]);

            }

        }

        System.out.println(tekrarsizList);

        // tekrarsız hale gelen array DEGIL, bizim oluşturduğumuz liste
        // array'e yeni bir array değeri atayıp, listedeki elementleri yeni array'e taşımalıyız

        int[] yeniArr = new int[tekrarsizList.size()]; // [0, 0, 0, 0, 0, 0, 0]

        for (int i = 0; i < yeniArr.length; i++) {

            yeniArr[i] = tekrarsizList.get(i);

        }

        arr = yeniArr;
        Arrays.sort(arr);
        System.out.println("Array'in son hali : " + Arrays.toString(arr));

    }

}
