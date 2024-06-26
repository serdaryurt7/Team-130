package day20_arrays;

import java.util.Arrays;

public class C04_ArrayeElementEkleme {
    public static void main(String[] args) {

        // Soru 7- Verilen bir array'e istenen bir elemanı ekleyip bize döndüren bir method yazın, eski array'e yeni değeri atayın.

        int[] arr = {3, 6, 7, 9};

        int eklenecekEleman = 1;

        // arr[3] = eklenecekEleman; // ArrayIndexOutOfBoundsException

        // önce 4 kişilik bir yeni Arr oluşturalım

        int[] yeniArr = new int[arr.length + 1]; // [0, 0, 0, 0]

        // bir for loop oluşturup, eski array'deki tüm elementleri yeni array'e kopyalayalım

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i] = arr[i];

        }

        // en son element olarak yeniArr'e eklenecek sayıyı atayalım

        yeniArr[yeniArr.length - 1] = eklenecekEleman;

        arr = yeniArr;

        System.out.println(Arrays.toString(arr)); // [3, 6, 7, 9, 1]

        // array'e yeni eleman olarak 5, 7 ve 3 ekleyelim

        arr = arrayElementEkle(arr, 5);
        arr = arrayElementEkle(arr, 7);
        arr = arrayElementEkle(arr, 3);

        System.out.println(Arrays.toString(arr));


    }

    public static int[] arrayElementEkle(int[] arr, int eklenecekSayi) {

        // önce uzunluğu eski array'den 1 fazla olan yeni bir array oluşturalım

        int[] yeniArr = new int[arr.length + 1];

        // eski array'deki tüm elementleri yeni array'e atayalım

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i] = arr[i];

        }

        // en son element olarak eklenecek sayiyi atayalim

        yeniArr[yeniArr.length - 1] = eklenecekSayi;

        return yeniArr;

    }
}
