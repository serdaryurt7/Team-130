package day31_stringBuilder_accessModifier;

public class C04_AccessModifier {

    private String strPrivate;
    int sayiDefault; // eğer görünür bir access modifier yoksa default access modifier geçerlidir
    protected boolean blProtected;

    public void methodPublic() {

    }

    /*
        Nasil ki class level'da oluşturulan ama değer atanmayan variable'lara Java default değer tanımlıyorsa

        method'lar veya class level'da oluşturulan variable'lar için access modifier yazılmazsa
        java access modifier olarak "DEFAULT ACCESS MODIFIER" tanımlar

        1 - En geniş access modifier public ==> herkes erişebilir
        2 - protected ==> içinde bulunduğumuz class, package ve başka package'daki child class'lar
        3 - default access modifier ==> içinde bulunduğu class ve içinde bulunduğu package'daki diğer class'lar  (PACKAGE PRIVATE)
        4 - En dar access modifier private ==> sadece içinde bulunduğu class'dan kullanılabilir

     */

    public static void main(String[] args) {

        /*
            Bir obje oluşturursak içinde bulunduğumuz class'daki tüm access modifier'lara ulaşabiliriz

         */

        C04_AccessModifier obj = new C04_AccessModifier();
        System.out.println(obj.strPrivate);
        System.out.println(obj.sayiDefault);
        System.out.println(obj.blProtected);
        obj.methodPublic();

    }
}
