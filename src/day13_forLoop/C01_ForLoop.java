package day13_forLoop;

public class C01_ForLoop {
    public static void main(String[] args) {


         // Başlangıç ve bitiş değerleri bilinen veya tekrar sayısı belli olan işlemleri yapmak için for loop kullanılır.

        // 10'dan başlayarak, 30'dan küçük sayıları yan yana yazdırın

        for (        int i = 10           ;          i < 30         ;             i++            ) {
                // başlangıç değeri         loop bitirme şartı           i'nin artış biçimi
            //      loop bitirme şartı true olduğu müddetçe loop çalışmaya devam eder

            System.out.print(i + " ");
        }

        System.out.println(""); // alt satıra geçmek için yazıldı

        // iki basamaklı tek sayıları yanyana yazdırın

        //

        for (int i = 11; i < 100 ; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println(""); // alt satıra geçmek için yazıldı

        // 752 ve 1326 dahil olmak üzere aralarında 19 ile bölünen sayıları yazdırın

        for (int i = 752; i <= 1326 ; i++) {
            if (i % 19 == 0){
                System.out.print(i + " ");
            }
        }

    }
}
