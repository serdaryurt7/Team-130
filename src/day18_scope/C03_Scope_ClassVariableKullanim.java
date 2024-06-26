package day18_scope;

public class C03_Scope_ClassVariableKullanim {

    /*
        Kural 4 - static variable'lar her yere gidebilirler, static olmayan variable (instance variable)'lar ise static alanlara girmezler

        Kural 5 - Class level variable'lar değer atanmadan oluşturulabildiği gibi, değer atanmadan kullanılabilirler.
                  Biz değer atamazsak, Java default değer olarak:
                  - non-primitive'lere ==> null
                  - sayisal primitive'lere ==> 0
                  - boolean variable'lara ==> false
                  - char variable'lara ==> hiçlik değeri atar.

     */

    static String s;
    static int a;
    boolean bl;
    char chr;

    public static void main(String[] args) {

        System.out.println(s); // null
        System.out.println(a); // 0

        // Eğer static olmayan class üyelerine static alandan ulaşmak istersek, önce class'dan bir obje oluşturulmalı,
        // sonra o obje üzerinden static olmayan üyeler kullanılmalıdır.

        C03_Scope_ClassVariableKullanim obj = new C03_Scope_ClassVariableKullanim();
        System.out.println(obj.bl); // false
        System.out.println(obj.chr); // hiçlik ( )

    }

    public static void method1() {

        System.out.println("static method calisti");

    }

    public void method2() {

        System.out.println("static olmayan method calisti");

    }
}
