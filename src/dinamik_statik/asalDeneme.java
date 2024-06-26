package dinamik_statik;

import java.util.Scanner;

public class asalDeneme {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int sayac;
        int sayi = scanner.nextInt();

        for (int i = 1; i <= sayi; i++) {

            if (sayi % i == 0) {

                System.out.println(i + " ");
            }

        }


    }
}
