package day28_passByValue;

public class C04_PassByValueReturn {

    public static void main(String[] args) {

        /*
            Methodlar arası geçişte variable'ın kendisi değil değeri yollanır
            her method'un içindeki local variable o method'da geçerli olduğundan
            main method' da atama varsa, main method'daki fiyat variable'ı kalıcı değişir
            diğer method'da atama varsa o method'daki variable'ın değeri değişir

            method her çağrıldığında sanki ilk defa çalışıyor gibi sıfırdan başlar

         */

        // Verilen bir fiyat için % 10 indirimli fiyatı hesaplayıp, indirimli fiyatı döndüren bir method oluşturun.

        double fiyat = 200;

        System.out.println(fiyat); // 200

        System.out.println(yuzde10IndirimliFiyatHesapla(fiyat)); // 180

        System.out.println(fiyat); // 200

        // % 10 indirimli fiyatı kalıcı hale getirin

        fiyat = yuzde10IndirimliFiyatHesapla(fiyat);

        System.out.println(fiyat); // 180


    }

    public static double yuzde10IndirimliFiyatHesapla(double fiyat) {

        fiyat = fiyat * 90 / 100;

        return fiyat;

    }

}
