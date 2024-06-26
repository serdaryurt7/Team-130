package dinamik_statik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class day23_C07_OrtalamaUstundekiOgrenciler {

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

        while (!girilenIsim.toUpperCase().equals("Q")) {

            System.out.println("Lutfen ogrenci ismini girin");

            girilenIsim = scanner.nextLine();

            if (!girilenIsim.toUpperCase().equals("Q")) {

                isimlerListesi.add(girilenIsim);

                System.out.println("Lutfen ogrencinin notunu giriniz");

                girilenNot = scanner.nextDouble();

                notToplami += girilenNot;
                notlarListesi.add(girilenNot);

            }
        }

        double ortalama = notToplami / notlarListesi.size();

        // elimizde notlarListesi ve isimlerListesi var, aynı index' deki isim ve not ilintili
        // notlarListesindeki notları gözden geçirip, ortalamanın üstünde olanların, önce ismini, yanına notunu yazdırın.

    }
}
