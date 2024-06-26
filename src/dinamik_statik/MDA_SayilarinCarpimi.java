package dinamik_statik;

public class MDA_SayilarinCarpimi {

    public static void main(String[] args) {

        // Verilen 2 katlı bir array'de bulunan tüm sayıların çarpımını bize döndüren bir method oluşturun.

        int[][] arr = {{4, -1, -5}, {6, -9, 2}, {1, 5, -8, -4, 3, 6}};

        System.out.println(sayilarinCarpimi(arr));


    }

    public static int sayilarinCarpimi(int[][] arr) {


        int carpim = 1;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                carpim = carpim * arr[i][j];

            }

        }

        return carpim;

    }

}
