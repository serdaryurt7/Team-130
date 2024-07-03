package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_CokluCheckedException {

    public static void main(String[] args) {

        /*
            kodumuzda birden fazla exception oluşma ihtimali varsa, tek try, birden fazla catch bloğu kullanabiliriz
            catch blokları sıralanırken, exception türleri dikkate alınmalıdır

            - EGER oluşabilecek exception'lar arasında
            parent child ilişkisi yoksa, ,istediğimiz sıralamada yazabiliriz

            - EGER oluşabilecek exception'lar parent-child ilişkisine sahip iseler
            bu durumda child olanı üste, parent olanı alta yazmalıyız
            aksi takdirde parent üstte olunca tüm exceptionları yakalar
             ve child exception'ı yazmak anlamsız olur
         */


        String dosyaYolu = "src/day40_exceptions/yazi.txt";

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu); // dosyaya ulaşma

            int k = 0;
            while ((k = fis.read()) != (-1)) { // dosyayı okuyup, bize getirme
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Yazilan dosya yolunda sorun var");
        } catch (IOException e) {
            System.out.println("Dosya okunurken hata olustu");
        } catch (Exception e) {
            System.out.println("Ongorulemeyen bir exception olustu");
        }
    }

}
