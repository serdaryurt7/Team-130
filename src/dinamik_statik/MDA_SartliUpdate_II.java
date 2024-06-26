package dinamik_statik;

import java.util.Arrays;

public class MDA_SartliUpdate_II {

    public static void main(String[] args) {

        // Verilen iki katlı Multi dimentional array'de, elementleri içinde bulunduğu array'deki indexi kadar arttırın.

        int[][] arr = {{4, -1, -5}, {6, -9, 2}, {1, 5, -8, -4, 3, 6}};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = arr[i][j] + j;

            }

        }

        System.out.println(Arrays.deepToString(arr));

    }
}
