package day26_constructor;

import javax.imageio.ImageReader;

public class C05_Car {
    String marka = "Marka belirtilmemis";
    String model = "Model belirtilmemis";
    String renk = "Renk belirtilmemis";

    int yil = 1900;
    int fiyat;

    C05_Car() {


    }

    // marka ve model parametreli bir constructor oluşturalım

    C05_Car(String mrk, String mdl) {

        marka = mrk;
        model = mdl;

    }

    // tüm variable'ların olduğu bir constructor oluşturalım

    C05_Car(String marka, String model, String renk, int yil, int fiyat) {

        /*
            Constructor içinde atama yapmanın amacı, parametre olarak gelen değeri
            class level'daki instance variable'a atamaktır.

            Eğer parametre ve instance isimleri AYNI DEĞİLSE
            renk = rnk;
            yil = yl;
            java burada class level'daki ile scope'daki variable'ları ayırabilir

            eğer parametre ismi ile instance variable ismi AYNI ISE
            marka = marka;
            model = model;
            java burada hangisinin parametreden gelen variable,
            hangisinin class level'daki variable olduğuna bakmaz çünkü java kolayı tercih eder
            scope'da variable'i bulursa class level'a bakmaz

            bu durumda javaya hangisinin class level'daki
            instance variable olduğunu BELIRTMEMIZ lazım

            Java bu ihtiyaç için bize this. keyword'ünü vermiştir

            Bir variable'in önünde this. keyword kullanılırsa
            java bu variable'ı aramaya içinde olduğu scope' dan değil
            class level'dan başlar

         */

        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yil = yil;
        this.fiyat = fiyat;

    }


    @Override
    public String toString() {
        return "C05_Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }
}
