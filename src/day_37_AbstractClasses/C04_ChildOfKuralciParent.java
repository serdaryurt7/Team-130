package day_37_AbstractClasses;

public class C04_ChildOfKuralciParent extends C03_KuralciParent {

    // Class 'C04_ChildOfKuralciParent' must either be declared abstract or implement abstract method 'method2()' in 'C03_KuralciParent'

    /*
        Bir abstract class'i parent edinen
        abstract olmayan(concrete) bir child class
        parent class'da abstract olarak oluşturulan
        tüm method'ları kendisine IMPLEMENT etmek ZORUNDADIR

        parent class'daki concrete method'lar için
        böyle bir mecburiyet YOKTUR

     */

    @Override
    public void method1() {

    }

    @Override
    public String method2() {
        return null;
    }
}
