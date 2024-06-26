package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class C10_NestedLoop {
    public static void main(String[] args) {
        /*
            /*
            *
            * *
            * * *
            * * * *
            * * * * *

            Kullanıcıdan satır sayısını alıp şekli çizdirin.
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("satir sayisini giriniz...");
        int satir = scanner.nextInt();

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");

            }

            System.out.println("");

        }

    }
}
