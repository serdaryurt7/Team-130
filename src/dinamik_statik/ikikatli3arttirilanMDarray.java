package dinamik_statik;

import java.util.Arrays;

public class ikikatli3arttirilanMDarray {

    public static void main(String[] args) {

        // Verilen iki katlı bir int[] deki, tüm sayıları 3 arttırın.

        int[][] arr = {{3, 4, 6}, {9, 0}, {2, 5, 6, 8, 1}};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] += 3;

            }

        }

        System.out.println(Arrays.deepToString(arr));
    }

}
