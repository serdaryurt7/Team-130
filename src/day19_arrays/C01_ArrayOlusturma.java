package day19_arrays;

import java.util.Arrays;

public class C01_ArrayOlusturma {
    public static void main(String[] args) {

        int arr1 = 20;

        arr1 = 30;

        int[] arr2 = {3, 4, 5}; // data türü : int   ---    uzunluk : 3

        // array' de herhangi bir elemana ulaşmak veya değer atamak istersek index kullanırız

        System.out.println(arr2[2]); // 5
        System.out.println(arr2[1]); // 4

        // arr2'nin içindeki 4'ü 8 yapın

        arr2[1] = 8;

        // bu array 3 elemanlı olarak oluşturuldu

        // 4. eleman olarak 3. index'e atama yapmak istersek, Java syntax olarak işlem doğru olduğundan altını çizmez

        // arr2[3] = 20; // ArrayIndexOutOfBoundsException

        // array'deki tüm elementleri yazdırın

        System.out.println(arr2[0] + " " + arr2[1] + " " + arr2[2]);

        int[] arr3 = {2, 3, 4, 3, 6, 7, 8, 4, 9, 56, 3, 2, 34, 3, 4, 6, 2, 3};

        // arr3 ün tüm elementlerini yazdırın

        for (int i = 0; i < arr3.length; i++) {

            System.out.print(arr3[i] + " ");

        }
        System.out.println("");
        // arr3 array'ini yazdirin

        System.out.println("Tum array : " + arr3); // Tum array : [I@34c45dca   // Array'in referansını yazdırdı.

        // array non- primitive bir java objesidir, non-primitive'lerin bazıları direk olarak yazdırılabilir.
        // Ancak Array'ler direk YAZDIRILAMAZ. Eğer Array'in tamamını yazdırmak isterseniz,
        // Java'daki Arrays class'indan yardım almamız gerekir.

        System.out.println(Arrays.toString(arr3));  // [2, 3, 4, 3, 6, 7, 8, 4, 9, 56, 3, 2, 34, 3, 4, 6, 2, 3]

        // Arrays.toString(istenenArray) ==> java tüm elementleri aralarında ", " olacak şekilde köşeli parantez içinde yazdırır.

        int [] arr4 = new int[5];  // içine 5 tane int alabilen bir array oluşturur.

        // bu durumda değer atanmadığı için, Java biz değer atayıncaya kadar elementlere default değerleri tanımlar.

        System.out.println(Arrays.toString(arr4)); // [0, 0, 0, 0, 0]

        arr4[0] = 6;
        arr4[3] = 9;
        arr4[1] = 2;

        System.out.println(Arrays.toString(arr4)); // [6, 2, 0, 9, 0]

    }
}
