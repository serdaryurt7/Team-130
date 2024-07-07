package day12_stringManipulations;

import java.util.Scanner;

public class C03_ReplaceAll {
    public static void main(String[] args) {
        // Kullanicidan bir metin isteyin, kullanıcının girdiği metinden space dışındaki tüm karakterleri ve sayıları silip,
        // metni yeni haliyle yazdırın.

        // input : "J1*a34_va+12 C87an.90d654ir,"  output : Java Candir

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen metni giriniz");
        String metin = scanner.nextLine();

        //önce sayılardan kurtulalım
        metin = metin.replaceAll("\\d","");

        // space'i koruma altına almak için herhangi bir rakamla replace yapalım
        metin = metin.replaceAll(" ","5");

        // özel karakterlerden kurtulalım
        metin = metin.replaceAll("\\W","");

        // _'yi yok edelim, sayı koyduğumuz space'i geri getirelim
        metin = metin.replace("_","").replaceAll("5"," ");

        System.out.println(metin);

    }
}
