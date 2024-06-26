package day32_encapsulation;

public class C06_Runner {
    public static void main(String[] args) {

        /*
            Bir variable'ı private yapıp, hem getter hem setter method'u oluşturursak
            public gibi olur

            Bu yöntem bazı developer'lar tarafından, yapılan işleme vurgu yapmak amacıyla kullanılır
         */

        /*
            Bir class'daki tüm variable'lar private yapılıp
            sadece getter methodları oluşturulursa
            bu class read only (immutable) olur

         */

        // getter ve setter da method void ise setter -> return ediyor ise getter

        C05_Encapsulation obj = new C05_Encapsulation();

        // isme değer atayalım
        obj.setIsim("Ali");
        // isim variable'ının değerini yazdıralım

        System.out.println(obj.getIsim()); // Ali

        // soyisim' e değer atayalım

        obj.soyisim = "Celik";

        // soyisim variable'ının değerini yazdıralım

        System.out.println(obj.soyisim); // Celik


    }
}
