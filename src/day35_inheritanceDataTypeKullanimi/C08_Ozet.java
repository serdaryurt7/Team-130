package day35_inheritanceDataTypeKullanimi;

public class C08_Ozet {


    /*
        Java'da data type kullanımını şu şekilde sınıflandırabiliriz

        1- Data türü ve constructor aynı ise

            objenin özellikleri ister VARIABLE, isterse METHOD olsun
            objenin oluşturulduğu class'dan aramaya başlanır
            parent'lara doğru devam edilir.
            ILK BULUNAN DEGER kullanılır.

            Değer bulunamazsa CTE olur

        2- Data türü ve Cconstructor farklı olduğunda
        özelliğin VARIABLE veya METHOD olması farklı işleyiş gerektirir

            - Eğer VARIABLE ise
            data türünün olduğu class'dan aramaya başlayıp, parent'lara doğru devam ederiz
            ve ILK BULUNAN değeri kullanırız
            variable'ı bulamazsak CTE olur

            - Eğer METHOD ise
             data türünün olduğu class'dan aramaya başlayıp, parent'lara doğru devam ederiz
             eğer bulamazsak CTE olur

             method'u BULUNCA hemen kullanmayız,
             Constructor'ın olduğu class'a kadar daha güncel hali (Overriding Method) var mı diye bakılır
             EN GUNCEL değer kullanılır.


     */

}
