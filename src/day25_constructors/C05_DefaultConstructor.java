package day25_constructors;

public class C05_DefaultConstructor {

    public static void main(String[] args) {

            /*
        Java bir class oluşturulduğunda, OOP kullanılarak bu class'dan obje
        oluşturulabilmesi için class'a default bir contructor koyar

        DEFAULT constructor GORUNMEZ ve body'sinde kod yoktur.


     */

        C02_Araba araba = new C02_Araba();

        // araba objesinin özelliklerini yazdırın

        // System.out.println(araba); // day25_constructors.C02_Araba@568db2f2

        System.out.println("Marka : " + araba.marka +
                ", model " + araba.model +
                ", renk " + araba.renk +
                ", yil " + araba.yil +
                ", fiyat " + araba.fiyat);

        // Marka : Marka belirtilmemis, model Model belirtilmemis, renk Renk belirtilmemis, yil 1900, fiyat 0

        araba.marka = "BMW";
        araba.model = "5.20";
        araba.renk = "Kirmizi";
        araba.yil = 2010;
        araba.fiyat = 15000;

        // araba objesinin özelliklerini yazdırın

        System.out.println("Marka : " + araba.marka +
                ", model " + araba.model +
                ", renk " + araba.renk +
                ", yil " + araba.yil +
                ", fiyat " + araba.fiyat);

        // Marka : BMW, model 5.20, renk Kirmizi, yil 2010, fiyat 15000

        System.out.println(araba);

    }
}
