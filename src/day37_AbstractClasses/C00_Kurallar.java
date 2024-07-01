package day37_AbstractClasses;

public class C00_Kurallar {

    /*
        KURAL 1 :
        Bir abstract class'i parent edinen
        abstract olmayan(concrete) bir child class
        parent class'da abstract olarak oluşturulan
        tüm method'ları kendisine IMPLEMENT etmek ZORUNDADIR

        parent class'daki concrete method'lar için
        böyle bir mecburiyet YOKTUR

        KURAL 2 :
        Bir abstract class abstract ve/veya concrete method'lar barındırabilir
        Bir concrete class ise abstract method BARINDIRAMAZ

        KURAL 3 :
        Bir abstract class'i parent edinen ABSTRACT bir class,
        kendisi de abstract olduğundan parent class'daki abstract method'lari
        implement etmek ZORUNDA DEĞİLDİR

        Abstract parent - abstract child arasındaki ilişki
        concrete parent - child ilişkisi gibidir
        child class isterse override eder, isterse parent class'dan kullanır

        KURAL 4 :
        Abstract bir silsileden sonra gelen, ilk CONCRETE Class
        Parent Abstract class'lardaki concrete'leştirilmemiş olan
        tüm abstract method'ları implement etmek zorundadır

        KURAL 5 :
        Abstract class'lar class oldukları için, constructor'a sahiptirler
        AMMA abstract class'lardan obje oluşturulamaz

        Çünkü abstract class'dan obje oluşturursanız
        o class'daki method'ları çalıştırabilmelisiniz
        ama abstract method'lar body'si olmadığından çalışamaz


     */

}
