package day27_constructorCall;

public class C01_ConstructorCall {

    /*
        Bazen bir constructor'ın içinden başka bir constructor çağrılabilir
        Eğer constructorIsmi(parametre) yazarsanız
        Java bu syntax'in method call olduğunu söyler ve bu isimde method arar
        bulamadığı için de CTE verir

        Eğer constructor Call yapmak istiyorsanız constructor'ın adı yerine this yazarız
        yani this(parametre) yazdığımızda java bunun constructor call olduğunu anlar
     */

    int sayi = 20;
    String isim = "Ali";

    C01_ConstructorCall() {
        // C01_ConstructorCall(22); // Method call expected
        this(22);
        sayi = 15;
    }

    C01_ConstructorCall(int sayi) {

        this(34, "Sedat");
        this.sayi = sayi;
    }

    C01_ConstructorCall(int sayi, String isim) {

        this.sayi = 40;
        this.isim = isim;
    }

    public static void main(String[] args) {

        C01_ConstructorCall obj = new C01_ConstructorCall();
        System.out.println(obj.isim + ", " + obj.sayi);

    }

}
