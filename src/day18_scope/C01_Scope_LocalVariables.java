package day18_scope;

public class C01_Scope_LocalVariables {
    public static void main(String[] args) {

        // Kural 1 - Bir method içerisinde oluşturulan variable'lara local variable denir
        // local variable'lar sadece oluşturuldukları method'da kullanılabilir. Diğer method'larda KULLANILAMAZ

        String str = "Java Candir";
        // System.out.println(sayi);

        int a;
        boolean bl;
        char c;

        // System.out.println(a);

        // a++;

        bl = true;
        c = 'a';

        // Kural 2 - Local variable'lar değer atanmadan oluşturulabilir AMA değer atamadan kullanılamazlar.

        for (int i = 0; i < 10; i++) {

            System.out.println(i); // 0123456789
            String s = "Java";

        }

        // System.out.println(s); //
        // System.out.println(i); //

        // Kural 3 - Her ne kadar bir method'un içinde olsa da, Loop'lar da ayrı bir local alandır.
        // Loop içerisinde oluşturulan variable'lar, Loop dışında KULLANILAMAZ
    }

    public static void method1() {

        //  System.out.println(str); //

        int sayi = 10;

    }

}
