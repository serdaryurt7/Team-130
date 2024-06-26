package day34_inheritanceConstructorCall;

public class C05_Child extends C04_Parent {

    String str = "Java daha guzeldir";
    String t = "Java java java";
    int sayi = 15;
    int b = 25;

    public static void main(String[] args) {

        C05_Child obj = new C05_Child();
        obj.method1();

    }

    public void method1() {

        /*
            Herhangi bir scope'da bir variable kullanmak istediğimizde o variable'ın
            değerini bulmak için "java"
            - önce içinde bulunduğu scope'a
            - scope'da bulamazsa class level'a
            - class'da bulamazsa parent'a
            - parent'da bulamazsa grand parent'lara bakar
            ve ilk bulduğu değeri kullanır.

            EGER this.variable dersek
            bu durumda arama işlemini yaparken, içinde bulunduğumuz scope'u atlayıp
            aramaya class level'dan başlar

            EGER super.variable dersek
            scope ve class level'ı atlayıp, aramaya parent class'dan başlar

            ONEMLI NOT: aramaya başlayacağı yeri java'ya söyleyince
            JAVA söylediğimiz yerden başlar ve yukarıda yazılan sıralama ile
            aramaya devam eder.
            -Eğer aradığı variable'ı aradığı basamaklarda
            bulamazsa CTE verir.
         */

        String t = "Hava cok guzel";
        int a = 27;
        int b = 37;
        String str = "Her sey guzel olacak";

        System.out.println(s); // Java candir
        System.out.println(this.s); // Java candir
        System.out.println(super.s); // Java candir

        System.out.println(sayi); // 15
        System.out.println(this.sayi); // 15
        System.out.println(super.sayi); // 20

        System.out.println(t); // Hava cok guzel
        System.out.println(this.t); // Java java java
        // System.out.println(super.t); // CTE

        System.out.println(b); // 37
        System.out.println(this.b); // 25
        // System.out.println(super.b); // C04_Parent class'ında b yok. CTE

        System.out.println(str); // Her sey guzel olacak
        System.out.println(this.str); // Java daha guzeldir // this class level' a bakar
        System.out.println(super.str); // Java guzeldir

        System.out.println(a); // 27
        System.out.println(this.a); // 30
        System.out.println(super.a); // 30

    }

}
