package day43_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class C01_MapOlusturmaElementEkleme {

    public static void main(String[] args) {

        /*
            Bir ogrenciyi map'e eklemek için put(key,value) kullanırız

            bir öğrencinin value'suna ulaşmak isterseniz

            - ogrenciMap.get(ogrenciNo) ile String olarak tum value'yu alip kaydederiz
            - value, pek çok bilgi barındırdığından, her bir bilgiye ulaşmak için
              value.split("-") ile value'yu array'e çeviririz
            - array'deki tüm bilgilerin index'lerine sahip olduğumuzdan
              istenen bilgileri array'den alıp yazdırabilir veya kullanabiliriz

         */

        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101, "Ali-Can-10-K-MF");
        // bu ogrenci için key : 101
        //               value : "Ali-Can-10-K-MF"
        // value String olmak zorunda değil list, array, Integer, Map, Queue

        String value101 = ogrenciMap.get(101);

        System.out.println("101'in tum bilgisi : " + value101);

        // 101 numaralı öğrencinin soyismini yazdırın // Ali-Can-10-K-MF

        String[] ogrenci101BilgilerArr = value101.split("-");

        System.out.println(Arrays.toString(ogrenci101BilgilerArr));
        // [Ali, Can, 10, K, MF]

        System.out.println("101 numarali ogrenci soyismi : " + ogrenci101BilgilerArr[1]); // Can

        // 101 numarali ogrencinin bölümünü yazdırın

        System.out.println("101 numarali ogrenci bolumu : " + ogrenci101BilgilerArr[4]); // MF

        // 101 numarali ogrencinin isim ve soyismini yazdırın

        System.out.println("101 numarali ogrencinin ismi ve soyismi : " + ogrenci101BilgilerArr[0] + " " + ogrenci101BilgilerArr[1]); // Ali Can

        // 101 numarali ogrencinin isim ve soyismini yazdırın, soyisim buyuk harf olarak yazdırılsın

        System.out.println("101 numarali ogrencinin ismi ve soyismi : " + ogrenci101BilgilerArr[0] + " " + ogrenci101BilgilerArr[1].toUpperCase()); // Ali CAN

        // 1:13

    }
}
