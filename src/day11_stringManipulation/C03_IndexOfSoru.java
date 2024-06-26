package day11_stringManipulation;

import java.util.Scanner;

public class C03_IndexOfSoru {
    public static void main(String[] args) {

        // Kullanıcıdan bir cümle ve cümlede aranacak metin isteyin, cümle ve metni karşılaştırıp 3 durumdan birini yazdırın.
        // 1- Verilen metin cumlede kullanilmamis
        // 2- Verilen metin cumlede sadece bir kere kullanilmis
        // 3- Verilen metin cumlede 1' den fazla kez kullanilmis

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle yaziniz");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen cumlede aranacak metni giriniz");

        String metin = scanner.nextLine();

        if (!cumle.contains(metin)) {
            System.out.println("Verilen metin cumlede kullanilmamis");
        } else if (cumle.indexOf(metin)==cumle.lastIndexOf(metin)) {
            System.out.println("Verilen metin cumlede sadece bir kere kullanilmis");
        }else {
            System.out.println("Verilen metin cumlede 1' den fazla kez kullanilmis");
        }


    }
}
