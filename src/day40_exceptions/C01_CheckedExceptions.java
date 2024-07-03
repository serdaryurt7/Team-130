package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        String dosyaYolu = "src/day40_exceptions/yazim.txt";

        // Java'da bilgisayarımızda varolan bir dosyaya ulaşmak için FileInputStream class'i kullanılır

        // String str = "" + 10;  ====Stringleştirme====

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            System.out.println("Yazdiginiz dosya yolu yanlis");
        }

        /*
            Ya evde yoksa ?
            Unhandled exception: java.io.FileNotFoundException
            Java bir dosyaya ulaşmasını istediğimizde, o dosyaya ulaşabileceğinden emin olmak ister
            ve bizi bu konuda bir eylem yapmaya zorlamak için kodun altını kırmızı çizer

            kodun altını kırmızı çizmesini, bugüne kadar hep kodda hata var düzeltmemiz lazım diye yorumlamıştık
            Ancak checked exception'larda, java riski görür ve önlem almamız için altını kırmızı çizer

            Java'da dosyadan bilgi alma veya dosyaya bilgi yazdırma (Input / Output IO)
            ile ilgili exception'lar checked exception'lardır
            yani daha compile anında Java bu riskleri farkeder ve bizden çözüm ister

        */


        /*
            Checked Exception'lar için, Java bize 2 alternatif sunar
            1- Şu ana kadar yaptığımız gibi try-catch ile sarmalayıp,
            sorun oluşsa bile çalışmaya devam etmesini sağlayabiliriz

            2- EGER exception'ı kontrol altına alıp, çalışmaya devam etmesini istemiyorsanız
            SADECE kırmızı çizgiyi yok etmek, kodlarımızı çalışır hale getirmek ve exception oluşursa,
            kodlarımızın çalışmayı durdurmasını istersek,
            method deklerasyonuna riskin farkında oluğumuzu beyan eden, throws keyword yazmamız yeterlidir

            throws FileNotFoundException :
            method deklarasyonuna eklediğimiz bu bölüm, riskin farkında olduğumuzu söyler
            AMMA exception'ı kontrol altına almaz

         */


        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);


    }

}
