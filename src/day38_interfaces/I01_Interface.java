package day38_interfaces;

public interface I01_Interface {

    /*
        Interface'ler class değildir

        KURAL 1 :    Interface'ler full abstraction sağlar

        KURAL 2 :    bir interface içinde oluşturulan method'lar için
                     public veya abstract keyword'lerini yazmak redundant'dır.(gereksiz, gereğinden fazla)
                     Yani yazsak da yazmasak da bu özellikleri taşıyacağından yazmak GEREKSIZ olur

        KURAL 3 :   bir interface içinde oluşturulan variable'lar için
                    public, static veya final keyword'lerini yazmak redundant'tır.

        KURAL 4 :   bir class, birdan fazla class'i inherit  EDEMEZ
                    ama birden fazla Interface'i IMPLEMENT edebilir
                    Hatta bir class bir class'a extends edip, bunun yanında
                    birdan fazla interface'e de implement edebilir


        KURAL 5 :   class ==> class inherit için extends
                    class ==> interface inherit için implements
                    interface ==> interface inherit için extends
                    interface ==> class'a inherit OLMAZ

        KURAL 5 :   Bir class birden fazla interface'i inherit ettiğinde
                    parent interface'lerde aynı isimde variable varsa
                    seçim yapmamızı ister, interfaceIsmi.VariableIsmi şeklinde kullandırır

                  - parent interface'lerde aynı isimde METHOD varsa
                  * eğer return type'ları aynı ise, hangisinden aldığı önemli olmaz, o method'u override ederiz
                  * eğer return type'lari FARKLI ise, overriding method hangi return type'i seçse diğer interface itiraz eder,
                    bu durumda 2 interface'den birine implement edebilir, öteki interface'i bırakırız


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
