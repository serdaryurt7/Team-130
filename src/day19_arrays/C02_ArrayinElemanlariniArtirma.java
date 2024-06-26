package day19_arrays;

import java.util.Arrays;

public class C02_ArrayinElemanlariniArtirma {

    public static void main(String[] args) {  //String[] args:  Main method'un çalışması için ihtiyaç duyduğumuz String argument'ları barındıran bir array'miş.

        // Soru 1- Verilan bir int array'in tüm elemanlarını 2 artırıp bize döndüren method oluşturun. Eski array'i yeni haliyle kaydedin.

        int[] arr = {5, 1, 7, 9, 2};

        // eger array'in tüm elementlerini gözden geçirmeniz gerekiyorsa bir for loop kullanırız

        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i] + 2;

        }

        System.out.println(Arrays.toString(arr)); // [7, 3, 9, 11, 4]


        arr = elemanlariArtir(arr, 2); // [9, 5, 11, 13, 6]

        System.out.println(Arrays.toString(arr));

        arr = elemanlariArtir(arr, 5); // [14, 10, 16, 18, 11]

        System.out.println(Arrays.toString(arr));

    }

    public static int[] elemanlariArtir(int[] arr, int artisMiktari) {

        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i] + artisMiktari;

        }

        return arr;
    }
}
