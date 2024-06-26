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
    public static void method4(){}
        // static olarak işaretlenen method'lar override edilemez
        // child class'da aynı signature'a sahip method oluşturabilirsiniz
        // ama bu ikisi override ilişkisi oluşturmaz, bağımsız iki method olurlar

        // parent class'da static olarak işaretlenen bir method'u

    // 1:15
}
