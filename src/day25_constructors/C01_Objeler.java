package day25_constructors;

public class C01_Objeler {

    public static void main(String[] args) {

        String str = new String("Java Candir");

        System.out.println(str.toUpperCase()); // JAVA CANDİR

        /*
            Burada eşitliğin sol tarafında bulunan String ==> kendisi bir class'dir
                                                          ==> str için düşünürsek,
                                                          String str'in oluşturulduğu class yani diğer adıyla str'ın data türüdür.

            str String class'inden oluşturulan bir objedir (tüm non primitive'lerin ortak adıdır)
            ve str String class'indaki tüm özelliklere (method'lar ve variable'ları) sahiptir

         */

    }

}
