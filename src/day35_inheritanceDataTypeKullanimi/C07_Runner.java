package day35_inheritanceDataTypeKullanimi;

public class C07_Runner {

    /*
        EGER özellikler method olarak oluşturuldu ise
        objenin taşıdığı özellikleri belirlemek için
        Data Türünün yanında Constructor'da etkili olur

        Bir objenin istenen özelliği taşıyıp taşımadığını
        Data Türü belirler

        O özelliğin daha güncel değerinin olup olmadığı ise
        constructor' a bağlıdır
        Java, Objenin özelliği bulunduktan sonra
        constructor'ın olduğu class'a kadar
        daha güncel bilgi olup olmadığını kontrol eder
        ve daha güncel bilgi bulursa onu kullanır

     */

    public static void main(String[] args) {

        C06_AvciKuslar avciKus1 = new C06_AvciKuslar();

        avciKus1.omur(); // yasar ve olur H
        avciKus1.solunum(); // akciger K
        avciKus1.cogalma(); // yumurta K
        avciKus1.kanat(); // kanatlidir K
        avciKus1.hareket(); // ucarlar AVK
        avciKus1.beslenme(); // et AVK
        avciKus1.gaga(); // sivri gagalidir AVK
        avciKus1.pence(); // pencelidir AVK

        C05_Kuslar avciKus2 = new C06_AvciKuslar();

        avciKus2.omur(); // yasar ve olur H
        avciKus2.solunum(); // akciger K
        avciKus2.cogalma(); // yumurta K
        avciKus2.kanat(); // kanatlidir K
        avciKus2.hareket(); // ucarlar AVK       // güncel
        avciKus2.beslenme(); // et AVK           // güncel
        avciKus2.gaga(); // sivri gagalidir AVK  // güncel
        // avciKus2.pence(); // CTE

        C04_Hayvanlar avciKus3 = new C06_AvciKuslar();

        avciKus3.omur(); // yasar ve olur H
        avciKus3.solunum(); // akciger K
        avciKus3.cogalma(); // yumurta K
        // avciKus3.kanat(); // CTE
        avciKus3.hareket(); // ucarlar AVK
        avciKus3.beslenme(); // et AVK
        // avciKus3.gaga(); // CTE
        // avciKus2.pence(); // CTE

        C05_Kuslar kus1 = new C05_Kuslar();

        kus1.omur(); // yasar ve olur H
        kus1.solunum(); // akciger K
        kus1.cogalma(); // yumurta K
        kus1.kanat(); // kanatlidir K
        kus1.hareket(); // hareket ederler H
        kus1.beslenme(); // beslenirler H
        kus1.gaga(); // gagalari vardir K
        // kus1.pence(); // CTE

        C04_Hayvanlar kus2 = new C05_Kuslar();   // Constructor kuslar --> aşağısı önemsiz

        kus2.omur(); // yasar ve olur H
        kus2.solunum(); // akciger K
        kus2.cogalma(); // yumurta K
        // kus2.kanat(); // CTE                  // Hayvanlar class'ında kanat method'u yok bu yüzden CTE.
        kus2.hareket(); // hareket ederler H
        kus2.beslenme(); // beslenirler H
        // kus2.gaga(); // CTE                  // Hayvanlar class'ında gaga method'u yok bu yüzden CTE.
        // kus2.pence(); // CTE

        C04_Hayvanlar hayvan1 = new C04_Hayvanlar(); // Constructor Hayvanlar --> aşağısı önemsiz

        hayvan1.omur(); // yasar ve olur H
        hayvan1.solunum(); // nefes alir H
        hayvan1.cogalma(); // cogalir H
        // hayvan1.kanat(); // CTE
        hayvan1.hareket(); // hareket ederler H
        hayvan1.beslenme(); // beslenirler H
        // hayvan1.gaga(); // CTE
        // hayvan1.pence(); // CTE
    }
}
