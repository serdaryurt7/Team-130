package day12_stringManipulation;

import java.util.Scanner;

public class C09_StringManipulations {
    public static void main(String[] args) {
        // kullanıcıdan isim soyisim ve kredi kartı numarasını alın
        // gorunurIsim olarak S******** Y******* şeklinde sadece ilk harfler büyük harf olarak görünsün, diğer harfler * olsun
        // gorunur kart no : **** **** **** 1234 olsun

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scanner.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim = scanner.nextLine();
        System.out.println("Lutfen kart numaranizi bosluksuz 16 karakter olarak yazin");
        String kkNo = scanner.nextLine();

        String gorunurIsim = isim.substring(0, 1).toUpperCase()
                + isim.substring(1).replaceAll("\\w", "*")
                + " "
                + soyIsim.substring(0, 1).toUpperCase()
                + soyIsim.substring(1).replaceAll("\\S", "*");

        String gorunurKartNo = "**** **** **** " + kkNo.substring(kkNo.length() - 4);

        System.out.println(gorunurIsim + "\n" + gorunurKartNo);
    }
}
