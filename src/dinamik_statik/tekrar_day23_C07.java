package dinamik_statik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tekrar_day23_C07 {

    public static void main(String[] args) {


        // bir öğretmenden öğrenci ismini ve notunu isteyin
        // öğretmen Q' ya bastığında işlemi bitirip
        // ortalama üzerinde not alan öğrencilerin isimlerini yazdırın

        // ipucu : isimleri ve notları ayrı 2 liste olarak tutun

        Scanner scanner = new Scanner(System.in);

        List<String> isimlerListesi = new ArrayList<>();
        List<Double> notlarListesi = new ArrayList<>();

        double girilenNot = 0;
        double notToplami = 0;
        String girilenIsim = "";

        while (!girilenIsim.equals("Q")) {

            System.out.println("Lutfen ogrenci ismini giriniz");

            girilenIsim = scanner.nextLine();

            if (!girilenIsim.equals("Q")) {

                isimlerListesi.add(girilenIsim);

                System.out.println("Lutfen ogrencinin notunu giriniz");

                girilenNot = scanner.nextDouble();

                scanner.nextLine();

                notToplami += girilenNot;

                notlarListesi.add(girilenNot);


            }

        }

        double ortalama = notToplami / notlarListesi.size();

        // elimizde notlarListesi ve isimlerListesi var, aynı index' deki isim ve not ilintili
        // notlarListesindeki notları gözden geçirip, ortalamanın üstünde olanların, önce ismini, yanına notunu yazdırın.

        System.out.println("Ortalama not: " + ortalama);
        System.out.println("Ortalamanin ustunde not alan ogrenciler");

        for (int i = 0; i < isimlerListesi.size(); i++) {

            if (notlarListesi.get(i) >= ortalama) {

                System.out.println(isimlerListesi.get(i) + " " + notlarListesi.get(i));

            }

        }


    }

}
