package day22_multiDimensionalArrays_ArrayLists;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {


        int[][] arr = {{3, 1, 2, 4}, {1, 2}, {3, 4, 5}, {10}, {2, 7}};
        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                toplam += arr[i][j];

            }

        }

        System.out.println("Tum elementlerin toplami : " + toplam); // Tum elementlerin toplami : 44

        // Bu array'deki tüm elementlerin toplamını yazdırın


        // Soru 3- Verilen 2 katlı bir array' de her bir iç array' deki elementleri toplayıp,
        //         yeni oluşturacağımız tek katlı bir array'e bu toplamları atayın
        // input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        // output: [10, 3, 12, 10, 9]

        int[] output = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            toplam = 0;
            for (int j = 0; j < arr[i].length; j++) {

                toplam += arr[i][j];

            }

            output[i] = toplam;

        }

        System.out.println(Arrays.toString(output)); // [10, 3, 12, 10, 9]

    }

}
