package day05_concatenation_operatorler;

import java.util.Scanner;

public class C03_And_Or {
    public static void main(String[] args) {

        // kullanıcıdan gelen notun 0 ile 100 arasında ise true degilse false yazdır. 0 ve 100 dahil.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");

        int not = scanner.nextInt();

        System.out.println(not >= 0 && not <= 100);


        // not 50 den küçükse veya 80'den büyükse true // arasında değilse false yazdırın.

        System.out.println(not < 50 || not > 80); // istenen durum

        // once istenmeyen durumu yazalim, sonra başına ! koyalım
        System.out.println(!(not >= 50 && not <= 80)); // istenmeyen durum

    }
}
