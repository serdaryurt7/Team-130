package day38_interfaces;

public interface I02_ParentInterface {

    void method1();

    void method2();

    public abstract String method3();

    public default void method20() {
    }

    public static void method21() {
    }

    /*
        Java 8 ile birlikte, developer'lardan gelen talepler doğrultusunda
        Java Interface'ler için bir istisna oluşturmuş

        Talep : Interface' e sonradan bir method eklememiz gerekirse
                önceden bu interface'i inherit eden tüm class'lar kızarıyor
                sonradan eklediğimiz bu method'u MECBURI OLMAKTAN kurtar

        Interface'lere sonradan eklenen method'ları IMPLEMENT etmenin mecbur olmaması için
        bu method'ların body'si OLMALIDIR.
        Interface'de body'si olan method oluşturabilmemiz için
        Java bildiğimiz 2 keyword'ü özel kullanım için yetkilendirmiş
        bu iki kelime  :
                    - default
                    - static
        iki keyword'un kullanımdaki farkı bu method'lara erişim yöntemi ile ilgilidir

      - static keyword ile oluşturulan method'a static yöntemle
        yani interfaceIsmi.staticMethodismi() ile ulaşabiliriz

      - default keyword ile oluşturulan method'a ise
        obje oluşturup, obje üzerinden ulaşabiliriz

     */

}
