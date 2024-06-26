package day33_inheritance;

public class C07_Vectra extends C06_Opel {

    C07_Vectra() {
        super();
        System.out.println("Vectra constructor calisti");
    }

    String strChild = "Vectra class Child";
    String model = "Vectra";

    public static void main(String[] args) {

        /*
            Bir class'dan obje oluşturup,
            o class'da var olan özellikleri edinebilmek için
            MUTLAKA bir CONSTRUCTOR çalışmalıdır

            extends keyword kullanan bir class'da her constructor'ın ilk satırında
            MUTLAKA bir constructor call bulunur

            EGER görünür bir constructor call yoksa
            Java default olarak super() constructor call koyar
            yani default olarak önce parent'daki
            parametresiz constructor'ın çalışmasını ister
         */

        C07_Vectra vectra = new C07_Vectra();

        System.out.println(vectra.strGP); // Car class.. GP
        System.out.println(vectra.strP); // Opel class.. P
        System.out.println(vectra.strChild); // Vectra class.. C
        System.out.println(vectra.marka); // Opel.. P
        System.out.println(vectra.model); // Vectra.. C


    }

}
