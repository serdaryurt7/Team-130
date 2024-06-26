package dinamik_statik;

import java.util.Arrays;

public class MDA_SartliUpdate {

    public static void main(String[] args) {

        // Verilen iki katlı bir array'de, pozitif sayıların değerini 3 azaltıp, negatif sayıların değerini 4 arttırın

        int[][] arr = {{4, -1, -5}, {6, -9, 2}, {1, 5, -8, -4, 3, 6}};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] < 0) {

                    arr[i][j] += 4;

                } else if (arr[i][j] > 0) {

                    arr[i][j] -= 3;

                }

            }

        }

        System.out.println(Arrays.deepToString(arr));
        // [[1, 3, -1], [3, -5, -1], [-2, 2, -4, 0, 0, 3]]

    }
}
