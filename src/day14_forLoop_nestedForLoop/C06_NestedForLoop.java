package day14_forLoop_nestedForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {

        // loop ile 1 2 3 4 yazdırın

        for (int i = 1; i < 5; i++) {

            System.out.print(1 * i + " ");
        }

        System.out.println("");

        // loop ile 2 4 6 8 yazdırın

        for (int i = 1; i < 5; i++) {

            System.out.print(2 * i + " ");
        }

        System.out.println("");

        for (int i = 1; i < 5; i++) {

            System.out.print(3 * i + " ");

        }

        System.out.println("");

        /*
                 for loop kullanarak
                     1 2 3 4
                     2 4 6 8
                     3 6 9 12
                    yazdırın


                    Eğer yazdirmamiz istenen şekil dikdörtgen biçiminde ise iç içe for loop oluştururuz
                    Dışarıdaki loop satırları kontrol eder. (bu soruda 3 satır var)
                    içerideki loop ise her satırdaki sütunları kontrol eder (bu soruda her satırda 4 sütun var)
         */

        System.out.println("====================");

        for (int i = 01; i <= 3; i++) {  // satırlar

            for (int j = 1; j <= 4; j++) { // satırdaki sütunlar

                System.out.print(i * j + " ");

            }
            System.out.println("");

        }


    }

}
