package dinamik_statik;

public class CiftSayilariToplama {

    public static void main(String[] args) {

        // verilen int bir array'deki çift sayıların toplamını yazdırın

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, -8};
        int[] karr = {100, 200, 300, 401, 501, 601, 701, 800, 901};

        System.out.println(ciftSayilarinToplami(arr));
        System.out.println(ciftSayilarinToplami(karr));

    }

    public static int ciftSayilarinToplami(int[] arr) {

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {

                toplam += arr[i];

            }

        }

        return toplam;

    }

}
