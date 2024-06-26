package day25_constructors;

public class C06_ArabaRunner {

    public static void main(String[] args) {

        C02_Araba araba;

        // Constructor kullanılmadığından obje oluşturulacağı söylenmiş ama obje oluşturulup ilk değer ataması YAPILMAMIŞTIR

        // System.out.println(araba.fiyat);
        // java: variable araba might not have been initialized

        // araba.motor();
        // java: variable araba might not have been initialized

        C02_Araba araba1 = new C02_Araba();

        // Eğer constructor body'sinde bir atama yoksa veya default constructor kullanılmışsa
        // oluşturulan obje oluşturulan class'da ilk atanmış olan değerlere sahip olur.

        System.out.println(araba1); // Class'da toString() varsa özellikleri yazdırır

        // 2000 model, yesil, fiyati 3000 olan bir opel corsa olusturun
        // once bir obje olusturup, sonra istenen degerlerin atamasını yapabiliriz

        C02_Araba araba2 = new C02_Araba();

        araba2.marka = "Opel";
        araba2.model = "Corsa";
        araba2.yil = 2000;
        araba2.renk = "Yesil";
        araba2.fiyat = 3000;

        System.out.println(araba2);


    }

}
