package day28_passByValue;

public class C02_StaticOlmayanBloklar {

    C02_StaticOlmayanBloklar() {

        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("Main method calisti");
        C02_StaticOlmayanBloklar obj1 = new C02_StaticOlmayanBloklar();
        C02_StaticOlmayanBloklar obj2 = new C02_StaticOlmayanBloklar();

    }

    {

        // static olmayan bloklar, obje oluşturulacağı zaman, constructor'dan hemen önce çalışır.

        // bir obje çalıştırılmadan önce yapılması gereken ön ayarlar varsa kullanılır.

        System.out.println("Statik olmayan blok calisti");

    }


}
