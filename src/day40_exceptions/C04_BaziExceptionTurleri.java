package day40_exceptions;

public class C04_BaziExceptionTurleri {

    public static void main(String[] args) {

        // 1- NullPointerException
        // null olarak işaretlenen bir String, method ile kullanılırsa oluşur

        String str = null;
        System.out.println(str); // null
        System.out.println(str + 555); // null555

        // System.out.println(str.concat("555")); // NullPointerException

        // System.out.println(str.substring(1)); // NullPointerException

        // 2- StringIndexOutOfException
        // verilen String'de sınırların dışında index kullanılırsa

        str = "Java candir";
        // System.out.println(str.substring(15, 18)); // StringIndexOutOfBoundsException

        // 3 - ArrayIndexOutOfBounds Exception
        // verilen array'de sınırların dışında index kullanılırsa

        // 4- NumberFormatException
        // içinde sayı olmayan karakter barındıran bir String
        // Integer'a parse edilmeye çalışılırsa

        str = "12"; // "12*"

        // String olarak verilen sayının karesini yazdırın

        System.out.println(Integer.parseInt(str) * Integer.parseInt(str)); // 144

        // 5- ClassCastException cast edilmesi mümkün olmayan bir değeri
        // object üzerinden bir variable'a atamak isteyince oluşur

        Integer integer = 6;
        Object object = integer;
        String string = (String) object;

        System.out.println(string); //
    }

}
