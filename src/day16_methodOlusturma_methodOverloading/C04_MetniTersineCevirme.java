package day16_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C04_MetniTersineCevirme {
    public static void main(String[] args) {

        // verilen bir metni tersine çevirip bize döndüren bir method oluşturun.

        // "Java ile kod yaz" cümlesini tersten yazdırın

        metniTerseCevir("Java ile kod yaz");

        // kullanıcıdan bir kelime isteyip, palindrome olup olmadığını yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String str = scanner.nextLine();

        if (str.equalsIgnoreCase(metniTerseCevir(str))){
            System.out.println("Verilen metin palindrome");
        }else {
            System.out.println("Verilen metin palindrome degil");
        }


    }

    public static String metniTerseCevir(String metin) {

        String tersMetin = "";

        for (int i = metin.length() - 1; i >= 0; i--) {

            tersMetin = tersMetin + metin.substring(i, i + 1);

        }

        return tersMetin;
    }
}
