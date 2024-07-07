package day04_wrapperClasses_Increment;

public class C05_preIncrement_postIncrement {
    public static void main(String[] args) {

        int a = 10;

        a++;

        System.out.println(" a'nin degeri " + a);

        a = 10;

        ++a;

        System.out.println(" a'nin degeri " + a);

        // Java da 3 farklı şekilde değer arttırma mümkün
        // 1- sayi = sayi + 1;
        // 2- sayi += 1;
        // 3- sayi++;

        // sadece 3. yöntem için java ihtiyaca göre kullanilabilmesi amacıyla iki farklı kullanım oluşturmuştur.

        // sayi++ yazabildiğimiz gibi ++ sayi' da yazabiliriz.

        int b = 10;
        System.out.println("++b yazdigimda konsolda yazdirilan : "+ ++b);  // 11
        System.out.println("++b' den 1 satir sonra konsolda b degeri : "+ b);  // 11

        int c = 10;
        System.out.println("++b yazdigimda konsolda yazdirilan : "+ c++);  // 10
        System.out.println("c++' dan 1 satir sonra konsolda c degeri : "+ c); // 11

        int x = 10;
        int y = x++;

        System.out.println("x : " + x + " y : " + y);  // x : 11,  y : 10

        x = 10;
        y = ++x;

        System.out.println("x : " + x + " y : " + y);  // x : 11, y : 11


    }
}
