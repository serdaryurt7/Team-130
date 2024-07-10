package day45_Maps_THE_END;

import java.util.HashMap;
import java.util.Map;

public class C01_NestedMaps {

    public static void main(String[] args) {

        /*
            {
                "firstname" : "Ahmet",
                "lastname" : "Bulut",
                "totalprice" : 500,
                "depositpaid" : false,
                "bookingdates" : {
                        "checkin" : "2024-07-21",
                        "checkout" : "2024-08-10"
                            }
                "additionalneeds" : "wi-fi"
                }
         */

        // yukarıdaki bilgileri bir map olarak oluşturun

        Map<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("firstname", "Ahmet");
        bodyMap.put("lastname", "Bulut");
        bodyMap.put("totalprice", 500);
        bodyMap.put("depositpaid", false);

        Map<String, String> bookingdatesValueMap = new HashMap<>();
        bookingdatesValueMap.put("checkin", "2024-07-21");
        bookingdatesValueMap.put("checkout", "2024-08-10");

        bodyMap.put("bookingdates", bookingdatesValueMap);
        bodyMap.put("additionalneeds", "wi-fi");

        System.out.println(bodyMap);

        // {firstname=Ahmet,
        // additionalneeds=wi-fi,
        // bookingdates={checkin=2024-07-21, checkout=2024-08-10},
        // totalprice=500,
        // depositpaid=false,
        // lastname=Bulut}

        // oluşturulan map'deki ismi yazdirin

        System.out.println(bodyMap.get("firstname")); // Ahmet

        // totalprice'ı yazdırın

        System.out.println(bodyMap.get("totalprice")); // 500

        //checkin tarihini yazdırın

        System.out.println(((Map<String, String>) bodyMap.get("bookingdates")).get("checkin")); // 2024-07-21

        // firstname key'ine ait value'yu Kaan yapın

        bodyMap.put("firstname", "Kaan");

        // depositpaid key'ine ait value'yu true yapın

        bodyMap.put("depositpaid", true);

        // checkout tarihini 2024-08-21 yapin

        ((Map<String, String>) bodyMap.get("bookingdates")).put("checkout", "2024-08-21");

        System.out.println(bodyMap);

        // value'lar arasında Ahmet diye bir value var mi ?

        System.out.println(bodyMap.containsValue("Kaan")); // true

        // value'lar arasında "2024-08-21" var mi ?

        System.out.println(bodyMap.containsValue("2024-08-21")); // false
        System.out.println(((Map<?, ?>) bodyMap.get("bookingdates")).containsValue("2024-08-21")); // true

        // key'lerde name var mi ?

        System.out.println(bodyMap.containsKey("name"));// false

        // key'lerde additionalneeds var mı ?

        System.out.println(bodyMap.containsKey("additionalneeds")); // true

    }

}
