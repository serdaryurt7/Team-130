package day30_timeDate_varargs;

public class C03_Varargs {

    public static void main(String[] args) {

        /*
            Vararg : variety of arguments demektir
            varargs değişken sayıda argument kullanmamıza imkan tanıyan
            array alt yapısını kullanan bir java objesidir

            siz argument olarak (4, 5) yollarsanız sayi [] = {4,5} olur
                                (4, 2, 7)          sayi [] = {4, 2, 7}
                          (4, 5, 6, 7, 8, 9)       sayi [] = {4, 5, 6, 7, 8, 9}
         */

        // Verilen 2 sayinin toplamını yazdıran bir method oluşturun

        topla(4, 5); // 9
        topla(4, 2, 7); // 13
        topla(1, 2, 3, 4);
        topla(1, 2, 3, 4, 5, 6, 7);
        topla(4, 5, 6, 7, 8, 9);

    }

    public static void topla(int... sayi) {

        // burada sayi bir tek sayı değil,
        // kaç tane argument yollarsak hepsini alabilecek bir array'dir

        int toplam = 0;

        for (int each : sayi
        ) {

            toplam += each;
        }

        System.out.println(toplam);

    }


}
