package dinamik_statik;

import java.util.Scanner;

public class statik {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String metin = scanner.nextLine();

        char karakter = metin.charAt(14);

        System.out.println(karakter);

    }
}
