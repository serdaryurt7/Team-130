package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class C08_NestedForLoop {
    public static void main(String[] args) {

        /*
                 Kullanıcıdan satır ve sütun sayısını alıp aşağıdaki şekilde tablo oluşturun

                 * * * * *
                 * * * * *
                 * * * * *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("satir sayisini giriniz...");
        int satir = scanner.nextInt();
        System.out.println("her satirda kac yildiz olacagini giriniz");
        int sutun = scanner.nextInt();

        for (int i = 1; i <= satir; i++) {
            for (int j = 1; j <= sutun; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
