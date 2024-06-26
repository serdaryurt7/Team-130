package day16_methodOlusturma_methodOverloading;

public class C07_WhileLoop {
    public static void main(String[] args) {

        // 1 den 20 ye kadar (sınırlar dahil) olan tamsayıları toplayın

        int toplam = 0;

        for (int i = 1; i <= 20; i++) {
            toplam += i;
        }
        System.out.println(toplam); // 210

        // -------------------------------------------------------------------------------------------------------------------------
        // While loop oluşturulurken başlangıç değeri, bitiş şartı ve artış şeklini otomatik oluşturmaz.
        // bunları bizim manual olarak yapmamız lazım.
        // Eğer for loop ile yapılabilen bir soru varsa, for loop tercih edilir.

        toplam = 0;
        int baslangic = 1;

        while (baslangic <= 20) {
            toplam += baslangic;
            baslangic++;
        }
        System.out.println(toplam);

        // Eğer tekrar sayısı belli değilse for loop yerine while loop kullanmayı tercih ederiz.

    }
}
