package day_36_overriding;

public class C05_Child extends C04_Parent {

    public void method1(int sayi) {
        // child class'da parent class'dan bir method'u
        // override etmek istersek
        // signature'ı parent class'daki method ile aynı olan
        // bir method oluşturmalıyız
        // eğer signature farklı olursa,
        // method isminin aynı olması yeterli değildir
    }

    public void method2() {
    }

    @Override
    public void method3() {

        // overrinding method oluşturmak için
        // @Override notasyonu kullanmak zorunlu değildir
        // ama override method'u intelliJ'den oluşturursak
        // intelliJ otomatik olarak notasyonu koyar.

        // @Override notasyonu parent class'daki
        // overridden method'u takip eder
        // silinir veya signature'ı değiştirilirse, CTE verir

        // Notasyon kullanılmayan methodlarda, parent class'daki method kontrol edilmez
        // silinmesi veya değiştirilmesi durumunda overriding özelliği biter ama kod çalışmaya devam eder
    }

    public static void method4() {
        // static olarak işaretlenen method'lar override edilemez
        // child class'da aynı signature'a sahip method oluşturabilirsiniz
        // ama bu ikisi override ilişkisi oluşturmaz, bağımsız iki method olurlar

        // parent class'da static olarak işaretlenen bir method'u
        // child class'da aynı signature ile static keyword kullanmadan OLUŞTURAMAZSINIZ,
        // static yapmadan oluşturmak isterseniz CTE verir
    }

    /* public final String method5() {
            // bir method'un final olarak işaretlerseniz
            // o method override EDILEMEZ
        return null;
    } */
    private void method6() {
        // private bir method'u override edemezsiniz
        // aynı signature'a sahip method oluştursanız da
        // bu overriding method olmaz
    }

    protected void method7() {
        // HER NE KADAR signature'a dahil olmasa da overriding' de access modifier da önemlidir
        // parent class'daki method7'nin access modifier'ı default olduğundan
        // child class'daki method7 default, protected veya public olabilir fakat private olamaz.


    }

    protected void method8() {
        // parent class'daki method8' in access modifier'ı protected olduğundan
        // child class'daki method 8 protected veya public olabilir
        // AMMA default access modifier veya private olamaz

    }

    public void method9() {
        // Overriden method'un return type'ı void veya primitive ise,
        // Overriding method'un return type'ı da aynı olmalıdır.

    }

    public String method10() {
        // eğer overriden method'un return type'ı non-primitive ise
        // overriding method'un return type'ı YA aynısı olacak
        // YADA parent class'ın return type'ı ile IS-A relationship olan bir data türü olacak
        return null;
    }
    @Override
    public void method11() {
        super.method11();
        // overriding yapıldığında
        // overriden method veya overriding method'dan SADECE biri çalışır

        // EGER ikisinin de çalışmasını isterseniz, super.methodIsmi yazarak
        // parent'daki methodun da çalışmasını SAGLAYABILIRIZ
    }
}
