package day32_encapsulation;

public class C04_EncapsulationRunner {

    public static void main(String[] args) {

        // Access modifier ile bir variable'a erişim yetkimiz varsa, HEM onu yazdırabilir HEM DE değer atayabiliriz
        // ulaşamıyorsak da hiç bir işlem yapamayız

        C03_Encapsulation obj = new C03_Encapsulation();

        // obj.strPrivate = "Private";
        // System.out.println(obj.strPrivate);

        obj.strDefault = "Default";
        System.out.println(obj.strDefault);
        obj.strProtected = "protected";
        System.out.println(obj.strProtected);
        obj.strPublic = "Public";
        System.out.println(obj.strPublic);

        // PEKI okuma yani değerini görüntüleme yetkisi ile write yani değer atayabilme yetkisini ayırabilir misiniz ?

        /*
            ilgili variable'lari private yaptığımız için
            access modifier onları kullanmamıza hiçbir şekilde izin vermez

            obj.satisTutari = 20;
            System.out.println(obj.satisTutari);
            obj.toplamSatisTutari = 50;
            System.out.println(obj.toplamSatisTutari);
         */

        System.out.println(obj.getToplamSatisTutari()); // 0
        obj.setSatisTutari(50);
        obj.setSatisTutari(100);
        obj.setSatisTutari(100);

        System.out.println(obj.getToplamSatisTutari());

        // satışTutari variable'ının değerini yazdırılamaz

        // System.out.println(obj.satisTutari);

        // toplamSatisTutari variable'ına değer atanamaz

        // obj.toplamSatisTutari = 200;


    }

}
