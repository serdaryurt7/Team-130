package day20_arrays;

import day19_arrays.C02_ArrayinElemanlariniArtirma;

import java.util.Arrays;
import java.util.Scanner;

public class C01_KAO {
    public static void main(String[] args) {

        // Soru 5- Kullanıcıdan array'in boyutunu ve tamsayi elementlerini alıp, array'i oluşturan ve bize döndüren bir method oluşturun

        // System.out.println(Arrays.toString(arrayOlustur())); // direk yazdırıyor

        int[] benimArray = arrayOlustur(); // kaydedip yazdırıyor

        System.out.println(Arrays.toString(benimArray)); // kaydedip yazdırıyor

        // benim array'imdeki tüm sayilari 4 arttirin

        benimArray = C02_ArrayinElemanlariniArtirma.elemanlariArtir(benimArray, 4);

        System.out.println("Benim array : " + Arrays.toString(benimArray));

    }

    public static int[] arrayOlustur() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen array'e kac eleman koyacaginizi giriniz");

        int elemanSAyisi = scanner.nextInt();

        int[] arr = new int[elemanSAyisi];

        for (int i = 0; i < arr.length; i++) {

            System.out.println("Array'e eklemek icin bir sayi giriniz");
            arr[i] = scanner.nextInt();

        }

        return arr;

    }
}
