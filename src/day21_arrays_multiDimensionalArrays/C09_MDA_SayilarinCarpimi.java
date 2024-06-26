package day21_arrays_multiDimensionalArrays;

public class C09_MDA_SayilarinCarpimi {
    public static void main(String[] args) {

        // Soru 4- Verilen iki katlı bir array' de bulunan tüm sayıların çarpımını bize döndüren bir method oluşturun.

        int[][] arr = {{4, -1, -5}, {6, -9, 2}, {1, 5, -8, -4, 3, 6}};

        System.out.println(elementlerinCarpimi(arr)); // -6220800


    }

    public static int elementlerinCarpimi(int[][] arr) {

        int carpim = 1;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                carpim = carpim * arr[i][j];

            }
        }

        return carpim;
    }
}
