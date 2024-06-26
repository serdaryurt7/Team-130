package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C07_DoWhileLoop {
    public static void main(String[] args) {

        /*
            While loop'da parantez içinde kontrol edilen değişkene, biz loop'dan önce değer atıyoruz

            Eğer bu değişkene uygun olmayan değer ataması yaparsak, loop hiç çalışmaz.
            Java bu durumun önüne geçmek için, yani kontrolü kullanıcıdan değer aldıktan sonra yapabilmemiz için do while loop oluşturmuştur.

            do while loop kullanıldığında, loop body'sinin çalışmama ihtimali yoktur, loop body'si en az bir kere çalışır

         */

        // Bir ogretmenden not ortalamasi bulmak icin notlari alin
        // ögretmen islemi bitirmek için negatif bir sayı girmelidir.
        // Öğretmen negatif bir sayı girdiğinde, toplam kaç not girdiğini, not ortalamasının kaç olduğunu yazdırın.

        Scanner scanner = new Scanner(System.in);
        double not;
        double toplam = 0;
        int sayac = 0;

        /*


        while (not >= 0) {

            System.out.println("Ortalama hesaplamak icin notlari giriniz \nbitirmek icin negatif sayi giriniz");

            not = scanner.nextDouble();
            if (not >= 0) {

                sayac++;
                toplam += not;

            }

        }

        */

        do {

            System.out.println("Ortalama hesaplamak icin notlari giriniz \nbitirmek icin negatif sayi giriniz");

            not = scanner.nextDouble();
            if (not >= 0) {

                sayac++;
                toplam += not;

            }
        }
        while (not >= 0);


        System.out.println("toplam girilen not sayisi : "
                + sayac + "\ngirilen notlarin ortalamasi : " + toplam / sayac);

    }
}
