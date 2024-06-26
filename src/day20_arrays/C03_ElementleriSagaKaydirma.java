package day20_arrays;

import java.util.Arrays;

public class C03_ElementleriSagaKaydirma {
    public static void main(String[] args) {

        // Soru 3- Verilan bir array'deki tüm elementleri bir sağa kaydırıp,
        //         sondaki elementi de başa taşıyacak bir method oluşturun, array'i yeni hali ile kaydedin.
        //         Orn : input : [4,5,6,7]            array'in son hali [7,4,5,6]

        // arr[son] = arr[son-1]

        int[] arr = {4, 5, 6, 7, 3};

        int temp = arr[arr.length - 1]; // dinamik olması için son elemanı boş kovaya koyduk

        for (int i = arr.length - 1; i >= 1; i--) {

            arr[i] = arr[i - 1];
        }

        // boş kovaya aldığımız elementi, en başa koyalım

        arr[0] = temp;

        System.out.println(Arrays.toString(arr));

        int[] sayilar = {3, 0, 2, 5};

        sayilar = elementleriSagaKaydir(sayilar);

        System.out.println("Sayilarin son hali : " + Arrays.toString(sayilar));

    }

    public static int[] elementleriSagaKaydir(int[] arr) {

        int temp = arr[arr.length - 1];

        for (int i = arr.length - 1; i >= 1; i--) {

            arr[i] = arr[i - 1];

        }

        arr[0] = temp;

        return arr;

    }

}
