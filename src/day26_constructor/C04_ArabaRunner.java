package day26_constructor;

public class C04_ArabaRunner {

    public static void main(String[] args) {

        /*
            Kod okuma sorularında OLMASI GEREKEN veya KODUN DOGRUSU BOYLE OLMALI diye düşünemeyiz
            Yapmamız gereken, Javanın yapacağı kod takibini yapıp kod ne işlem yapıyorsa onları anlamaktır.

         */

        C03_Araba araba1 = new C03_Araba();

        System.out.println(araba1);
        // C03_Araba{marka='Toyota',
        // model='Model belirtilmemis',
        // renk='Renk belirtilmemis',
        // yil=2010, fiyat=0}

        // verilen C03_Araba class'i ile aşağıdaki araba2 objesi oluşturulursa araba2'nin modeli ne olur?

        C03_Araba araba2 = new C03_Araba("Toyota", "Corolla");

        System.out.println(araba2);
        // C03_Araba{marka='Toyota',
        // model='A180',
        // renk='Renk belirtilmemis',
        // yil=2019, fiyat=0}

        // Verilen C03_Araba class'i ile aşağıdaki araba3 nesnesi oluşturulursa
        // araba3'ün marka, model ve fiyatı ne olur ?

        C03_Araba araba3 = new C03_Araba("Nissan", "Micra", 5000);

        System.out.println(araba3); // Mercedes, Micra, 20000, Yesil
        // C03_Araba{marka='Mercedes',
        // model='Micra',
        // renk='Yesil',
        // yil=1900, fiyat=20000}


    }
}
