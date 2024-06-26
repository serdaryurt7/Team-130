package day11_stringManipulation;

public class C05_nullPointer {
    public static void main(String[] args) {

        String str;

        // System.out.println(str);

        // bir variable'i değer atamadan oluşturabilirsiniz ama değer atamadan kullanamazsınız.

        String str2 = "";

        System.out.println("Str2' in degeri : " + str2 + "====");

        System.out.println("Str2' in uzunlugu : " + str2.length()); // 0

        // str2 ye "" atayabiliriz, başka data türlerinde hiçlik atama şansı da olmaz
        // ama bu durumda Java bu variable'a bir değer atandığını kabul eder
        // değer atanmamış elementleri say dediğimizde "" değeri atananları dolu kabul eder

        // null pointer Java tarafindan özel bir görev ile oluşturulmuştur
        // bir variable'ın değer atanmamış olduğunu işaretler
        // null bir değer değil işaretçidir

        String str3 = null;

        System.out.println(str3); // null

        // null primitive variable'lara yazılamaz sadece non-primitive'lere yazılır.

        System.out.println(str3 + "Java"); //nullJava

        // null olarak işaretlenen variable'lar SADECE yazdırılabilir
        // değer atamadan başka bir işle yapmak isterseniz // NullPointerException verir

        // System.out.println(str3.length()); // NullPointerException

        // System.out.println(str3.concat("Java")); // NullPointerException







        String str4 = "123";
        System.out.println(Integer.parseInt(str4) + 5);

    }
}
