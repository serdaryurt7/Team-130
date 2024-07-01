package day37_AbstractClasses;

public abstract class C03_KuralciParent {

    public abstract void method1();
    // Abstract class cannot have a body
    // bunlara bir method olarak değil, resmi gazetede yazan bir standart olarak düşünün

    public abstract String method2();

    public void method3() {

    }

    public int method4() {
        return 0;
    }


    /*
        Eğer bir class'in child class'lar üzerinde
        kural koyucu olmasını istiyorsanız Java iki alternatif sunar
        1- abstract classes
        2- interfaces

        Bir class'ı abstract class yapmak için
        class deklarasyonuna abstract yazmanız yeterlidir

        Abstract class kısmi abstraction sağlar
        YANII içinde child class'ların
        - MUTLAKA OVERRIDE etmesi gereken method'lar olacağı gibi
          (abstract method olarak oluşturmalıyız)

        - override etmenin mecbur olmadığı
          child class'ın insiyatifine bırakıldığı methodlar' da olabilir
          (şimdiye kadar oluşturduğumuz method'lar gibi oluşturmalıyız)

     */

}
