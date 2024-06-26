package day28_passByValue;

public class C01_StaticBloks {

    C01_StaticBloks() {

        System.out.println("Constructor calisti");

    }


    public static void main(String[] args) {

        System.out.println("Main method calisti");

        C01_StaticBloks obj = new C01_StaticBloks();

    }

    static {
        // bu yapıya static blok denir. // Static bloklar herşeyden hatta main method'dan bile önce çalışır.
        // Eğer bir class için main method çalışmadan yapılması gereken ön ayarlar varsa, static blok kullanılarak yapılır.
        // bir class'da birden fazla static blok olabilir, eğer birden fazla static blok varsa, kendi içlerinde önce yukarıdaki blok çalışır


        System.out.println("Static blok calisti");

    }

    static {

        System.out.println("Ikinci static blok calisti");

    }

    public static void method1() {

        System.out.println("Method1 calisti");
    }

}
