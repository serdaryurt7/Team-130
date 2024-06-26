package dinamik_statik;

import day19_arrays.C04_KullanimAdediniBulma;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        String[] harfler = {"a", "c", "r", "s", "a", "a", "s", "k", "a"};

        // Verilen harfler array'inde "k" harfinin olup olmadığını yazdırın.

        C04_KullanimAdediniBulma.elemanArama(harfler, "k");
        // Istenen eleman k  array'de 1 kere kullanilmis

        // "A" var mi ?

        C04_KullanimAdediniBulma.elemanArama(harfler, "A");
        // Istenen eleman A  array'de yok

        int[] arr = {3, 9, 1, 17, 5, 2, 20};
        // verilen arr' de 2 var mı ?

        System.out.println(Arrays.binarySearch(arr, 2)); // -1
        System.out.println(Arrays.binarySearch(arr, 20)); // 6
        System.out.println(Arrays.binarySearch(arr, 1)); // -1
        System.out.println(Arrays.binarySearch(arr, 17)); // 3
        System.out.println(Arrays.binarySearch(arr, 3)); // 0
        System.out.println(Arrays.binarySearch(arr, 5)); // -2
        System.out.println(Arrays.binarySearch(arr, 9)); // 1

        // BinarySearch, binaryTree özelliğini kullandığından, arama işleminden önce sort işlemi YAPILMALIDIR.
        // sort işlemi yapılmadan binarySearch kullanılırsa
        // sonuç ÖNGÖRÜLEMEZ, doğru da olabilir yanlış da olabilir.

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 2)); // -1
        System.out.println(Arrays.binarySearch(arr, 20)); // 6
        System.out.println(Arrays.binarySearch(arr, 1)); // 0
        System.out.println(Arrays.binarySearch(arr, 17)); // 5
        System.out.println(Arrays.binarySearch(arr, 3)); // 2
        System.out.println(Arrays.binarySearch(arr, 5)); // 3
        System.out.println(Arrays.binarySearch(arr, 9)); // 4

        // [1, 2, 3, 5, 9, 17, 20]
        System.out.println(Arrays.binarySearch(arr, -3)); // -1
        System.out.println(Arrays.binarySearch(arr, 0)); // -1
        System.out.println(Arrays.binarySearch(arr, 4)); // -4

        // olmayan sayılarda olmadığını belirtmek için - kullanılır
    }

}
