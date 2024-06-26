package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class C09_NestedForLoop {
    public static void main(String[] args) {

        /*
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5

            Kullanıcıdan satır sayısını alıp şekli çizdirin.
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("satir sayisini giriniz...");
        int satir = scanner.nextInt();

        for (int i = 1; i <= satir; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");

            }

            System.out.println("");
        }


    }
}
