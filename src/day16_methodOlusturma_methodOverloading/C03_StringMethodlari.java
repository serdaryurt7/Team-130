package day16_methodOlusturma_methodOverloading;

public class C03_StringMethodlari {
    public static void main(String[] args) {

        String str = "Java cok kolay, yeter ki anlayalim";

        str.toLowerCase(); // metni küçük harfe çevirir ama yazdırmadığımız veya atama yapmadığımız için boşa çalışmış olur

        C02_returnTypeileMethodOlusturma.ismiIstenenFormataCevir("Asli","Nehaber");

        // bize bir şey döndüren methodları, ya uygun bir variable'a atamalıyız
        // veya direk olarak yazdırmalıyız. Aksi takdirde method çalışır bize sonucu döndürür(getirir)
        // ama kullanmadığımız için havaya uçar


        // bu method void olduğundan sadece çağırabilirim
        C01_voidMethodOlusturma.kisiBilgileriYazdir("Ayse","Hanci","1234567890123456");
        // isim : Ays* Han*
        // kart no : **** **** **** 3456

        C02_returnTypeileMethodOlusturma.ismiIstenenFormataCevir("Kemal","Yanci");
        // bu method bana method'da dönüştürülen halini getirir
        // K**** Y****
        // ama yazdırmazsak konsolda bir şey görmeyiz

        String donusmusIsim = C02_returnTypeileMethodOlusturma.ismiIstenenFormataCevir("Kemal","Yanci");

        System.out.println(donusmusIsim); // K**** Y****


    }
}
