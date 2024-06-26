package dinamik_statik;

import java.util.Arrays;

public class day22_C03_MDA {

    public static void main(String[] args) {

        // Soru 2- Verilen 2 katlı bir array'de, aynı index'e sahip elementleri toplayıp,
        //         yeni oluşturacağımız tek katlı bir array'e bu toplamları atayın
        // input    : int[][] arr = {{3,4,5}, {2,3,6,7,8}, {1,2,3}, {2,4}};
        // output   : [5, 7, 11]

        // output array 'i kısa inner array'in uzunluğuna eşit olacak
        // inner array sayısını dinamik olacak şekilde düşünelim

        int[][] arr = {{3, 4, 5}, {2, 3, 6, 7, 8}, {1, 2, 3}, {2, 4, 1}};

        // output'un uzunluğu en kısa array'in uzunluğuna eşit olacak, o zaman en kısa array'in uzunluğunu bulalım

        int enKisaInnerLength = arr[0].length;

        for (int i = 0; i < arr.length; i++) {

            if (enKisaInnerLength > arr[i].length) {    // en kısa inner length ataması yapıldı, aralarında if ile karşılaştırılarak bulundu.

                enKisaInnerLength = arr[i].length;

            }

        }

        int[] output = new int[enKisaInnerLength];

        for (int i = 0; i < output.length; i++) {

            for (int j = 0; j < arr.length; j++) {     // output array'i oluşturuldu ve en kısa innerlength değeri verildi.  sonrasında iç içe for loop ile output'un length i kadar ve arr nin length'i kadar gezerek, toplayarak output a atandı.

                output[i] += arr[j][i];                 //  arr[j][i] =  arr [0][0] + arr [1][0] + arr [2][0] + arr [3][0]
                                                        //  arr[j][i] =  arr [0][1] + arr [1][1] + arr [2][1] + arr [3][1]
            }                                           //  arr[j][i] =  arr [0][2] + arr [1][2] + arr [2][2] + arr [3][2]

        }

        System.out.println(Arrays.toString(output));

    }
}
