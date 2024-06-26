package day07_ifElseStatements;

import java.util.Scanner;

public class C04_Bolunebilme {
    public static void main(String[] args) {

        // kullanıcıdan pozitif bir tamsayı alın
        // 3 ile bölünebiliyorsa "3'un kati"
        // 5 ile bölünebiliyorsa "5'in kati"
        // hem 5 hem 3 ile bölünebiliyorsa "super sayi" yazdirin


        /*

        Eğer şartlar birbiri ile ilgili ise en önce en seçici olanı yazmalıyız (sayi % 5 == 0 && sayi % 3 == 0)

        Eğer ifade else ile bitmezse if else statement tüm değerleri KAPSAMIYOR demektir yani
        bazı değerleri girdiğimizde kod çalışır ama hiç bir sonuç üretmez

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        if (sayi % 5 == 0 && sayi % 3 == 0) {
            System.out.println("super sayi");
        } else if (sayi % 5 == 0) {
            System.out.println("5'in kati");
        } else if (sayi % 3 == 0) {
            System.out.println("3'un kati");
        }
    }
}
