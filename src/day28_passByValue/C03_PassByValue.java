package day28_passByValue;

public class C03_PassByValue {

    public static void main(String[] args) {

        // Verilen fiyat üzerinden %10 indirimli fiyat hesaplayıp, indirimli fiyatı yazdıran bir method oluşturun

        /*
            Farklı scope'ların içinde aynı isimde variable'lar olabilir,
            bu variable'lardaki yapılan değişiklikler, sadece içinde oldukları scope' da geçerlidir

         */

        double fiyat = 200;

        yuzde10IndirimliFiyatYazdir(fiyat);

        System.out.println(fiyat); // 200

    }

    public static void yuzde10IndirimliFiyatYazdir(double fiyat) {

        fiyat = fiyat * 90 / 100;

        System.out.println("Indirimli fiyat : " + fiyat); // 180

    }

}
