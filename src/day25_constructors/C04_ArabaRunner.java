package day25_constructors;

public class C04_ArabaRunner {

    public static void main(String[] args) {

        /*
            Java'da her obje oluşturduğumuzda
            java objeyi oluşturur ve instance variable'ların birer kopyasını
            bu objeye yapıştırır.

            Bu işlemi java'da yapan yapı
            Constructor'dır.

            bir constructor çalışmadan oluşturulan objeye
            ilk değer ataması (initialization) yapılması mümkün değildir.

            bir constructor oluşturmak için, syntax ClassAdi(){} şeklindedir.

            C02_Araba() yazımı method'a benzer ama method değil constructor'dır.

            Bir yapının method mu constructor mı olduğunu anlamak için 2 şeye bakılır

            1- constructor'ın ismi class ile aynı olmalıdır. (Yani büyük harfle başlar)

            2- constructor'ların return type'ı olmaz

         */


        C02_Araba araba = new C02_Araba();
// objenin oluşturulduğu class| objenin adı |   assignment | keyword  |  Constructor
// objenin data türü

    }

}
