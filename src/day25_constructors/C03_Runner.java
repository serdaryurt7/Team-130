package day25_constructors;

public class C03_Runner {

    public static void main(String[] args) {

        /*

       Java' da herhangi bir class'dan obje oluşturduğunuzda
       Java ilk olarak o objeyi oluşturur
       oluşturulduğu class'daki tüm instance variable'ların birer kopyasını
       oluşturup objeye yapıştırır

         */


        // Java' da bir obje oluşturmak istediğimizde

        C02_Araba araba1 = new C02_Araba();

        araba1.marka = "Tofas";

        C02_Araba araba2 = new C02_Araba();

        System.out.println(araba2.marka);

        araba2.marka = "Mercedes";

        C02_Araba araba3 = new C02_Araba();

        System.out.println(araba3.marka);

    }
}
