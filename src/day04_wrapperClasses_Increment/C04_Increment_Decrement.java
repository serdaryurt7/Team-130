package day04_wrapperClasses_Increment;

public class C04_Increment_Decrement {
    public static void main(String[] args) {

        int a = 10;

        // a nın değerini oluşturacağınız bir b variable'ına atayın sonra a' nın değerini bir arttırın.

        int b = a;
        a++;

        System.out.println("a : " + a + " b : " + b); // a : 11 b : 10

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        a = 10;
        // a nın değerini bir arttırın sonra a'nın değerini b'ye atayın
        a++;
        b = a;

        System.out.println("a : " + a + " b : " + b); // a : 11 b : 11

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        a = 10;
        // a'nın değerini yazdırın, sonra a'nın değerini 1 arttırın
        System.out.println("a'nin degeri" + a); // 10

        a++;

        // burada a'nın değeri : 11


        a = 10;
        // a'nın değerini 1 arttırın sonra a'nın değerini yazdırın

        a++;

        System.out.println("a'nin degeri" + a); // 11

    }
}
