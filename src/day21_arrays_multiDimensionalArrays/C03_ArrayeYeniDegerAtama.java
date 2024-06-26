package day21_arrays_multiDimensionalArrays;

import day20_arrays.C04_ArrayeElementEkleme;

import java.util.Arrays;

public class C03_ArrayeYeniDegerAtama {

    public static void main(String[] args) {

        // Var olan bir Array'e yeni değer atanabilir mi ?

        int[] arr1 = {3, 5, 6};

        // arr1 = {4, 2, 6};

        // önce istediğimiz array'i ayrı bir array olarak oluşturur, sonra da bizim array'imize atama yaparız

        int[] geciciArr = {4, 2, 6};

        arr1 = geciciArr;
        System.out.println(Arrays.toString(arr1)); // [4, 2, 6]

        // eğer yeni atadığımız array default değerlerden oluşan bir array olacaksa new keyword kullanarak direk atama yapabiliriz

        arr1 = new int[5];

        System.out.println(Arrays.toString(arr1)); // [0, 0, 0, 0, 0]

        // // Oluşturulmuş bir array'e uzunluğu değitirecek şekilde bir element eklemek veya element silmek mümkün müdür ?

        int[] sayilar = {4, 2, 1,};

        // 4. element olarak 3 ekleyin

        // sayilar[3] = 3; // ArrayIndexOutOfBoundsException

        sayilar = C04_ArrayeElementEkleme.arrayElementEkle(sayilar, 3);

        System.out.println(Arrays.toString(sayilar)); // [4, 2, 1, 3]

        // sayilar array'ine 5.element olarak 9 ekleyin

        sayilar = C04_ArrayeElementEkleme.arrayElementEkle(sayilar, 9);

        System.out.println(Arrays.toString(sayilar)); // [4, 2, 1, 3, 9]

        // array'in ilk elementi olan 4'ü array'den silin, array'i 4 elementli hale getirin

        // var olan bir Array'e uzunluğu değiştirecek şekilde yeni element ekleyemeyiz veya element silemeyiz
        // bunun yerine istenen elementlere sahip yeni bir array oluşturup, yeni array'i eski array'e değer olarak atayabiliriz

        //önce uzunluğu eski array'den 1 eksik olan yeni bir array oluşturalım
        int[] yeniSayilar = new int[sayilar.length - 1];

        // eski array'deki silinecek element dışındaki elementleri yeni array'e kopyalayalım

        for (int i = 0; i < yeniSayilar.length; i++) {

            yeniSayilar[i] = sayilar[i + 1];

        }

        sayilar = yeniSayilar;

        System.out.println(Arrays.toString(sayilar)); // [2, 1, 3, 9]


    }
}
