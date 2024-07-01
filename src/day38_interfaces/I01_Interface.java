package day38_interfaces;

public interface I01_Interface {

    /*
        Interface'ler class değildir
        KURAL 1 : Interface'ler full abstraction sağlar

        KURAL 2 : bir interface içinde oluşturulan method'lar için
        public veya abstract keyword'lerini yazmak redundant'dır.(gereksiz, gereğinden fazla)
        Yani yazsak da yazmasak da bu özellikleri taşıyacağından yazmak GEREKSIZ olur

        KURAL 3 : bir interface içinde oluşturulan variable'lar için
        public, static veya final keyword'lerini yazmak redundant'tır.

     */

    public abstract void method1();
    // Modifier 'abstract' is redundant for interface methods
    // Modifier 'public' is redundant for interface members

    public void method2();

    abstract void method3();

    void method4();

    public static final int SAYI = 20;
    // Modifier 'final' is redundant for interface fields
    // Modifier 'static' is redundant for interface fields
    // Modifier 'public' is redundant for interface members

    public String STR = "Java";
    final boolean GUZEL_MI = true;
    char ILK_HARF = 'H';

}
