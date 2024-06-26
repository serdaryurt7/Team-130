package day29_immutableClasses;

public class C04_Immutable_AtamaIslemi {

    public static void main(String[] args) {

        String isim = "Sedat";

        isim = isim.concat(" Yaman");

        System.out.println(isim); // Sedat Yaman

        isim = isim.toUpperCase(); // SEDAT YAMAN


        // 18. satirdan itibaren, 26.satıra kadar Java kaç tane obje oluşturur

        String str = "a";

        for (int i = 1; i <= 100; i++) {

            str += "a";

        }

        System.out.println(str); // Cevap 101 "a", "aa", "aaa", "aaaa" .....

    }

}
