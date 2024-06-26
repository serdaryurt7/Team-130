package day22_multiDimensionalArrays_ArrayLists;

import java.util.Arrays;

public class C03_MDA {

    public static void main(String[] args) {

        // Soru 2- Verilen 2 katlı bir array'de, aynı index'e sahip elementleri toplayıp,
        //         yeni oluşturacağımız tek katlı bir array'e bu toplamları atayın
        // input    : int[][] arr = {{3,4,5}, {2,3,6,7,8}, {1,2,3}, {2,4}};
        // output   : [5, 7, 11]

        // output array'i kısa inner array'in uzunluğuna eşit olacak
        // inner array sayısını dinamik olacak şekilde düşünelim

        int[][] arr = {{3, 4, 5}, {2, 3, 6, 7, 8}, {1, 2, 3}, {2, 4, 1}};

        // output'un uzunluğu en kısa array'in uzunluğuna eşit olacak, o zaman en kısa array'in uzunluğunu bulalım

        int enKisaInnerLength = arr[0].length;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length < enKisaInnerLength) {

                enKisaInnerLength = arr[i].length;
            }
        }

        int[] output = new int[enKisaInnerLength];


        for (int i = 0; i < output.length; i++) {  // output'un icine konacak index

            for (int j = 0; j < arr.length; j++) { // arr'deki herbir inner array'in elementini bulacak

                output[i] += arr[j][i];

            }

            System.out.println(Arrays.toString(output));

        }


    }
}
